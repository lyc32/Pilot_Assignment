import java.io.*;

class Employee implements Serializable
{
    private static final long serialVersionUID = 1L;
    private String name;
    private String birthday;
    private int salary;
    private transient String SSN;

    Employee(String name, String birthday, int salary, String SSN)
    {
        this.name = name;
        this.birthday = birthday;
        this.salary = salary;
        this.SSN = SSN;
    }

    public void printEmployee()
    {
        System.out.println("Name: " + this.name);
        System.out.println("Birthday: " + this.birthday);
        System.out.println("Salary: $" + this.salary);
        System.out.println("SSN: " + this.SSN + "\n");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }
}

public class Serializable_problem
{
    public static void main(String[] args) throws IOException
    {
        Employee employee = new Employee("tony", "1990-10-10", 5400, "123-123-1234");
        String filename = "test.txt";
        // Serialization
        System.out.println("##Serialization##");
        employee.printEmployee();
        try
        {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(employee);
            out.close();
            file.close();
        }
        catch (IOException ex)
        {
            System.out.println("IOException is caught");
        }

        employee = null;


        //Deserialization
        try
        {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            employee = (Employee)in.readObject();
            in.close();
            file.close();
            System.out.println("##Deserialization##");
            employee.printEmployee();
        }
        catch (IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException" + " is caught");
        }
    }
}
