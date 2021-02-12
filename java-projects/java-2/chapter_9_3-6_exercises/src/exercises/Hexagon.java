package exercises;

public class Hexagon implements Shape
{
    private double sideLength;

    public Hexagon(double sideLength)
    {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea()
    {
        return ((3 * Math.sqrt(3)) / 2) * Math.pow(sideLength, 2);
    }

    @Override
    public double getPerimeter()
    {
        return sideLength * 6;
    }
}
