package examples;

public class RecursionExamples
{
    private static int methodCallCount;

    public static void main(String[] args)
    {

//        for (int i = 1; i <= 5 ; i++)
//        {
//            welcomeToProgram();
//        }

//        printDownToZero(5);
//        printEvensUpToOneHundred(-23);

//        String message = "Hello, World!";
//        printChars(message);

//        System.out.println("fac(3): " + factorial(3));
//        System.out.println("fac(4): " + factorial(4));
//        System.out.println("fac(5): " + factorial(5));
//        System.out.println("fac(10): " + factorial(10));
//        System.out.println("fac(15): " + factorial(15));
//        System.out.println("fac(20): " + factorial(20));
//        System.out.println("fac(30): " + factorial(30));
//        System.out.println("fac(50): " + factorial(50));
        //System.out.println(sumOfPositiveInts(5));

//        System.out.println("fib(0): " + fib(0));
//        System.out.println("fib(3): " + fib(3));
//        System.out.println("fib(5): " + fib(5));
//        System.out.println("fib(7): " + fib(7));
//        System.out.println("fib(10): " + fib(10));
//        System.out.println("fib(20): " + fib(20));
//        System.out.println("fib(50): " + fib(50));
        System.out.println("fib(100): " + fib(100));
    }

    public static int fib(int n)
    {
        if (n == 0 || n == 1)
        {
            return 1;
        }
        else
        {
            int fibNumber = fib(n - 1) + fib(n - 2);
            return fibNumber;
        }
    }


    public static int sumOfPositiveInts(int n)
    {
        if (n < 1)
        {
            throw new IllegalArgumentException("Positive inputs only!");
        }

        //base case
        if (n == 1)
        {
            return 1;
        }
        return n + sumOfPositiveInts(n - 1);
    }

    public static long factorial(int num)
    {
        //base case
        if (num < 0)
        {
            throw new IllegalArgumentException("Negative factorials don't exits");
        }

        //smallest factorial
        if (num == 0)
        {
            return 1;
        }

        //recursive call
        long result = num * factorial(num - 1);
        return result;
    }

    public static void printChars(String input)
    {
        //base case
        if (input.length() != 0)
        {
            //print a single character
            System.out.println(input.charAt(0));

            //recurse
            printChars(input.substring(1));
        }
    }

    public static void printDownToZero(int num)
    {
        // base case
        if (num < 0)
        {
            return; // stop calling the method
        }
        // do something... (print number)
        System.out.println(num);
        printDownToZero(num - 1);
    }

    public static void  printEvensUpToOneHundred(int start)
    {
        //base case
        if (start > 100)
        {
            return; //exit
        }

        //what if number is odd
        if(start % 2 != 0)
        {
            //change to even number
            start++;
        }

        System.out.println(start);
        printEvensUpToOneHundred(start + 2);

    }


    public static void foo()
    {
        methodCallCount++;
        System.out.println(methodCallCount);
        foo();
    }

    public static void welcomeToProgram()
    {
        String message = "Welcome to my program!";
        System.out.println(message);

        runProgam();
    }

    public static void runProgam()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.println(i);
        }
    }
}
