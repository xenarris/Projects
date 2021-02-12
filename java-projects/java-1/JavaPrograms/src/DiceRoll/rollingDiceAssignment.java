/*
*   This program provides a menu to choose from: rolling a die with a user defined amount, rolling a user defined
*       number of die with a user defined number of sides, a simplified game of snake eyes, and a choice to exit
*
*   When inputting a bad choice, the program will terminate with a statement "Bad menu choice"
*
*   Author: Jean-Kenneth Antonio
*   Date: 10-07-2019
*   File: RollingDiceAssignment.java
* */
package DiceRoll;

import java.util.Random;
import java.util.Scanner;

public class rollingDiceAssignment {
    public static void main(String[] args) {
       menuChoices();

    }

    public static void menuChoices() {
        //declaration and initialization
        Scanner reader = new Scanner(System.in);
        int option;

        //menu choices
        System.out.println("1. Roll a die");
        System.out.println("2. Roll n dice");
        System.out.println("3. Play a dice game");
        System.out.println("4. Exit");
        System.out.print("Choose an option number: ");

        //user input and parsing
        if  (reader.hasNextInt() && ((option = reader.nextInt()) < 5 && option > 0))
        {
            reader.nextLine();

            if (option == 1){
                option1();
            }
            else if (option == 2)
            {
                option2();
            }
            else if (option == 3)
            {
                option3();
            }
            else
            {
                System.out.println("Terminated at choice4");
                System.exit(0);
            }

        } else {
            System.out.println("Bad menu choice");
        }

    }

    public static void option1()
    {
        //declaration and initialization
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        int numSides = 1;
        int results;


        //user prompt and input
        System.out.print("Enter the number of sides of the die you want to roll: ");

        if  (reader.hasNextInt()){
            numSides = reader.nextInt();

            //results and output
            results = rand.nextInt(numSides) + 1;
            System.out.println("Rolling...");
            System.out.println("A " + results + " comes up.");
        }
        else
        {
            System.out.println("Bad menu choice");
        }


    }
    public static void option2()
    {
        // declaration and initialization of variables
        Random rand = new Random();
        Scanner reader = new Scanner(System.in);
        int numSides = 1;
        int numDice = 1;
        int results;

        //user prompts and results

        //prompts number of sides
        System.out.print("Enter the number of sides of the die you want to roll: ");
        if  (reader.hasNextInt()){
            numSides = reader.nextInt();

            //prompts number of dice
            System.out.print("Enter the amount of dice you wish to roll: ");
            if  (reader.hasNextInt()){
                numDice = reader.nextInt();


                //results and output
                System.out.println("Rolling...");
                for (int count = 1; count <= numDice; count++)
                {
                    results = rand.nextInt(numSides) + 1;
                    System.out.println("A " + results + " comes up.");
                }
            }
            else
            {
                System.out.println("Bad menu choice");
                reader.nextLine();
            }
        }
        else
        {
            System.out.println("Bad menu choice");
            reader.nextLine();
        }

    }
    public static void option3()
    {
        // new rand
        Random rand = new Random();

        //initialize rolls
        int roll1 = rand.nextInt(6) + 1;
        int roll2 = rand.nextInt(6) + 1;

        //prints rolls
        System.out.println("You rolled " + roll1);
        System.out.println("You rolled " + roll2);

        //prints whether it is a win or loss
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

}
