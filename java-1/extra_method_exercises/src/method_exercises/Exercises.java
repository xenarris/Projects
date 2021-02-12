/*
    Method problems 1,2,6,7,8,9,11,13,16,17,19,21,23,24,25

    Name: Jean-Kenneth Antonio
    Date: December 10, 2019
    File: Exercises.java
 */

package method_exercises;

import java.util.Random;

public class Exercises
{
    public static void main(String[] args)
    {
        //problem 1 averaging numbers
        System.out.println("----------------Problem 1----------------");
        Exercises average = new Exercises();
        System.out.println(average.average(10,10,10,10));
        System.out.println(average.average(10,20,30,40));
        System.out.println(average.average(-10,-11,-7,-8));
        System.out.println();

        //problem 2 print 10x10 multiplication table
        System.out.println("----------------Problem 2----------------");
        Exercises multTable = new Exercises();
        multTable.printMultTable();

        //problem 6 print 1 - 100, divisible by 3,5,and both
        System.out.println("----------------Problem 6----------------");
        printDivNumbers();
        System.out.println();

        //problem 7 print calculate sum of 2 int and compare to 3rd int
        System.out.println("----------------Problem 7----------------");
        Exercises sumAndCompare = new Exercises();
        System.out.println(sumAndCompare.sumAndCompare(3, -4, 0));
        System.out.println(sumAndCompare.sumAndCompare(7, 3, 10));
        System.out.println(sumAndCompare.sumAndCompare(10, -4, 6));
        System.out.println();

        //problem 8 convert milliseconds to seconds, minutes, and hours and print
        System.out.println("----------------Problem 8----------------");
        Exercises time = new Exercises();
        time.time(60000);
        System.out.println();
        time.time(3600000);

        //problem 9 accept 3 int return true if one is 20 or more less than one of the others and print
        System.out.println("----------------Problem 9----------------");
        Exercises twentyMore = new Exercises();
        System.out.println(twentyMore.twentyOrMore(10, 25, 8));
        System.out.println(twentyMore.twentyOrMore(16, 32, 4));
        System.out.println(twentyMore.twentyOrMore(-5, 10, -15));
        System.out.println();

        //problem 11 method to print pattern 1/n 12/n 123/n 1234/n ...
        System.out.println("----------------Problem 11---------------");
        displayPattern();
        System.out.println();

        //problem 13 print diamond asterisks pattern
        System.out.println("----------------Problem 13---------------");
        displayDiamond();
        System.out.println();
        
        //problem 16 method that returns number of days in month
        System.out.println("----------------Problem 16---------------");
        Exercises days = new Exercises();
        System.out.println(days.daysInMonth("March"));
        System.out.println(days.daysInMonth("February"));
        System.out.println(days.daysInMonth("Apple"));
        System.out.println();

        //problem 17 displays perfect squares up to an integer
        System.out.println("----------------Problem 17---------------");
        Exercises squares = new Exercises();
        squares.perfectSquares(10);
        System.out.println();
        squares.perfectSquares(30);
        System.out.println();


        //problem 19 compare 2 numbers if all equal, all different, or neither
        System.out.println("----------------Problem 19---------------");
        Exercises compareThree = new Exercises();
        compareThree.comparisons(10, -30, 20);
        compareThree.comparisons(1, 1, 1);
        compareThree.comparisons(3, 7, 3);
        System.out.println();

        //problem 21 return boolean if a power of 4
        System.out.println("----------------Problem 21---------------");
        Exercises powerFour = new Exercises();
        System.out.println(powerFour.powerOfFour(10));
        System.out.println(powerFour.powerOfFour(4));
        System.out.println(powerFour.powerOfFour(16));
        System.out.println(powerFour.powerOfFour(64));

        //problem 23 compare 2 int and return based on negativity or 0
        System.out.println("----------------Problem 23---------------");
        Exercises compareTwo = new Exercises();
        System.out.println(compareTwo.comparison(20, 20));
        System.out.println(compareTwo.comparison(-1, 10));
        System.out.println(compareTwo.comparison(5, 0));

        //problem 24 method to print the area and circumference of a circle
        System.out.println("----------------Problem 24---------------");
        Exercises print = new Exercises();
        print.printCircle(1);
        print.printCircle(2);
        System.out.println();

        //problem 25 returns boolean if washingtonian
        System.out.println("----------------Problem 25---------------");
        Exercises natives = new Exercises();

        System.out.println(natives.isWashingtonian("rainy", true, "happy"));
        System.out.println(natives.isWashingtonian("hot", false, "grumpy"));
        System.out.println(natives.isWashingtonian("sunny", true, "ambivalent"));
        System.out.println(natives.isWashingtonian("sunny", false, "caffeinated"));
    }

