package shapes;

public class Ellipse extends Shape
{
    private double hDimension;
    private double vDimension;

    public Ellipse(String shapeName, double hDimension, double vDimension)
    {
        super(shapeName);
        this.hDimension = hDimension;
        this.vDimension = vDimension;
    }

    public double gethDimension()
    {
        return hDimension;
    }

    public void sethDimension(double hDimension)
    {
        this.hDimension = hDimension;
    }

    public double getvDimension()
    {
        return vDimension;
    }

    public void setvDimension(double vDimension)
    {
        this.vDimension = vDimension;
    }

    public double area()
    {
        return (Math.PI * vDimension * hDimension);
    }

    @Override
    public String toString()
    {
        return "Shape name: " + getShapeName()
                + "\nEllipse horizontal dimension: " + hDimension
                + "\nEllipse vertical dimension " + vDimension;
    }
}
