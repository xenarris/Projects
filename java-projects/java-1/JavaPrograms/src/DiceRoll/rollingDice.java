/*
 *   This program provides a menu to choose from: rolling a die with a user defined amount, rolling a user defined
 *       number of die with a user defined number of sides, a simplified game of snake eyes, and a choice to exit.
 *
 *   This has recurring prompts when inputting bad prompts so the program does not end prematurely.
 *
 *   Don't grade this one according to the rubric
 *   Grade the other java file please
 *
 *   Author: Jean-Kenneth Antonio
 *   Date: 10-07-2019
 *   File: RollingDiceAssignment.java
 * */
package DiceRoll;

import java.util.Random;
import java.util.Scanner;

public class rollingDice {
    public static void main(String[] args) {

        //variables initialization and declaration
        //showMenu
        menuChoices();


        int option = 0;
        option = checkMenuInput(option);
        //System.out.println("option: " + option);

        //checkMenuInput(option);

        //checkInput

        //option 1

        //option 2

        //option 3

        //results

        //handling bad inputs

    }
    public static void menuChoices() {
        //menu choices
        System.out.println("1. Roll a die");
        System.out.println("2. Roll n dice");
        System.out.println("3. Play a dice game");
        System.out.println("4. Exit");
        System.out.print("Choose an option number: ");


    }

    public static int checkMenuInput(int option)
    {
        //initialize variables
        Scanner reader = new Scanner(System.in);

        //validations
        if (option == 0)
        {
            // has to be an integer and has to be the number [1-4]
            while (!reader.hasNextInt() || !((option = reader.nextInt()) < 5 && option > 0))
                {
                    System.out.print("Invalid selection! Try again: ");
                    reader.nextLine();
                }
        }

        // sends the program to the desired option

        // sends to custom die
        if (option == 1)
        {
            option1();
        }

        //sends to custom die and number of rolls
        else if (option == 2)
        {
            option2();
        }

        //sends to dice game
        else if (option == 3)
        {
            option3();
        }

        //exits program
        else if (option == 4)
        {
        System.out.println("Thanks for Playing!");
        System.exit(0);
        }

        // for troubleshooting the menu
        else {
            System.out.println("Invalid option! program encountered an error and is not supposed to print this!");
            System.out.println("");
        }
        return (option);
    }

    public static void option1()
    {
        //declaration and initialization
        Random rand = new Random();
        int numSides = 1;
        int results;


        //user prompt and input
        System.out.print("Enter the number of sides of the die you want to roll: ");
        numSides = sidesInput(numSides);

        //results and output
        results = rand.nextInt(numSides) + 1;
        System.out.println("Rolling...");
        System.out.println("A " + results + " comes up.");
    }
    public static void option2()
    {
        // declaration and initialization of variables
        Random rand = new Random();
        int numSides = 1;
        int numDice = 1;
        int results;

        //user prompt and input
        System.out.println("Enter the number of sides of the dice you wish to roll: ");
        numSides = sidesInput(numSides);

        System.out.print("Enter the amount of dice you wish to roll: ");
        numDice = diceInput(numDice);

        //results and output

        System.out.println("Rolling...");
        for (int count = 1; count <= numDice; count++)
        {
            results = rand.nextInt(numSides) + 1;
            System.out.println("A " + results + " comes up.");
        }

    }
    public static void option3()
    {
        Random rand = new Random();

        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;

        System.out.println("You rolled " + roll1);
        System.out.println("You rolled " + roll2);

        if (roll1 == roll2)
        {
            if (roll1 == 1 && roll2 == 1)
            {
                System.out.println("Snake eyes you lose!");
            }
            else {
                System.out.println("Same, You lose!");
            }
        }
        else{
            System.out.println("You win!");
        }

    }

    public static int sidesInput(int numSides) {
        //initialize scanner
        Scanner reader1 = new Scanner(System.in);

        // validate number of sides with an error message
        while(!reader1.hasNextInt() || !((numSides = reader1.nextInt()) > 0))
        {
            if (numSides == 0)
            {
                System.out.print("No, obviously 0 sides is zero! Try again: ");
                numSides = 1;
                reader1.nextLine();
            }
            else {
                System.out.print("Invalid input! Try again: ");
                reader1.nextLine();
            }
        }

        return(numSides);
    }
    public static int diceInput(int numDie)
    {
        // variables and scanner
        Scanner reader2 = new Scanner(System.in);

        // validate number of die
        while(!reader2.hasNextInt() || !((numDie = reader2.nextInt()) > 0))
        {
            System.out.print("Invalid input! Try again: ");
            reader2.nextLine();
        }
        return(numDie);
    }

}
