package interfaces;

public class Laptop implements Buyable
{
    private int memorySize;
    private String processor;
    private String motherboard;
    private double price;

    public Laptop(int memorySize, String processor, String motherboard, double price)
    {
        this.memorySize = memorySize;
        this.processor = processor;
        this.motherboard = motherboard;
        this.price = price;
    }

    public int getMemorySize()
    {
        return memorySize;
    }

    public void setMemorySize(int memorySize)
    {
        this.memorySize = memorySize;
    }

    public String getProcessor()
    {
        return processor;
    }

    public void setProcessor(String processor)
    {
        this.processor = processor;
    }

    public String getMotherboard()
    {
        return motherboard;
    }

    public void setMotherboard(String motherboard)
    {
        this.motherboard = motherboard;
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

    public boolean isBuyable()
    {
        return false;
    }

    @Override
    public String toString()
    {
        return "Laptop{" +
                "memorySize=" + memorySize +
                ", processor='" + processor + '\'' +
                ", motherboard='" + motherboard + '\'' +
                '}';
    }
}
