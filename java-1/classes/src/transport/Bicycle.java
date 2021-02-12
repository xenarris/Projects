/*
    this file contains a Bicycle class
    File: Bicycle.java
    Date: Nov 18, 2019
    Author: Jean-Kenneth Antonio
 */
package transport;

/**
 * This is a Bicycle class that has a brand, gears, and weight.
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */

public class Bicycle
{
    //fields
    private String brand;
    private int gears;
    private double weight;

    //default

    /**
     * Creates a new Diamondback bike
     */
    public Bicycle()
    {
        brand = "Diamondback";
        gears = 7;
        weight = 40.0;
    }

    //parameterized constructor

    /**
     * This creates a new bike with all three fields
     * set to input parameters
     *
     * @param brand the new bike brand
     * @param gears the number of gears of the new bike
     * @param weight the weight of the new bike
     */
    public Bicycle(String brand, int gears, double weight)
    {
        this.brand = brand;
        this.gears = gears;
        this.weight = weight;
    }

    //getters
    public String getBrand()
    {
        return brand;
    }

    public int getGears()
    {
        return gears;
    }

    public double getWeight()
    {
        return weight;
    }

    //setters
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public void setGears(int gears)
    {
        this.gears = gears;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    /**
     * Returns a string representation of the bike
     * @return a string version of the bike
     */
    public String toString()
    {
        return "Brand: " + brand + ". Number of gears: " + gears + ". Weight: " + weight + ".";
    }
}

