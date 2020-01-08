public class DividingByZero extends Exception
{
    public DividingByZero()
    {
        super("Dividing by zero");
    }
    public DividingByZero(String message)
    {
        super(message);
    }

}
