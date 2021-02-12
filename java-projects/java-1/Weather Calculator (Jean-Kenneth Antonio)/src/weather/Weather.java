/*
 * Jean-Kenneth Antonio
 * Weather.java
 * 10/21/2019
 * Provides a simple weather calculator on the Java console.
 */

package weather;

import java.util.Scanner;

public class Weather
{
    //starts the weather calculator
    public static void main(String[] args)
    {
        //introduction
        String intro = "Welcome to the Weather Calculator";
        System.out.println(intro);
        for (int i = 0; i < intro.length() ; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        //Shows menu
        while (exitTrue == false)
        {
            showMenu();
            getUserInputs();
        }
    }

    //shows a menu to the user with three options
    public static void showMenu()
    {
        System.out.println("1. Enter weather values");
        System.out.println("2. Perform calculations");
        System.out.println("3. Exit");
        System.out.println("Make a choice: ");
    }

    //asks the user for the temperature and wind speed
    public static void getUserInputs()
    {
        //Scanner and variables initialization
        Scanner console = new Scanner(System.in);
        final int MENU_OPTION_1 = 1;
        final int MENU_OPTION_2 = 2;
        final int MENU_OPTION_3 = 3;
        double userInputTemp;
        boolean fahrenheit;

        //choice menu option
        int userMenuChoice = console.nextInt();

        //takes user input of temp and wind speed
        //and places them where it needs to go
        if (userMenuChoice == MENU_OPTION_1)
        {
            System.out.println("Enter the temperature: ");
            userInputTemp = console.nextDouble();

            System.out.println("Are these degrees in Fahrenheit?");
            fahrenheit = console.nextBoolean();

            System.out.println("Enter wind speed: ");
            windSpeed = console.nextDouble();

            // Converts temps as needed
            if (fahrenheit == true)
            {
                tempFahrenheit = userInputTemp;
                tempCelsius = fahrenToCelsius(userInputTemp);
            }
            else
            {
                tempCelsius = userInputTemp;
                tempFahrenheit = celsiusToFahren(userInputTemp);
            }
        }

        //calculates and show results
        else if (userMenuChoice == MENU_OPTION_2)
        {
            showResults();
        }
        else if (userMenuChoice == MENU_OPTION_3)
        {
            exitTrue = true;
        }
    }

    //print out the user provided temperature in Celsius & Fahrenheit,
    //the wind speed, and the wind chill index
    public static void showResults()
    {
        System.out.println("Results");
        for (int i = 0; i < 34; i++)
        {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Temp in Celsius: " + tempCelsius);
        System.out.println("Temp in Fahrenheit: " + tempFahrenheit);
        System.out.println("Wind speed: " + windSpeed);
        System.out.println("Wind chill index: " + windChillIndex(tempFahrenheit, windSpeed));
        System.out.println();
    }

    //fields to store values
    private static double tempCelsius;
    private static double tempFahrenheit;
    private static double windSpeed;
    private static boolean exitTrue = false;

    //helper methods below *********************************************
    //(no Console.* or System.out.println() statements below this point)

    //accepts a temperature in Fahrenheit and returns the temperature in Celsius
    public static double fahrenToCelsius(double faren)
    {
        double tempConstC = (5.0/9.0);
        double celsius = tempConstC * (faren - 32.0);
        return celsius;
    }

    //accepts a temperature in Celsius and returns the temperature in Fahrenheit
    public static double celsiusToFahren(double celsius)
    {
        double tempConstF = (9.0/5.0);
        double faren = (tempConstF * celsius) + 32.0;
        return faren;
    }

    //accepts a temperature in Fahrenheit and a windspeed in MPH and returns the wind
    //chill index
    public static double windChillIndex(double temp, double windSpeed)
    {
        double chillIndex = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temp * Math.pow(windSpeed, 0.16));
        return chillIndex;
    }
}
