import java.util.Scanner;

public class Main
{

    private int numerator;
    private int denominator;
    private double quotient;

    public static void main(String[] args)
    {
       Main oneTime = new Main();
       oneTime.doIt();



    }
    public void doIt()
    {
        try
        {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter the numeratoe");
             numerator = keyboard.nextInt();
            System.out.println("Enter the denominator");
             denominator = keyboard.nextInt();
            if(denominator == 0)
                throw new DividingByZero();

            quotient = numerator/(double)denominator;
            System.out.println(numerator + "/" + denominator + " = " + quotient);

        }
        catch (DividingByZero e)
        {
            System.out.println(e.getMessage());
            giveSecondChance();

        }
    }
    public void giveSecondChance()
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Try Again");
        System.out.println("Enter numerator");
        numerator = keyboard.nextInt();
        System.out.println("Enter denominator:");
        denominator = keyboard.nextInt();

        if(denominator == 0)
        {
            System.out.println("I can not do division by zero");
            System.exit(0);
        }

        quotient = numerator/(double)denominator;
        System.out.println(numerator + "/" + denominator + " = " + quotient);

    }
}
