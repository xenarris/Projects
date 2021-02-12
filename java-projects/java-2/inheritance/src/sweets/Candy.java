package sweets;

public class Candy extends Sweet
{
    private String color;
    private boolean isSoft;
    private String name;
    private double weight;

//    public Candy()
//    {
//        color = "blue";
//        name = "Jolly Rancher";
//        isSoft = false;
//        weight = 32;
//    }

    public Candy(boolean homeMade, int calories, String color, boolean isSoft, String name, double weight)
    {
        super(homeMade, calories);
        this.color = color;
        this.isSoft = isSoft;
        this.name = name;
        this.weight = weight;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public boolean isSoft()
    {
        return isSoft;
    }

    public void setSoft(boolean soft)
    {
        isSoft = soft;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getWeight()
    {
        return weight;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Candy{" +
                "color='" + color + '\'' +
                ", isSoft=" + isSoft +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
