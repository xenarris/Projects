package loops;

import java.util.Scanner;

public class RectangleDimensions {
    public static void main(String[] args) {
        // repeatedly ask the user for rectangle dimensions
        //until the area is zero
        Scanner console = new Scanner(System.in);
        printAlot("hello", 4);

        double area = -1;

//        do {
//            //ask user for input values
//            System.out.println("Length?");
//            double length = console.nextDouble();
//            System.out.println("Width?");
//            double width = console.nextDouble();
//
//            //print the area
//            area = length * width;
//            System.out.println(area);
//        } while (area != 0.0);

        while (area != 0) {
            //ask user for input values
            System.out.println("Length?");
            double length = console.nextDouble();
            System.out.println("Width?");
            double width = console.nextDouble();

//            //print the area
            area = length * width;
            System.out.println(area);
        }
    }

    public static void printAlot(String message, int times) {
        for (int i = 0; i < times ; i++) {
            System.out.println(message);

        }
    }
}
