/*
    Method exercises attempts

    Name: Jean-Kenneth Antonio
    Date:November 1, 2019
    File: Methods.java

 */

package method_exercises;

public class Methods
{
    public static void main(String[] args)
    {
        System.out.println("--------Problem 3---------");

        //problem 3
        americanFlag();

        System.out.println("--------Problem 4---------");

        //problem 4
        Methods computeObj = new Methods();
        System.out.println(computeObj.compute(1));
        System.out.println(computeObj.compute(3));
        System.out.println(computeObj.compute(-5));

        System.out.println("--------Problem 5---------");

        //problem 5
        Methods prime = new Methods();
        System.out.println(prime.isPrime(1));
        System.out.println(prime.isPrime(3));
        System.out.println(prime.isPrime(80));
        System.out.println(prime.isPrime(71));

        System.out.println("--------Problem 10---------");

        //problem 10
        Methods multTable = new Methods();
        multTable.table(5);

        System.out.println("--------Problem 12---------");

        //problem 12
        numLoop();

        System.out.println("--------Problem 14---------");

        //problem 14
        Methods quad = new Methods();
        System.out.println(quad.quadratic(1, 1 , 1 ,2 ));
        System.out.println(quad.quadratic(3, 2 , 1 ,2 ));
        System.out.println(quad.quadratic(-2, 4 , 3 ,3 ));

        System.out.println("--------Problem 15---------");

        //problem 15
        Methods info = new Methods();
        info.information(0.55);
        info.information(3);
        info.information(0);
        info.information(-65784000);

        System.out.println("--------Problem 18---------");

        //problem 18
        Methods numType = new Methods();
        numType.whatTypeOfNumber(10);
        numType.whatTypeOfNumber(0);
        numType.whatTypeOfNumber(-112);


        System.out.println("--------Problem 20---------");

        //problem 20
        Methods ordering = new Methods();
        ordering.inOrder(-10, 0, 33);
        ordering.inOrder(2, 2, 2);
        ordering.inOrder(3, 1, -10);

        System.out.println("--------Problem 22---------");

        //problem 22
        Methods within = new Methods();
        System.out.println(within.within(10,20,15));
        System.out.println(within.within(1,10,10));
        System.out.println(within.within(3,5,3));
    }



    //problem 3 method
    public static void americanFlag()
    {
        int lineCount = 0;
        //row
        for (int i = 0; i < 15; i++)
        {
            //columns
            //six star line
            if (i % 2 == 0 && lineCount < 10)
            {

                for (int j = 0; j < 6; j++)
                {
                    System.out.print("* ");
                }
            }
            //5 star line
            else if (i % 2 == 1 && lineCount < 9)
            {
                for (int j = 0; j < 5; j++)
                {
                    System.out.print(" *");
                }
                System.out.print("  ");
            }
            else
            {
                //stripes under stars
                for (int j = 0; j < 12; j++)
                {
                    System.out.print("=");
                }
            }
            //finishing the stripes
            for (int j = 0; j < 34; j++)
            {
                System.out.print("=");
            }
            System.out.println();
            lineCount++;
        }
    }

    //problem 4
    public int compute(int n)
    {
        n = n + (int)(Math.pow(n , 2)) + (int)(Math.pow(n, 3));

        return n;
    }

    //problem 5
    public boolean isPrime(int n)
    {
        boolean isPrime = false;

        for (int i = 0; i <= n / 2; i++)
        {
            //0 and 1 are not prime
            if (n == 1 || n == 0)
            {
                return false;
            }
            //2 is prime
            else if (n == 2)
            {
                isPrime = true;
            }
            else
            {
                //every number before the inputted number is check for divisibility
                for (int j = 2; j <= n - 1; j++)
                {
                    if ((n % j == 0)){
                        return false;
                    }
                    isPrime = true;
                }
            }
        }
        return isPrime;
    }

    //problem 10
    public void table(int input)
    {
        // cycles the int through multiplying numbers 0 to 10
        for (int i = 0; i <= 10; i++)
        {
            System.out.println(input + " X " + i + " = " + (i * input));
        }
    }

    //problem 12
    public static void numLoop()
    {
        for (int i = 1; i <= 4 ; i++)
        {
            for (int j = -1; j < i - 1; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    //problem 14
    public double quadratic(double a, double b, double c, double x)
    {
        double result = (a * Math.pow(x, 2) + (b * x) + c);

        return result;
    }

    //problem 15
    public void information(double number)
    {
        if (number > 0)
        {

            if (Math.abs(number) < 1.0)
            {
                System.out.println("positive, small");
            }
            else if (Math.abs(number) > 1000000)
            {
                System.out.println("positive, large");
            }
            else
            {
                System.out.println("positive");
            }
        }
        else if (number < 0)
        {
            if (Math.abs(number) < 1.0)
            {
                System.out.println("negative, small");
            }
            else if (Math.abs(number) > 1000000)
            {
                System.out.println("negative, large");
            }
            else
            {
                System.out.println("negative");
            }
        }
        else
        {
            System.out.println("zero");
        }

    }

    //problem 18
    public void whatTypeOfNumber(double number)
    {
        if (number > 0)
        {
            System.out.println("positive");
        }
        else if (number < 0)
        {
            System.out.println("negative");
        }
        else
        {
            System.out.println("zero");
        }
    }

    //problem 20
    public void inOrder(double first, double second, double third)
    {
        if (first < second && second < third)
        {
            System.out.println("increasing");
        }
        else if (first > second && second > third)
        {
            System.out.println("decreasing");
        }
        else
        {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    //problem 22
    public boolean within(int lower, int upper, int number)
    {
        return number >= lower && number < upper;
    }
}
