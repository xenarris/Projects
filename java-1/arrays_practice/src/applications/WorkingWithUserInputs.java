package applications;

import java.util.Scanner;

public class WorkingWithUserInputs
{
    public static void main(String[] args)
    {
        //store the user's top five dream jobs!
        Scanner console = new Scanner(System.in);
        String[] inputs = new String[4];

        //ask the user for their favorite jobs
        for (int i = 0; i < inputs.length; i++)
        {
            System.out.println("Enter dream job #" + (i + 1));
            String job = console.nextLine();

            //place the job in the array
            inputs[i] = job;
        }

        System.out.println();
        System.out.println("Your dream jobs");
        System.out.println("************************");

        //later in the program print out the jobs
        for (int i = 0; i < inputs.length; i++)
        {
            System.out.println(inputs[i]);
        }
        System.out.println("************************");

        //search for a job the user entered
        for (int i = 0; i < inputs.length; i++)
        {
            if (inputs[i].equals("Underwater Basketweaving"))
            {
                System.out.println("Found it!");
            }
        }
    }
}
