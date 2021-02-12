package shapes;

public class Square extends Rectangle
{
    public Square(String shapeName, double length, double width)
    {
        super(shapeName, length, width);
    }

    public double area()
    {
        return (Math.pow(getLength(), 2));
    }

    public String toString()
    {
        return "Shape name: " + getShapeName()
                + "\nSquare side: " + getLength();
    }
}
