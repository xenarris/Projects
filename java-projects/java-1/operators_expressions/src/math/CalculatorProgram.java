package math;

import java.util.Scanner;

public class CalculatorProgram {
    public static void main(String[] args) {
        //Scanner and var
        Scanner scan = new Scanner(System.in);
        double userInput;
        int option;
        double userResult;

        //intro
        System.out.println("Please enter a number in the type double");
        userInput = scan.nextDouble();

        System.out.println("What operation do you want to to use\n1. absolute value\n2. square root\n3. negation\n4. rounding");
        option = scan.nextInt();

        //Calculations
        if (option == 1) {
            userResult = (Math.abs(userInput));
            System.out.println(userResult);
        }
        else if (option == 2) {
            userResult = (Math.sqrt(userInput));
            System.out.println(userResult);
        }
        else if (option == 3) {
            userResult = (-userInput);
            System.out.println(userResult);
        }
        else if (option == 4) {
            userResult = (Math.round(userInput));
            System.out.println(userResult);
        }
        else {
            System.out.println("Not a choice");
        }
    }
}
