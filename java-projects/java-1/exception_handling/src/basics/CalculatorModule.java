package basics;

public class CalculatorModule
{
    public static double divide(double num, double den)
    {
        if (den != 0)
        {
            return num/den ;
        }

        //there isn't a good choice to return a value here
        //so we'll through exception
        throw new ArithmeticException("Cannot divide by zero - " + num + "/" + den);
    }
}
