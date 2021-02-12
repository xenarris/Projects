package shapes;

public abstract class Shape
{
    private String shapeName;

    public Shape(String shapeName)
    {
        this.shapeName = shapeName;
    }

    public String getShapeName()
    {
        return shapeName;
    }

    public void setShapeName(String shapeName)
    {
        this.shapeName = shapeName;
    }

    public abstract double area();

    @Override
    public String toString()
    {
        return "Shape name: " + shapeName;
    }
}
