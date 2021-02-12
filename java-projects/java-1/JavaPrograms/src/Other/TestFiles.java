package Other;

import java.util.Random;
import java.util.Scanner;

public class TestFiles {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
//
//        System.out.println(2 + 2 + " is " + 2 + 2 + "?");
//
//        for (int i = 1; i < 7; i++) {
//            int pow = (int) Math.pow(3, i);
//            System.out.println(pow);
//        }
//
//        Random rand = new Random();
//        int randNum = -1;
//        while (randNum != 5)
//        {
//            randNum = rand.nextInt(10) + 1;
//            System.out.println(randNum);
//        }

//        String sentence = "I own a spaceship";
//        sentence = sentence.replace("space", "inter-galactic");
//        System.out.println(sentence);
//
//        String saying = "The cow 'jumped' over the moon";
//        String firstPart = saying.substring(0,5);
//        String secondPart = saying.substring(6);
//
//        System.out.println(firstPart);
//        System.out.println(secondPart);

//        int sentinel = 0;
//        while (sentinel < 51) {
//            System.out.println(sentinel + 1);
//            sentinel += 2;
        double total = 0;
        while (total <= 100.0) {
            total += console.nextDouble();
            System.out.println(total);
        }
    }
}
