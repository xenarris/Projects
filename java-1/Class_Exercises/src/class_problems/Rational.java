/*
    this file contains a Rational class.
    This is problem 8 of the class exercises.
    File: Rational.java
    Date: Nov 30, 2019
    Author: Jean-Kenneth Antonio
 */

package class_problems;

public class Rational
{
    private double numerator;
    private double denominator;

    //default constructor
    public Rational()
    {
        numerator = 1;
        denominator = 1;
    }

    //parameterized constructor
    public Rational(double numerator, double denominator)
    {
        if (denominator == 0)
        {
            System.out.println("Error: cannot divide by zero - " +
                    numerator + "/" + denominator + ".");
            denominator = 1;
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    // getters and setters
    public double getNumerator()
    {
        return numerator;
    }

    public void setNumerator(double numerator)
    {
        this.numerator = numerator;
    }

    public double getDenominator()
    {
        return denominator;
    }

    public void setDenominator(double denominator)
    {
        this.denominator = denominator;
    }

    //toString method
    public String toString()
    {
        return numerator + " / " + denominator;
    }
}
