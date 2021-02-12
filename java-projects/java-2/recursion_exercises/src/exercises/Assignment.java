/*
    Jean-Kenneth Antonio
    February 5, 2020
    Assignment problems: 2, 5, 7, 8, 9, 10, 12
 */

package exercises;

/**
 * This contains Recursion problems 2, 5, 7, 8, 9, 10, 12 solution attempts
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */

public class Assignment
{
    /**
     * Main method with test cases
     *
     * @param args
     */
    public static void main(String[] args)
    {
        Assignment problem = new Assignment();

        //problem 2
        System.out.println(problem.vowels("are we there yet?"));
        System.out.println(problem.vowels("the moon"));
        System.out.println(problem.vowels("rhythm"));
        System.out.println(problem.vowels(""));

        System.out.println("------------------------");

        //problem 5
        System.out.println(problem.digitSum(17));
        System.out.println(problem.digitSum(5467));
        System.out.println(problem.digitSum(1));

        System.out.println("------------------------");

        //problem 7
        System.out.println(problem.duplicateNeighbors("abba"));
        System.out.println(problem.duplicateNeighbors("abcdbadba"));
        System.out.println(problem.duplicateNeighbors("bololobb"));
        System.out.println(problem.duplicateNeighbors("aabcdef"));
        System.out.println(problem.duplicateNeighbors("a"));

        System.out.println("------------------------");

        //problem 8
        problem.printChars("the");
        System.out.println();
        problem.printChars("hello");
        System.out.println();
        problem.printChars("");
        System.out.println();

        System.out.println("------------------------");

        //problem 9
        System.out.println(problem.removeAll("mellow yellow", "ello"));
        System.out.println(problem.removeAll("the moon was brooding", "o"));
        System.out.println(problem.removeAll("madam", "map"));
        System.out.println(problem.removeAll("barmy", "bar"));
        System.out.println(problem.removeAll("barfoo", "foo"));

        System.out.println("------------------------");

        //problem 10
        System.out.println(problem.asterisks("beatrice eats each plum", "ea"));
        System.out.println(problem.asterisks("catch 22", "22"));
        System.out.println(problem.asterisks("bee been in your bonnet", "be"));
        System.out.println(problem.asterisks("are we there yet?", "yes"));

        System.out.println("------------------------");

        //problem 12
        int num;
        problem.pyramid(2);
        System.out.println();
        problem.pyramid(3);
        System.out.println();
        problem.pyramid(5);


    }

    //problem 2

    /**
     * Problem 2  checking amount of vowels in string
     *
     * @param check the string to check
     * @return the number of vowels in the check string
     */
    public int vowels(String check)
    {
        if (!check.contains("a") && !check.contains("e") && !check.contains("i") && !check.contains("o")
                && !check.contains("u"))
        {
            return 0;
        }
        else if (check.charAt(0) == 'a' || check.charAt(0) == 'e' || check.charAt(0) == 'i'
                || check.charAt(0) == 'o' || check.charAt(0) == 'u')
        {
            return vowels(check.substring(1)) + 1;
        }
        return vowels(check.substring(1));
    }

    //problem 5

    /**
     * Problem 5    Sum up the digits in a number
     *
     * @param number number to sum up
     * @return all digits in the number summed up
     */
    public int digitSum(int number)
    {
        if (number == 0)
        {
            return 0;
        }
        return digitSum(number / 10) + number % 10;

    }

    //problem 7

    /**
     * Problem 7    Checks if string has a letter next to itself
     *
     * @param observe the string to check
     * @return whether or not it has a letter next to itself (T/F)
     */
    public boolean duplicateNeighbors(String observe)
    {
        if (observe.length() <= 1)
        {
            return false;
        }
        else if (observe.charAt(0) == observe.charAt(1))
        {
            return true;
        }

        return duplicateNeighbors(observe.substring(1));
    }

    //problem 8

    /**
     * Problem 8    Prints out one character per line
     *
     *
     * @param sentence the string to print to console one character per line
     */
    public void printChars(String sentence)
    {
        if (sentence.length() != 0)
        {
            System.out.println(sentence.charAt(0));

            printChars(sentence.substring(1));
        }
    }

    //problem 9

    /**
     * Problem 9 Takes a string 1 and another string 2 to remove instances of string 2 in string 1
     *
     * @param source the original string to be worked on
     * @param search the string instance to remove from the original string
     * @return The string with the search term removed from the original string
     */
    public String removeAll(String source, String search)
    {
        if (source.contains(search))
        {
            source = source.substring(0,source.indexOf(search))
                    + source.substring(source.indexOf(search) + search.length());
            return removeAll(source, search);
        }
        return source;
    }

    //problem 10

    /**
     * Problem 10   Takes a source string and a string to search and replaces the search instance
     * in the original string to asterisks
     *
     * @param source the original string  to be worked on
     * @param search the string instance to replace the original string to asterisks
     * @return the string with the search term replaced with asterisks
     */
    public String asterisks(String source, String search)
    {
        if (source.contains(search))
        {
            String stars = "";
            for (int i = 0; i < search.length(); i++)
            {
                stars = stars + "*";
            }

            source = source.substring(0,source.indexOf(search))
                    + stars
                    + (source.substring(source.indexOf(search) + search.length()));

            return asterisks(source, search);
        }
        return source;
    }

    //problem 12

    /**
     * Problem 12 prints out a star pyramid using recursion to change levels and allowed for loops
     * to write the line of asterisks.
     *
     *
     * @param height How high the pyramid will be
     *
     */
    public void pyramid(int height)
    {
        helpPyramid(height, height);
    }

    //prints asterisks into a pyramid using recursion
    private static void helpPyramid(int height, int initHeight)
    {
        if (height > 0)
        {
            helpPyramid(height - 1, initHeight);

            helpSpaces(height, initHeight);
//            for (int i = height; i < initHeight; i++)
//            {
//                System.out.print(" ");
//            }

            for (int i = 0; i < height + height - 1; i++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //prints spaces using recursion
    private static void helpSpaces(int height, int initHeight)
    {
        if (height < initHeight)
        {
            helpSpaces(height + 1, initHeight);
            System.out.print(" ");
        }
    }

}
