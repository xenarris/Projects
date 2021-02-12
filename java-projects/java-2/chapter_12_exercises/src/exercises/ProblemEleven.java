package exercises;

public class ProblemEleven
{
    public static void main(String[] args)
    {
        System.out.println(repeat("hello", 3));
        System.out.println(repeat("ok", 1));
        System.out.println(repeat("bye", 0));
    }

    private static String repeat (String s, int n)
    {
        if (n == 0)
        {
            return "";
        }
        else
        {
            return repeat(s, n - 1 ) + s;
        }
    }
}
