package shapes;

public class Circle extends Ellipse
{
    public Circle(String shapeName, double hDimension, double vDimension)
    {
        super(shapeName, hDimension, vDimension);
    }

    public double area()
    {
        return (Math.PI * Math.pow(gethDimension(), 2));
    }

    public String toString()
    {
        return "Shape name: " + getShapeName()
                + "\nCircle radius: " + gethDimension();
    }
}
