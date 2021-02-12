package examples;

public class MethodExamples {
    public static void main(String[] args) {
        //call our method several times with different inputs
        printEvens(100);
        printEvens(10);
        printEvens(5);

        printEvens(10, 20);
    }

    //print the even numbers between [1,max]
    public static void printEvens(int max){
        //some defensive programming
        if (max >= 1) {
            for (int i = 1; i <= max; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

    //print the even numbers between [min,max]
    public static void printEvens(int min, int max) {
        if (max >= 1) {
            for (int i = min; i <= max; i++) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
