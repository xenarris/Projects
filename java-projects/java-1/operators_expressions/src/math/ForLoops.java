package math;

public class ForLoops {
    public static void main(String[] args) {
        for (int i = -3; i < 4; i++){
            System.out.print(i + ", ");
        }

        for (int i = 10; i < 31; i += 4) {
            System.out.print(i + ", ");
        }

        for (int i = 50; i >= 40; i -= 2) {
            System.out.print(i + ", ");
        }

        for (int i = 81; i > 0; i /= 3) {
            System.out.print(i + ", ");
        }

        for  (int i = 1; i < 50; i = ((i * 2) + 1)) {
            System.out.print(i + ", ");
        }
    }
}
