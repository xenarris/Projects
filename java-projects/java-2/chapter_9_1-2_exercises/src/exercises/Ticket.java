package exercises;

public class Ticket
{
    private double number;

    public Ticket(double number)
    {
        this.number = number;
    }

    public double getPrice()
    {
        return 50.0;
    }

    @Override
    public String toString()
    {
        return "Number: " + number + ", Price: " + getPrice();
    }
}

