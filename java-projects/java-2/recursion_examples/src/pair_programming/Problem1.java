package pair_programming;

public class Problem1
{
    public static void main(String[] args)
    {
        System.out.println(powerN(3,3));
    }
    public static int powerN(int base, int power)
    {
        //any base greater than 0

        if(power<0)
        {
            throw new IllegalArgumentException("Garbage input");
        }
        if(power==0)
        {
            return 1;
        }

        int result = base * powerN(base, power -1);
        return result;
    }
}
