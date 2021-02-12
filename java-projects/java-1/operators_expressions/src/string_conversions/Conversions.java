package string_conversions;

import java.util.Scanner;

public class Conversions {
    public static void main(String[] args)
    {
        // read a user input value
        Scanner scanner = new Scanner(System.in);
        String stringInput = scanner.nextLine();

        //convert to an int
        int intInput = Integer.parseInt(stringInput);
        System.out.println("It -> " + intInput);

        // convert back into an int
        String stringInputAgain = String.valueOf(intInput);
        System.out.println("String -> " + stringInputAgain);
    }
}
