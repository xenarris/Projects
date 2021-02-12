package project;

import java.util.ArrayList;

public class ShoppingCart
{
    public static void main(String[] args)
    {
        ArrayList<Item> shoppingCart = new ArrayList<>();

        ItemOrder tissues = new ItemOrder("tissue", 2.00, 5);

        shoppingCart.add(tissues);

        System.out.println(shoppingCart);
        totalPrice(shoppingCart);

    }

    public static void totalPrice(ArrayList<Item> list)
    {
        double total = 0.0;

        for (int i = 0; i < list.size(); i++)
        {
            total = total + list.get(i).getPrice();
        }
        System.out.println("Total Price: $" + total);
    }
}
