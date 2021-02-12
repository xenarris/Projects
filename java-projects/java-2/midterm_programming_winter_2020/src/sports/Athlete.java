package sports;

import midterm.AnyPlayer;

/**
 * Class representing an Athlete
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class Athlete implements AnyPlayer
{
    private String name;

    /**
     * Constructor for creating an athlete object
     *
     * @param name the name of the athlete
     */
    public Athlete(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Athlete Name: " + name;
    }
}
