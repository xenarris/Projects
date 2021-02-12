package exercises;

public class Octagon implements Shape
{
    private double sideLength;

    public Octagon(double sideLength)
    {
        this.sideLength = sideLength;
    }

    @Override
    public double getArea()
    {
        return 2 * (1 + Math.sqrt(2)) * Math.pow(sideLength, 2);
    }

    @Override
    public double getPerimeter()
    {
        return sideLength * 8;
    }
}
