package modules;

import java.util.Random;

public class Dice
{
    private static Random random = new Random();
    private int sides;
    private String color;

    public Dice(int sides, String color)
    {
        this.sides = sides;
        this.color = color;
    }

    public int getSides()
    {
        return sides;
    }

    public String getColor()
    {
        return color;
    }

    public int roll()
    {
        return random.nextInt(sides) + 1;
    }
}
