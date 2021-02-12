package exercises;

public class ProblemOne
{
    public static void main(String[] args)
    {
        starString(0);
        System.out.println();
        starString(1);
        System.out.println();
        starString(2);
        System.out.println();
        starString(3);
        System.out.println();
        starString(4);
    }

    private static void starString(int stars)
    {
        if (stars < 0)
        {
            throw new IllegalArgumentException("Value cannot be less than 0");
        }
        else if (stars == 0)
        {
            System.out.print("*");
        }
        else
        {
            starString(stars - 1);
            starString(stars - 1);
        }
    }
}
