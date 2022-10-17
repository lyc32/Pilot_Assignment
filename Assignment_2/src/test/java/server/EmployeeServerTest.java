package server;
import com.pilot.humanresource.dao.EmployeeRepository;
import com.pilot.humanresource.model.Employee;
import com.pilot.humanresource.server.EmployeeServer;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeServer.class)
public class EmployeeServerTest
{
    @MockBean
    EmployeeRepository employeeRepository;

    @Autowired
    EmployeeServer employeeServer;

    @Before
    public void beforeTest()
    {
        System.out.println("EmployeeServer Test: started");
    }

    @After
    public void afterTest()
    {
        System.out.println("EmployeeServer Test: end\n");
    }

    @Test
    public void testGetEmployeeByID() throws ParseException {
        System.out.println("Test EmployeeServer.GetEmployeeByID started");
        int id = 7839;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        java.util.Date date = sdf.parse("17-11-1981");
        java.sql.Date sqlDate = new Date(date.getTime());
        Employee mockEmployee = new Employee(7839, "KING", "PRESIDENT", (Integer) null, sqlDate, 5000.0, 10);
        when(employeeRepository.getEmployeeByID(id)).thenReturn(mockEmployee);
        Employee employee = employeeServer.getEmployeeByID(id);
        Assert.assertEquals(7839, (int)employee.getEmpid());
        Assert.assertEquals("KING",employee.getName());
        Assert.assertEquals("PRESIDENT", employee.getJob());
        Assert.assertEquals(5000.0, (double)employee.getSalary(), 0.0);
        Assert.assertEquals(10, (int)employee.getDeptid());
        Assert.assertEquals(null, employee.getManager());
        Assert.assertEquals(sqlDate, employee.getHiredate());
        System.out.println("Test EmployeeServer.GetEmployeeByID end");
    }

    @Test
    public void testGetAllEmployees() throws ParseException
    {
        System.out.println("Test EmployeeServer.GetAllEmployeess started");
        List<Employee> mockEmployeesList = new ArrayList<>();

        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        java.util.Date date = sdf.parse("17-11-1981");
        java.sql.Date sqlDate = new Date(date.getTime());
        Employee mockEmployee = new Employee(7839, "KING", "PRESIDENT", (Integer) null, sqlDate, 5000.0, 10);

        mockEmployeesList.add(mockEmployee);
        when(employeeRepository.getAllEmployees()).thenReturn(mockEmployeesList);
        List<Employee> employeesList = employeeServer.getAllEmployees();
        Assert.assertEquals(mockEmployeesList.size(), employeesList.size());
        System.out.println("Test EmployeeServer.GetAllEmployees end");
    }

    @Test
    public void testAddEmployee() throws ParseException
    {
        System.out.println("Test EmployeeServer.AddEmployee started");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        java.util.Date date = sdf.parse("17-11-1981");
        java.sql.Date sqlDate = new Date(date.getTime());
        Employee mockEmployee = new Employee(7839, "KING", "PRESIDENT", (Integer) null, sqlDate, 5000.0, 10);
        when(employeeRepository.addEmployee(mockEmployee)).thenReturn(1);
        int success = employeeServer.addEmployee(mockEmployee);
        Assert.assertEquals(1, success);
        System.out.println("Test EmployeeServer.AddEmployee end");
    }

    @Test
    public void testUpdateEmployeeByID() throws ParseException
    {
        System.out.println("Test EmployeeServer.UpdateEmployeeByID started");
        int id = 7839;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        java.util.Date date = sdf.parse("17-11-1981");
        java.sql.Date sqlDate = new Date(date.getTime());
        Employee mockEmployee = new Employee(7839, "KING", "PRESIDENT", (Integer) null, sqlDate, 5000.0, 10);
        when(employeeRepository.updateEmployeeByID(7839, mockEmployee)).thenReturn(1);
        int success = employeeServer.updateEmployeeByID(7839, mockEmployee);
        Assert.assertEquals(1, success);
        System.out.println("Test EmployeeServer.UpdateEmployeeByID end");
    }

    @Test
    public void testDeleteEmployeeByID()
    {
        System.out.println("Test EmployeeServer.UpdateEmployeeByID started");
        int id = 7839;
        when(employeeRepository.deleteEmployeeByID(id)).thenReturn(1);
        int success = employeeServer.deleteEmployeeByID(id);
        Assert.assertEquals(1, success);
        System.out.println("Test EmployeeServer.UpdateEmployeeByID end");
    }
}
