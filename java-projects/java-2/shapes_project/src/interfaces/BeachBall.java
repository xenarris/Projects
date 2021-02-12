package interfaces;

public class BeachBall implements Colorable
{
    private double radius;
    private String color;
    private boolean inflated;

    public BeachBall(double radius, String color, boolean inflated)
    {
        this.radius = radius;
        this.color = color;
        this.inflated = inflated;
    }

    @Override
    public String getColor()
    {
        return color;
    }

    public boolean isBlue()
    {
        if (color.toLowerCase().equals("blue"))
        {
            boolean isBlue = true;
        }
        return false;
    }
}
