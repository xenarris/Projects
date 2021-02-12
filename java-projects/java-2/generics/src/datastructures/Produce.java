package datastructures;

public class Produce
{
    private String type;

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public Produce(String type)
    {
        this.type = type;
    }

    @Override
    public String toString()
    {
        return "Produce{" +
                "type='" + type + '\'' +
                '}';
    }
}
