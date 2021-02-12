package examples;

import java.util.Random;

public class ReturnExamples {
    public static void main(String[] args) {

//        for (int i = 0; i < 100; i++) {
//            int result = randomNum(3,7);
//            System.out.println("Result: " + result);
//        }

//        String street = "1000 Orange Lane";
//        String city = "Puyallup";
//        String state = "WA";
//        int zip = 98999;
//
//        String address = assembleAddress(street, city, state, zip);
//        System.out.println(address);

        double totalPrice = purchaseOrder(10.00, 10, 10.0);
        System.out.println("Total Cost: $" + totalPrice);
    }

    public static String assembleAddress(String street, String city, String state, int zip) {
        return  street + " " + city + " " + state + " " + zip;
    }

    public static int randomNum(int low, int high) {
        Random random = new Random();

        int number = random.nextInt(high - low + 1);
        number += low;
        return number;
    }

    public static double purchaseOrder(double itmPrice, int itmQuantity, double taxRate) {
        double subTotal = itmPrice * itmQuantity;
        double totalPrice = ((taxRate/100) * subTotal) + subTotal;

        return  totalPrice;
    }

}
