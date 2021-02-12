package exercises;

import java.awt.*;
import java.util.Arrays;

public class PointMain
{
    public static void main(String[] args)
    {
        Point p1 = new Point(0,0);
        Point p2 = new Point(1,1);
        Point p3 = new Point(1,-1);
        Point p4 = new Point(-1,-1);
        Point p5 = new Point(-1,1);

        Point[] pArray = {p1, p2, p3, p4, p5};

        System.out.println(Arrays.toString(pArray));

        for (int i = 0; i < 5 ; i++)
        {
            System.out.println(pArray[i].quadrant());
        }

        System.out.println(p2.slope(p3));

        p3.flip();
        System.out.println(p3.toString());

        System.out.println(p4.isVertical(p5));

        System.out.println(p1);
    }

}
