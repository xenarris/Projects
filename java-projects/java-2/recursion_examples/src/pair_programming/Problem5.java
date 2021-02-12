package pair_programming;

public class Problem5
{
    public static void main(String[] args)
    {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
        System.out.println(countHi("xxhxixx"));
    }
    public static int countHi(String check)
    {
        if (check.contains("hi"))
        {
            check = check.replaceFirst("hi","");
            return countHi(check)+1;
        }
        else {
            return 0;
        }

    }

}
