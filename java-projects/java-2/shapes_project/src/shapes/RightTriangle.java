package shapes;

public class RightTriangle extends Shape
{
    private double base;
    private double height;

    public RightTriangle(String shapeName, double base, double height)
    {
        super(shapeName);
        this.base = base;
        this.height = height;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double area()
    {
        return ((base * height) / 2.0);
    }

    @Override
    public String toString()
    {
        return "Shape name: " + getShapeName()
                + "\nRightTriangle base: " + base
                + "\nRightTriangle height: " + height;
    }
}
