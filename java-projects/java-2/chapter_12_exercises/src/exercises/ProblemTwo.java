package exercises;

public class ProblemTwo
{
    public static void main(String[] args)
    {
        writeNums(5);
        System.out.println();
        writeNums(12);
    }

    private static void writeNums(int n)
    {
        if (n < 1)
        {
            throw new IllegalArgumentException("Value cannot be less than 1!");
        }
        else if (n == 1)
        {
            System.out.print(n);
        }
        else
        {
            writeNums(n - 1);
            System.out.print(", " + n);
        }
    }
}
