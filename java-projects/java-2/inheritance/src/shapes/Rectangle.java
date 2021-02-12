package shapes;

import interfaces.IShapeWithArea;

public class Rectangle extends Shape implements IShapeWithArea
{
    private double length;
    private double width;

    public Rectangle(String shapeName, double length, double width)
    {
        super(shapeName);
        this.length = length;
        this.width = width;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getWidth()
    {
        return width;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }

    public double area()
    {
        return length * width;
    }

    @Override
    public String toString()
    {
        return "Shape name: " + getShapeName()
                + "\nRectangle length: " + length
                + "\nRectangle width: " + width;
    }
}
