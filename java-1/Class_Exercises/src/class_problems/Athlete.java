/*
    this file contains an Athlete class.
    This is problem 5 of the class exercises.
    File: Athlete.java
    Date: Nov 30, 2019
    Author: Jean-Kenneth Antonio
 */

package class_problems;

public class Athlete
{
    //fields
    private String sport;
    private String position;
    private String firstName;
    private String lastName;

    //parameterized constructor
    public Athlete(String sport, String position, String firstName, String lastName)
    {
        this.sport = sport;
        this.position = position;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters
    public String getSport()
    {
        return sport;
    }

    public String getPosition()
    {
        return position;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setSport(String sport)
    {
        this.sport = sport;
    }

    public void setPosition(String position)
    {
        this.position = position;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //toString method
    public String toString()
    {
        return "Athlete - " + firstName + " " + lastName + " (" + sport + " - " + position + ")";
    }
}
