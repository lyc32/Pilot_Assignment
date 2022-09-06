import java.io.Serializable;

// 1)	Create a singleton class called “AppleDesignerFactory”
class AppleDesignerFactory implements Serializable, Cloneable
{
    private static AppleDesignerFactory appleDesignerFactory;
    private  AppleDesignerFactory()
    {}

    public static synchronized AppleDesignerFactory getInstance()
    {
        if(appleDesignerFactory == null)
        {
            appleDesignerFactory = new AppleDesignerFactory();
        }
        return appleDesignerFactory;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

    protected Object readResolve()
    {
        return appleDesignerFactory;
    }
}

// 2) Create a factory pattern called “CurrencyExchange”
// which takes in the country name and return the currency object for that country.
abstract class CountryCurrency
{
    public abstract Object returnCountryCurrency();
}

class ChinaCurrency extends CountryCurrency
{
    @Override
    public Object returnCountryCurrency()
    {
        return "RMB";
    }
}
class UnitedStatesCurrency extends CountryCurrency
{
    @Override
    public Object returnCountryCurrency() {
        return "US.Dollar";
    }
}

class OtherCountryCurrency extends CountryCurrency
{
    @Override
    public Object returnCountryCurrency() {
        return "Unknown";
    }
}

class CurrencyExchange
{
    public CountryCurrency returnCountry(String input)
    {
        if(input.equals("China"))
        {
            return new ChinaCurrency();
        }
        else if(input.equals("UnitedStates"))
        {
            return new UnitedStatesCurrency();
        }
        else
        {
            return new OtherCountryCurrency();
        }
    }
}

public class DesignPattern_Problem
{
    public static void main(String[] args)
    {
        AppleDesignerFactory appleDesignerFactory = AppleDesignerFactory.getInstance();

        CurrencyExchange currencyExchange = new CurrencyExchange();
        CountryCurrency rmb = currencyExchange.returnCountry("China");
        System.out.println(rmb.returnCountryCurrency());
        CountryCurrency dollar = currencyExchange.returnCountry("UnitedStates");
        System.out.println(dollar.returnCountryCurrency());
        CountryCurrency jpn = currencyExchange.returnCountry("Japan");
        System.out.println(jpn.returnCountryCurrency());
    }
}
