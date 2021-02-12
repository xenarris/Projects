package pair_programming;

public class Problem4
{
    public static void main(String[] args)
    {
        System.out.println(checkParens("(())"));
        System.out.println(checkParens("(())()"));
        System.out.println(checkParens("(((x))"));
        System.out.println(checkParens("()"));
    }
    public static boolean checkParens(String check)
    {
        int start = 0;
        int end = 1;
        if(check.charAt(start)=='('&&check.charAt(check.length()-end)==')')
        {
            if (check.length() <= 2)
            {
                return true;
            }
            check = check.substring(1, check.length()-1);
            return checkParens(check);
        }
        else{
            return false;
        }
    }
}
