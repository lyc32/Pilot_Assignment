class CardTypeException extends Exception
{
    CardTypeException(String string)
    {
        System.out.println("cardType is \"" + string + "\".");
    }
}

class AddressException extends Exception
{
    AddressException(String string)
    {
        System.out.println("Address: " + string + " is outside US.");
    }
}

class ExceptionHandler
{
    public void handleException(String cardType, String address) throws CardTypeException, AddressException
    {
        try
        {
            try
            {
                if(cardType.equals("AMEX"))
                {
                    throw new CardTypeException(cardType);
                }

            }catch(CardTypeException exception)
            {
                System.out.println(exception);
            }

            try
            {
                if(!address.equals("US"))
                {
                    throw new AddressException(address);
                }
            }
            catch (AddressException exception)
            {
                System.out.println(exception);
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}

public class ExceptionHandling_problem
{
    public static void main(String[] args) throws CardTypeException, AddressException
    {
        ExceptionHandler e = new ExceptionHandler();
        System.out.println("#1");
        e.handleException("AMEX","US");
        System.out.println("#2");
        e.handleException("BOA","CN");
        System.out.println("#3");
        e.handleException("AMEX","CN");
    }
}
