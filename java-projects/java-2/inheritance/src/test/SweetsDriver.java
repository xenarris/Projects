package test;

import sweets.Candy;
import sweets.Cupcake;

public class SweetsDriver
{
    public static void main(String[] args)
    {
        Cupcake cake = new Cupcake(true, 50, "Vanilla", false, true);
        cake.setCalories(600);

        System.out.println(cake.getCalories());
        System.out.println(cake.getFrosting());

        Candy jollyRanchers = new Candy(false, 34,"red", false,
                "jolly Ranchers", 20);
        System.out.println(jollyRanchers);
    }
}
