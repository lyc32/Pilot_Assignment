import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.mysql.cj.jdbc.MysqlDataSource;
import oracle.jdbc.pool.OracleDataSource;

import java.sql.Connection;
import java.sql.SQLException;


// 1)	Define an interface “DatabaseConnection”
// and then define class “OracleConnection”, “MySqlConnection”, “SqlServerConnection”.
// They should all implements the “getConnection” method from the interface.
// The method should initialize data source and return a database connection.
interface DatabaseConnection
{ Connection getConnection() throws SQLException; }

class OracleConnection implements DatabaseConnection
{
    final public String url;
    final public String userName;
    final public String passWord;

    OracleConnection(String url, String userName, String passWord)
    {
        this.url = url;
        this.userName = userName;
        this.passWord = passWord;
    }
    //

    @Override
    public Connection getConnection() throws SQLException
    {
        OracleDataSource oracleDataSource = new OracleDataSource();
        oracleDataSource.setURL(this.url);
        oracleDataSource.setPassword(this.passWord);
        oracleDataSource.setUser(this.userName);
        return oracleDataSource.getConnection();
    }
}

class MySqlConnection implements DatabaseConnection
{
    final public String url;
    final public String userName;
    final public String passWord;

    MySqlConnection(String url, String userName, String passWord)
    {
        this.url = url;
        this.userName = userName;
        this.passWord = passWord;
    }

    @Override
    public Connection getConnection() throws SQLException
    {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        mysqlDataSource.setURL(this.url);
        mysqlDataSource.setPassword(this.passWord);
        mysqlDataSource.setUser(this.userName);
        return mysqlDataSource.getConnection();
    }
}

class SqlServerConnection implements DatabaseConnection
{
    final public String url;
    final public String userName;
    final public String passWord;
    SqlServerConnection(String url, String userName, String passWord)
    {
        this.url = url;
        this.userName = userName;
        this.passWord = passWord;
    }
    @Override
    public Connection getConnection() throws SQLException {
        SQLServerDataSource sqlServerDataSource = new SQLServerDataSource();
        sqlServerDataSource.setURL(this.url);
        sqlServerDataSource.setPassword(this.passWord);
        sqlServerDataSource.setUser(this.userName);
        return sqlServerDataSource.getConnection();
    }
}

// 2) Define an abstract class “CreditCard” which contains fields (holderName, cardNumber, accountBalance, cardType),
// and not-implemented method “isCardAcceptable” with argument cardType, and implemented method “payBill(double bill)”.
// Define two classes “VisaCard” and “MasterCard” both should inherit this “CreditCard” class
// and you should define constructor for both classes and implement the “isCardAcceptable” method.
// difference between abstract method and interface.

abstract class CreditCard
{
    String holderName;
    String cardNumber;
    double accountBalance;
    String cardType;

    public abstract boolean isCardAcceptable(String cardType);

    public double payBill(double bill)
    {
        this.accountBalance = this.accountBalance - bill;
        return accountBalance;
    }
}

class VisaCard extends CreditCard
{

    VisaCard(String holderName, String cardNumber, double accountBalance)
    {
        this.cardType = "VisaCard";
        this.accountBalance = accountBalance;
        this.holderName = holderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean isCardAcceptable(String cardType)
    {
        return true;
    }
}

class MasterCard extends CreditCard
{

    MasterCard(String holderName, String cardNumber, double accountBalance)
    {
        this.cardType = "MasterCard";
        this.accountBalance = accountBalance;
        this.holderName = holderName;
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean isCardAcceptable(String cardType)
    {
        if(this.cardType.equals(cardType))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

// 3) Implement static and dynamic polymorphism.
class add
{
    int plus(int a, int b)
    {
        return a+b;
    }

    double plus(double a, double b)
    {
        return a+b;
    }
}

class binAdd extends add
{
    @Override
    int plus(int a, int b)
    {
        if(a<0 && b<0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
