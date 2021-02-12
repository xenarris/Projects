package pair_programming;

public class Problem2
{
    public static void main(String[] args)
    {
        System.out.println(bunnyEars(0));
        System.out.println(bunnyEars(1));
        System.out.println(bunnyEars(2));
    }
    public static int bunnyEars(int numBunnies)
    {
        if(numBunnies<= 0)
        {
            return 0;
        }
        if(numBunnies==1)
        {
            return 2;
        }

        return 2+bunnyEars(numBunnies-1);
    }
}
