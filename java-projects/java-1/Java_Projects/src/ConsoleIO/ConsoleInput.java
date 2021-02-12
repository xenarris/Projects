/*
    This is an example of user input on the console.
    Author: Jean-Kenneth Antonio
    Date: 9/25/2019
    File: ConsoleInput.java
 */


package ConsoleIO;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args)
    {
        // get reader for the console
        Scanner consoleReader = new Scanner(System.in);

        //get user inputs
        System.out.print("Please enter your name: ");
        String name = consoleReader.nextLine();

        System.out.println("How many programming languages do you know? ");
        int progLanguages = consoleReader.nextInt();

        System.out.println("So you have a pet? ");
        boolean ownsPet = consoleReader.nextBoolean();

        //print some outputs for the user
        System.out.println("Hello " + name);
        System.out.println("You program in " + progLanguages + " languages!");
        System.out.println("Do you have a pet? " + ownsPet);

    }
}
