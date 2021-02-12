package exercises;

public class AdvanceTicket extends Ticket
{
    private int daysAdvanced;

    public AdvanceTicket(double number, int daysAdvanced)
    {
        super(number);
        this.daysAdvanced = daysAdvanced;
    }

    @Override
    public double getPrice()
    {
        if (daysAdvanced >= 10)
        {
            return super.getPrice() - 20;
        }
        else
        {
            return super.getPrice() - 10;
        }

    }
}
