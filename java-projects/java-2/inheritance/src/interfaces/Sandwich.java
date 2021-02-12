package interfaces;

public class Sandwich implements Buyable
{
    private String bread;
    private boolean hasMeat;
    private boolean hasCheese;
    private double price;

    public Sandwich(String bread, boolean hasMeat, boolean hasCheese, double price)
    {
        this.bread = bread;
        this.hasMeat = hasMeat;
        this.hasCheese = hasCheese;
        this.price = price;
    }

    public String getBread()
    {
        return bread;
    }

    public void setBread(String bread)
    {
        this.bread = bread;
    }

    public boolean isHasMeat()
    {
        return hasMeat;
    }

    public void setHasMeat(boolean hasMeat)
    {
        this.hasMeat = hasMeat;
    }

    public boolean isHasCheese()
    {
        return hasCheese;
    }

    public void setHasCheese(boolean hasCheese)
    {
        this.hasCheese = hasCheese;
    }

    @Override
    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    @Override
    public boolean isBuyable()
    {
        return true;
    }

    @Override
    public String toString()
    {
        return "Sandwich{" +
                "bread='" + bread + '\'' +
                ", hasMeat=" + hasMeat +
                ", hasCheese=" + hasCheese +
                '}';
    }
}
