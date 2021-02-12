package console_practice;

import java.util.Scanner;

public class ClassProjectPractice {
    public static void main(String[] args)
    {
        // reader for console
        Scanner consoleReader = new Scanner(System.in);

        // get user inputs
        System.out.println("Please enter 3 classes you plan to take this quarter");

        System.out.print("First Class? ");
        String firstClass = consoleReader.nextLine();
        System.out.print("Second Class? ");
        String secondClass = consoleReader.nextLine();
        System.out.print("Third Class? ");
        String thirdClass = consoleReader.nextLine();
        System.out.println();

        // show user outputs
        System.out.println("Here is your schedule!");
        System.out.println("**********************");
        System.out.println("Class #1 - " + firstClass);
        System.out.println("Class #2 - " + secondClass);
        System.out.println("Class #3 - " + thirdClass);
        System.out.print("**********************");
    }
}
