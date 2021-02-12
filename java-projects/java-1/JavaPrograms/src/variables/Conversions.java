package variables;

public class Conversions {
    public static void main(String[] args) {
        double bigNumber = 300.17;
        short littleNumber = (short)bigNumber;
        System.out.println("Number as short: " + littleNumber);

        byte reallyLittleNumber = (byte)littleNumber;
        System.out.println("Number as Byte: " + reallyLittleNumber);
    }

}
