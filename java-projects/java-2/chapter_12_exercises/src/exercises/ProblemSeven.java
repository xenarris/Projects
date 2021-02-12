package exercises;

public class ProblemSeven
{
    public static void main(String[] args)
    {
        writeChars(1);
        System.out.println();
        writeChars(2);
        System.out.println();
        writeChars(3);
        System.out.println();
        writeChars(4);
        System.out.println();
        writeChars(5);
        System.out.println();
        writeChars(6);
        System.out.println();
        writeChars(7);
        System.out.println();
        writeChars(8);
        System.out.println();
    }

    private static void writeChars(int n)
    {
        if (n < 1)
        {
            throw new IllegalArgumentException("Cannot be less than 1");
        }
        else if (n == 1)
        {
            System.out.print("*");
        }
        else if (n == 2)
        {
            System.out.print("**");
        }
        else
        {
            System.out.print("<");
            writeChars(n - 2);
            System.out.print(">");
        }

    }
}
