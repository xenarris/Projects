package loops;

import org.w3c.dom.ls.LSOutput;

public class WhileLoop {
    public static void main(String[] args) {
        int sentinel = 1;
        int sum = 0;

        while (sentinel <= 100) {
            sum += sentinel;
            sentinel++;
        }
        System.out.println(sum);
        }

    }

