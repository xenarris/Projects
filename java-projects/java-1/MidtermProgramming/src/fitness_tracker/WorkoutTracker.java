/*
 *   This program accepts user inputted day of the week, workout time, and heart beats before and after. Then
 * prints it back to the console.
 *   User will be prompted to enter whether they want to infinitely enter data or not. Then prompt to enter a
 * valid day of the week, otherwise it will loop until a valid input is entered. This happen with the
 * workout minutes as doubles, heart beats per minute as ints, and boolean questions
 *
 *   Author: Jean-Kenneth Antonio
 *   Date: 10-28-2019
 *   File: WorkoutTracker.java
 * */

package fitness_tracker;

import java.util.Scanner;

public class WorkoutTracker {
    public static void main(String[] args)
    {
        introduction();

        while (!exitProgram && numRoutines < maxRoutines)
        {
            //method to enter user input
            inputOptions();
        }
    }

    //fields to store values
    private static boolean exitProgram = false;
    private static boolean infiniteLoop = false;
    private static int numRoutines = 0;
    private static int maxRoutines = 7;

    //introduces the program and prompts the user if they want to limit data entry to 7 days
    public static void introduction()
    {
        System.out.println("This program accepts entries to track your workout for each day");
        System.out.println("Do you want to limit workout entries to 7 days? " +
                "(You may still exit beforehand at a prompt): ");
        infiniteLoop = !validateBoolean();
    }
    //prompts user for data
    public static void inputOptions()
    {
        //user inputs
        System.out.println("Enter day of week: ");
        String day = validateString();

        System.out.println("Enter work-out minutes: ");
        Double workoutTime = validateMinutes();

        System.out.println("Enter heart-beats per minute before: ");
        int heartBeatsBefore = validateHeartBeats();

        System.out.println("Enter heart-beats per minute after: ");
        int heartBeatsAfter = validateHeartBeats();

        printResults(day, workoutTime, heartBeatsBefore, heartBeatsAfter);
        //if limited days to 7, makes sure to remove the last prompt to exit
        if (numRoutines != maxRoutines - 1)
        {
            //prompts for exit
            System.out.println("Want to exit?");
            exitProgram = validateBoolean();
        }
        //add to counter
        numRoutines++;
        if (infiniteLoop)
        {
            maxRoutines++;
        }
    }

    //prints results of the inputs
    private static void printResults(String day, double workoutTime, int heartBeatsBefore, int heartsBeatsAfter)
    {
        System.out.println();
        for (int i = 0; i < 30; i++)
        {
            System.out.print("*");
        }

        System.out.println();
        System.out.println(day + " workout!");
        System.out.println();
        System.out.println("Minutes worked out - " + workoutTime);
        System.out.println("HBPM before - " + heartBeatsBefore);
        System.out.println("HBPM after - " + heartsBeatsAfter);

        for (int i = 0; i < 30; i++)
        {
            System.out.print("*");
        }
        System.out.println("\n");

        // print when on the last iteration
        if (numRoutines == (maxRoutines - 1))
        {
            System.out.println("Keep up the good work!");
        }
    }

    //this method checks if its an actual day of the week
    private static String validateString()
    {
        Scanner console = new Scanner(System.in);
        String tempString;

        while (true)
        {
            tempString = console.nextLine();
            //takes tempString, make it lowercase, and checks to see if it matches a valid day of the week
            //therefore 'MONDAY', 'monday', and 'MoNdAy' works
            if (tempString.toLowerCase().equals("monday"))
            {
                break;
            }
            else if (tempString.toLowerCase().equals("tuesday"))
            {
                break;
            }
            else if (tempString.toLowerCase().equals("wednesday"))
            {
                break;
            }
            else if (tempString.toLowerCase().equals("thursday"))
            {
                break;
            }
            else if (tempString.toLowerCase().equals("friday"))
            {
                break;
            }
            else if (tempString.toLowerCase().equals("saturday"))
            {
                break;
            }
            else if (tempString.toLowerCase().equals("sunday"))
            {
                break;
            }
            else
            {
                System.out.println("Not a valid day. Try again");
            }
        }
        return tempString;
    }
    //checks if valid double value
    private static double validateMinutes()
    {
        Scanner console = new Scanner(System.in);
        double tempDouble;

        while (!console.hasNextDouble() || ((tempDouble = console.nextDouble()) < 0.0))
        {
            console.nextLine();
            System.out.println("Please enter a positive work-out minutes");
        }
        return tempDouble;
    }

    //checks if valid int value
    private static int validateHeartBeats()
    {
        Scanner console = new Scanner(System.in);
        int tempBeats;

        while (!console.hasNextInt() || ((tempBeats = console.nextInt()) < 0))
        {
            console.nextLine();
            System.out.println("Please enter a positive heart beats per minute");
        }
        return tempBeats;
    }

    //checks valid boolean value
    private static boolean validateBoolean()
    {
        Scanner console = new Scanner(System.in);
        boolean tempBoolean;

        while (!console.hasNextBoolean())
        {
            console.nextLine();
            System.out.println("Enter 'true' or 'false' ");
        }

        tempBoolean = console.nextBoolean();
        return tempBoolean;
    }
}
