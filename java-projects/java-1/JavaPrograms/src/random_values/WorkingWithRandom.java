package random_values;

// importing the random class
import java.util.Random;

public class WorkingWithRandom {
    public static void main(String[] args)
    {
        // We are going to use the Random class to generate random values
        Random rand = new Random();

        int num1 = rand.nextInt(4);
        int num2 = rand.nextInt(4);
        int num3 = rand.nextInt(4);

        System.out.println(num1 + " " + num2 + " " + num3);

        // generate a bunch of numbers

        for (int i = 1; i <= 7; i++)
        {
            System.out.println(rand.nextInt(1000));
        }
        // pick any integer
        int largeInt = rand.nextInt();
        System.out.println("Large int: " + largeInt);

        // pick a floating point value
        double percentage = rand.nextDouble();
        System.out.println("Percentage: " + percentage);

        boolean flag = rand.nextBoolean();
        System.out.println("Flag: " + flag);

        for (int i = 1; i <= 2; i++)
        {
            boolean coinFlip = rand.nextBoolean();
            if (coinFlip)
            {
                System.out.println("Heads!");
            }
            else
            {
                System.out.println("Tails!");
            }
        }
    }

}
