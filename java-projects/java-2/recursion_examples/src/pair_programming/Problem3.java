package pair_programming;

public class Problem3
{
    public static void main(String[] args)
    {
        System.out.println(crazyBunnyEars(0));
        System.out.println(crazyBunnyEars(1));
        System.out.println(crazyBunnyEars(2));
        System.out.println(crazyBunnyEars(3));
        System.out.println(crazyBunnyEars(4));
    }
    public static int crazyBunnyEars(int numBunnies)
    {
        if(numBunnies<=0)
        {
            return 0;
        }
        if(numBunnies%2==1)
        {
            return 2 + crazyBunnyEars(numBunnies - 1);
        }
        else//(numBunnies%2==0)
        {
            return 3 + crazyBunnyEars(numBunnies -1 );
        }
        //return numBunnies+crazyBunnyEars(numBunnies-1);
    }
}
