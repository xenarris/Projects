package ConsoleIO;

import java.util.Scanner;

public class ScannerBuffer {
    public static void main(String[] args)
    {
        // new scanner
        Scanner reader = new Scanner(System.in);

        //get user input
        System.out.print("Enter the number of pets you own: ");
        int numPets = reader.nextInt();
        //next line clears scanner buffer
        reader.nextLine(); //important, so that that[enter] key will not be used in the next user input

        System.out.print("Enter your name: ");
        String fullName = reader.nextLine();

        //output results
        System.out.println("Thanks for playing " + fullName + "!");
        System.out.println("You own " + numPets + " pets");

    }
}
