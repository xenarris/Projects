/*
    This is a practice of inheritances.

    Name: Jean-Kenneth Antonio, Thristen Owens, Paul Butler
    Date: January 14, 2020
    IT 220

 */

package shapes;

import shapes.*;

public class ShapeDriver
{
    public static void main(String[] args)
    {
        Shape rectangle = new Rectangle("Sponge", 14.0, 10.0);
        Shape square = new Square("Bob", 15, 15);
        Shape ellipse = new Ellipse("Milky", 5, 10);
        Shape circle = new Circle("Way", 7, 7);
        Shape rightTriangle = new RightTriangle("Way", 5, 8);

        Shape[] shapes = {rectangle, square, rightTriangle, ellipse, circle};

        for (int i = 0; i < shapes.length; i++)
        {
            System.out.println(shapes[i].toString());
            System.out.println("Area: " + shapes[i].area());
            System.out.println();
        }
    }

    public static void printMe(Object thing)
    {
        System.out.println(thing.toString());
    }
}
