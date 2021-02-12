package ConsoleIO;

import java.util.Scanner;

public class UserValidation {
    public static void main(String[] args)
    {
        // get a scanner
        Scanner scanner = new Scanner(System.in);
        //read a number
        System.out.print("Enter a non-negative number: ");
        if (scanner.hasNextInt())
        {
            // print out the square root of the number
            int number = scanner.nextInt();
            if (number >= 0)
            {
                System.out.println("Sqrt: " + Math.sqrt(number));
            }
        }

    }
}
