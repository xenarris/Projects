package loops;

import java.util.Random;

public class WhileLoops {
    public static void main(String[] args) {
        Random flipper = new Random();
        int heads = 0;
        int tails = 0;

        while (heads < 3) {
            boolean coinFlip = flipper.nextBoolean();
            if (coinFlip) {
                System.out.println("heads!");
                heads++;
            }
            else {
                System.out.println("tails!");
                tails++;
            }
        }
        System.out.println("All done!");
    }
}
