package Introduction;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        int wage;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter Wage: ");
        wage = scnr.nextInt();
        System.out.print("Salary is ");
        System.out.println(wage * 40 * 50);
        whats();
    }
    public static void whats() {
        System.out.print("yes");
    }
}
