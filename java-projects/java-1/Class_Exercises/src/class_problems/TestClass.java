/*
    this file contains an Test Class class.
    This is the driver program of the class exercises.
    File: TestClass.java
    Date: Nov 30, 2019
    Author: Jean-Kenneth Antonio
 */

package class_problems;

import java.util.Random;
import java.util.Scanner;

public class TestClass
{
    public static void main(String[] args)
    {

        //Problem 3
        System.out.println("-----------------Problem 3------------------");

        //Test IPAddressV4 objects
        IPAddressV4 address = new IPAddressV4(192, 160, 0, 0);
        System.out.println(address.toString()); //IP Address: 192.160.0.0

        IPAddressV4 invalid = new IPAddressV4(-1, -1, -1, -1);
        System.out.println(invalid.toString()); //IP Address: 127.0.0.1

        IPAddressV4 defaultAddress = new IPAddressV4();
        System.out.println(defaultAddress.toString()); //IP Address: 127.0.0.1

        //test isLocalHost() method
        System.out.println(address.isLocalHost()); //false
        System.out.println(defaultAddress.isLocalHost()); //true
        System.out.println();

        //problem 5
        System.out.println("-----------------Problem 5------------------");

        //create random object
        Random random = new Random();

        //creating test arrays of first name, last name, and positions
        String[] firstNames = {"Jeremy","Jose","Jules","Kevin","Terry"};
        String[] lastNames = {"Nguyen","Smith","Williams","Todd","Mann"};
        String[] positions = {"Quarterback","Defensive End","Tight End","Linebacker","Defensive tackle"};

        //create objects
        for (int i = 0; i < 10; i++)
        {
            Athlete athlete = new Athlete("Football",
                    positions[random.nextInt(4)],
                    firstNames[random.nextInt(4)],
                    lastNames[random.nextInt(4)]);
            System.out.println(athlete.toString());
        }
        System.out.println();

        //problem 6
        System.out.println("-----------------Problem 6------------------");

        //test cases
        String[] people = {"William", "Sue", "Rose", "Timothy"};
        CheckoutLine line = new CheckoutLine(people);
        System.out.println(line.toString()); //end --> [William, Sue, Rose, Timothy] --> front

        CheckoutLine anotherLine = new CheckoutLine(new String[] {"Fred", "George"});
        System.out.println(anotherLine.toString()); //end --> [Fred, George] --> front

        System.out.println();

        System.out.println(line.isFirst()); //Timothy
        System.out.println(line.isLast()); //William
        System.out.println();

        line.enterLine("Isabelle");
        System.out.println(line.isFirst()); //Rose
        System.out.println(line.isLast()); //Isabelle
        System.out.println();

        anotherLine.enterLine("Brett");
        System.out.println(anotherLine.isFirst()); //Fred
        System.out.println(anotherLine.isLast()); //Brett
        System.out.println();

        System.out.println("-----------------Problem 7------------------");

        //new Scanner
        Scanner scanner = new Scanner(System.in);

        //User input
        System.out.println("Please Enter contact details!");
        System.out.println("Full Name: ");
        String name = scanner.nextLine();

        System.out.println("Address Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Street name: ");
        String street = scanner.nextLine();

        System.out.println("City: ");
        String city = scanner.nextLine();

        System.out.println("State: ");
        String state = scanner.nextLine();

        System.out.println("Zip: ");
        int zip = scanner.nextInt();
        scanner.nextLine();

        //spit out user input
        Contact contact = new Contact(name, number, street, city, state, zip);
        System.out.println(contact); //Contact - Tom Smith, 22 Virginia Ave. Tacoma, WA 98999
        System.out.println();

        System.out.println("-----------------Problem 8------------------");

        //create new rational object
        Rational rational = new Rational();

        //print numerators and denominators
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                rational.setNumerator(i + 1);
                rational.setDenominator(j + 1);
                System.out.println(rational.toString());
            }
        }
    }
}
