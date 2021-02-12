package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DriverProgram
{
    private static Scanner console = new Scanner(System.in);

    public static void main(String[] args)
    {
        double num = getDoubleFromConsole();
        double den = getDoubleFromConsole();

        try
        {
            System.out.println(CalculatorModule.divide(num,den));
        }
        catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());
        }

    }

    public static double getDoubleFromConsole()
    {
        double number = 0;
        boolean badInput = true;
        while (badInput)
        {
            try
            {
                System.out.println("Enter a number: ");
                number = console.nextDouble();
                badInput = false;

            }
            catch (InputMismatchException ex)
            {
                System.out.println("User input not recognized as a number!");
                console.nextLine(); // clear the buffer
            }
        }

        return number;
    }
}
