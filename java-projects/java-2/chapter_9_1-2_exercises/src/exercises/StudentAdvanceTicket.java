package exercises;

public class StudentAdvanceTicket extends AdvanceTicket
{
    public StudentAdvanceTicket(double number, int daysAdvanced)
    {
        super(number, daysAdvanced);
    }

    @Override
    public double getPrice()
    {
        return super.getPrice() / 2.0;
    }

    @Override
    public String toString()
    {
        return super.toString() + " (ID required)";
    }
}
