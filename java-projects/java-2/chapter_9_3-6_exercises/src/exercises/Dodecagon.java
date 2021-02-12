package exercises;

public class Dodecagon implements Shape
{
    private double sideLength;

    public Dodecagon(double sideLength)
    {
        this.sideLength = sideLength;
    }

    @Override
    public double getPerimeter()
    {
        return sideLength * 12;
    }

    @Override
    public double getArea()
    {
        return 3 * Math.pow(sideLength, 2) * (2 + Math.sqrt(3));
    }
}
