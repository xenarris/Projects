package esports;

import midterm.AnyPlayer;

/**
 * Class representing a player of the e-sports variety;
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class Player implements AnyPlayer
{
    private String name;

    /**
     * Constructor for creating a Player object
     *
     * @param name the name of the player
     */
    public Player(String name)
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
        return "Player name: " + name;
    }
}
