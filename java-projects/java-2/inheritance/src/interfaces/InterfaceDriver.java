package interfaces;

public class InterfaceDriver
{
    public static void main(String[] args)
    {
        Laptop laptop = new Laptop(5, "Intel", "MSI", 400.0);
        Sandwich turkey = new Sandwich("Whole wheat", true, true, 6.0);
        Sandwich strawberryJam = new Sandwich("Buttermilk", false, false, 4.5);

        Buyable[] buyables = {laptop, turkey, strawberryJam};

        for (int i = 0; i < buyables.length; i++)
        {
            System.out.println("Price: $" + buyables[i].getPrice());
        }
    }
}
