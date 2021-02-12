package math;

public class Methods {
    public static void main(String[] args) {
        //int sum = add(10,100);
        System.out.println(add(10,100));

        System.out.println(repeatString("*", 25));

        String bar = repeatString("-",10);
        int sum = add(2,3);


    }

    public  static int add(int one, int two) {
        // add together the numbers
        int result = one + two;

        //return them as the result of my method
        return result;
    }

    public static String repeatString(String input, int times) {
        String result = "";

        //do something
        for (int i = 1; i <= times; i++) {
            //add tot he string (times) times
            result += input;
        }

        return result;
    }
}
