package project;

public class ItemOrder extends Item
{
    private int quantity;

    public ItemOrder(String name, double price, int quantity)
    {
        super(name, price);
        this.quantity = quantity;

        if (quantity % 2 == 0)
        {
            this.setPrice(quantity * 2.00);
        }
        else if (quantity > 0)
        {
            int temp = quantity - 1;
            this.setPrice(temp * 2 + 3);
        }
    }

    public int getQuantity()
    {
        return quantity;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }

    @Override
    public String toString()
    {
        return "Ordered: " + quantity + " " + getName() + " for " + getPrice();
    }
}