    //problem 1 averaging numbers
    public double average(double first, double second, double third, double fourth)
    {
        double average = ((first + second + third + fourth)/ 4);
        return average;
    }

    //problem 2 print 10x10 multiplication table
    public void printMultTable()
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
            {
                System.out.print(i * j);
                if (i*j < 10)
                {
                    System.out.print("   ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    //problem 6 print 1 - 100, divisible by 3,5,and both
    public static void printDivNumbers()
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                System.out.println(i + " is divisible by both 3 and 5");
            }
            else if (i % 3 == 0)
            {
                System.out.println(i + " is divisible by 3");
            }
            else if (i % 5 == 0)
            {
                System.out.println(i + " is divisible by 5");
            }

        }
    }

    //problem 7 calculate sum of 2 int and compare to 3rd int
    public boolean sumAndCompare(int first, int second, int compare)
    {
        int sum = first + second;
        return sum == compare;
    }

    //problem 8 convert milliseconds to seconds, minutes, and hours and print
    public void time(int milliseconds)
    {
        int seconds = milliseconds / 1000;
        int minutes = seconds / 60;
        int hours = minutes / 60;

        System.out.println(seconds + " seconds");
        System.out.println(minutes + " minutes");
        System.out.println(hours + " hours");
    }
    //problem 9 accept 3 int return true if one is 20 or more less than one of the others
    public boolean twentyOrMore(int first, int second, int third)
    {
        if (Math.abs(first - second) >= 20 ||
                Math.abs(first - third) >= 20 ||
                Math.abs(second - third) >= 20)
        {
            return true;
        }
        return false;
    }
    //problem 11 method to display pattern 1/n 12/n 123/n 1234/n ...
    public static void displayPattern()
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    //problem 13 display diamond asterisks pattern
    public static void displayDiamond()
    {
        for (int i = -6; i <= 6; i++)
        {
            for (int j = 1; j <= Math.abs(i); j++)
            {
                System.out.print(" ");
            }
            for (int j = 6; j >= Math.abs(i); j-- )
            {
                System.out.print("*");
            }
            for (int j = 5; j >= Math.abs(i); j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    //problem 16 method that returns number of days in month
    public int daysInMonth(String month)
    {
        //arrays with months
        String[] oddMonths =
                {
                     "january",
                     "march",
                     "may",
                     "july",
                     "august",
                     "october",
                     "december"
                };
        String[] evenMonths =
                {
                     "april",
                     "june",
                     "september",
                     "november"
                };


        month = month.toLowerCase();

        for (int i = 0; i < oddMonths.length; i++)
        {
            if (month.equals(oddMonths[i]))
            {
                return 31;
            }
            else if (month.equals("february"))
            {
                return 28;
            }
        }

        for (int i = 0; i < evenMonths.length; i++)
        {
            if (month.equals(evenMonths[i]))
            {
                return 30;
            }
        }
     return -1;
    }

    //problem 17 displays perfect squares up to an integer
    public void perfectSquares(int max)
    {
        int iterations = 0;
        int results = 0;
        while (results < max)
        {
            iterations++;
            results = (int) Math.pow(iterations, 2);
            if (results < max)
            {
                System.out.println(iterations + " * " + iterations +
                        " = " + results);
            }
        }
    }

    //problem 19 compare 2 numbers if all equal, all different, or neither
    public void comparisons(double first, double second, double third)
    {
        if (first == second && second == third)
        {
            System.out.println("All are equal");
        }
        else if (first != second && second != third && first != third)
        {
            System.out.println("All are different");
        }
        else
        {
            System.out.println("Neither all are equal or different");
        }
    }
    //problem 21 returns a boolean if it is a power of 4
    public boolean powerOfFour(double check)
    {
        double result = check;
        do
        {
            result = result / 4;
        }
        while (result >= 2);

        return result == 1;
    }

    //problem 23 compare 2 int and return based on negativity or 0
    public int  comparison(int first, int second)
    {
        Random random = new Random();
        if (first < second)
        {
            return -Math.abs(random.nextInt());
        }
        else if (first > second)
        {
            return Math.abs(random.nextInt());
        }
        return 0;
    }

    //problem 24 method to print the area and circumference of a circle
    public void printCircle(double radius)
    {
        double pi = 3.14159;
        double circleArea = Math.pow(radius, 2) * pi;
        double circleCircumference = 2 * pi * radius;

        System.out.println("area = " + circleArea +
                ", Circumference = " + circleCircumference);
    }
    //problem 25
    public boolean isWashingtonian(String weather, boolean usingUmbrella, String mood)
    {
        if ((weather.equals("raining") && !usingUmbrella) ||
                (weather.equals("hot") && mood.equals("grumpy")) ||
                mood.equals("caffeinated"))
        {
            return true;
        }
        return false;
    }

}
