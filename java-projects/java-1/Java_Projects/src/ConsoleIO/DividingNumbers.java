package ConsoleIO;

import java.util.Scanner;

public class DividingNumbers {
    public static void main(String[] args)
    {
        // new scanner
        Scanner reader = new Scanner(System.in);
        // variable initialization
        double firstNum = 0;
        double secondNum = 0;

        //first number input
        System.out.println("This program divides 2 numbers.");
        System.out.println("Enter the number to be divided: ");
        if (reader.hasNextDouble())
        {
            firstNum = reader.nextDouble();
        }

        // Second number input
        System.out.print("Enter the number to be divided by: ");
        if (reader.hasNextDouble())
        {
            secondNum = reader.nextDouble();
        }


        //put results
        System.out.println("The result is: " + firstNum/secondNum);
    }
}
