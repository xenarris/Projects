package variables;

import java.util.Scanner;

public class PayProgram {
    public static void main(String[] args)
    {
        final int OVERTIME_HOURS = 40;
        final int MIN_HOURS = 20;
        final int MAX_HOURS = 60;
        final double WAGE = 25.0;
        final double OVERTIME_RATE = 0.5;

        Scanner scan = new Scanner(System.in);

        // ask the user for name and hours
        System.out.print("What is your name?" );
        String name = scan.nextLine();

        System.out.print("How many hours did you work this paycheck? ");
        int hours = scan.nextInt();

        // calculate the user's pay
        // Pay will only be between 20-60 hours
        hours = Math.max(MIN_HOURS, hours);
        hours = Math.min(MAX_HOURS, hours);

        double payRate = WAGE;
        double pay = hours * payRate;

        // do we also owe the user for overtime?
        if (hours > OVERTIME_HOURS)
        {
            double overTimeHours = hours - OVERTIME_HOURS;
            pay = pay + (overTimeHours * OVERTIME_RATE * payRate);
        }

        // print pay results
        System.out.println("\n" + name + " spent " + hours + " hours working.");

        if (hours > OVERTIME_HOURS)
        {
            System.out.println("Of those, " + (hours - OVERTIME_HOURS) + " hours was spent overtime.");
        }

        System.out.println("Your total pay is: $" + pay);
    }
}
