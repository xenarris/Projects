package exercises;

import java.sql.PreparedStatement;

public class ProblemEight
{
    public static void main(String[] args)
    {
        System.out.println(multiplyEvens(1));
        System.out.println(multiplyEvens(2));
        System.out.println(multiplyEvens(3));
        System.out.println(multiplyEvens(4));
    }

    private static int multiplyEvens(int n)
    {
        if (n <= 0)
        {
            throw new IllegalArgumentException("Cannot be less than 1");
        }
        else if (n == 1)
        {
            return 2;
        }
        else
        {
            return multiplyEvens(n - 1) * (n * 2);
        }
    }
}
