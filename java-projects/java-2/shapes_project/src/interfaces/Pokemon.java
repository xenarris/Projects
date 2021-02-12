package interfaces;

import java.awt.*;

public class Pokemon implements Moveable, Colorable, Nameable
{
    //fields
    private String firstName;
    private String lastName;
    private String color;
    private boolean isBlue;

    //constructors
    public Pokemon()
    {
        this.firstName = "Mawile";
        this.color = "Yellow";
        this.isBlue = false;
    }

    public Pokemon(String firstName, String color)
    {
        this.firstName = firstName;
        this.color = color;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void printName()
    {
        System.out.println(firstName + " " + lastName);
    }

    public String getColor()
    {
        return color;
    }

    public boolean isBlue()
    {
        return isBlue;
    }

    public void moveMe(double x, double y)
    {

    }
}
