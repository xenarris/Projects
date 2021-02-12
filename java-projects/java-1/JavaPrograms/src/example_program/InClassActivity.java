package example_program;

import java.util.Random;

public class InClassActivity {
    public static void  main(String[] args)
    {
        // introduction
        System.out.println("Shake tha magic four ball!");
        System.out.println("(Cousin to the magic eight ball)\n");

        // variables
        String yes = "Yes, Definitely";
        String not = "Not a chance";
        String unlike = "Unlikely";
        String maybe = "Maybe";

        // using the random
        Random rand = new Random();
        int result = rand.nextInt(4);

        // result output
        if (result == 0)
        {
            System.out.println(yes);
        }
        else if (result == 1)
        {
            System.out.println(maybe);
        }
        else if (result == 2)
        {
            System.out.println(unlike);
        }
        else
        {
            System.out.println(not);

        }
    }
}

