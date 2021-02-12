package interfaces;

import java.awt.*;

public class InterfaceDriver
{
    public static void main(String[] args)
    {
        //dissimilar objects
        Pokemon myPokemon = new Pokemon();
        Person bob = new Person("Bob", "Smith");
        Person tiffany = new Person("Tiffany", "Smith");
        BeachBall ball = new BeachBall(12.5, "Blue", true);

        //dynamic grouping
        Nameable[] nameAbles = {myPokemon, bob, tiffany};
        Colorable[] colorAbles = {ball, myPokemon};

        //dynamic actions
        for (int i = 0; i < nameAbles.length; i++)
        {
            System.out.println("Name: " + nameAbles[i].getFirstName());
        }
        for (int i = 0; i < colorAbles.length; i++)
        {
            System.out.println("Color: " + colorAbles[i].getColor());
        }

    }
}
