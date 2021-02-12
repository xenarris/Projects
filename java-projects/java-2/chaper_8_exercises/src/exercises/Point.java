/*
    Exercises 1, 2, 4, 5 of chapter 8 of Building Java Programs A Back to Basics Approach 5th Edition Stuart Reges
    Jean-Kenneth Antonio
    January 7, 2020
 */
package exercises;

public class Point
{
    int x;
    int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int quadrant()
    {
        if (this.x < 0 && this.y < 0)
        {
            return 3;
        }
        else if (this.x < 0 && this.y > 0)
        {
            return 4;
        }
        else if (this.x > 0 && this.y < 0)
        {
            return 2;
        }
        else if (this.x > 0 && this.y > 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    public void flip()
    {
        int tempX = this.x;
        int tempY = this.y;
        this.y = tempX;
        this.x = tempY;
    }

    public boolean isVertical(Point other)
    {
        return this.x == other.x;
    }

    public double slope(Point other)
    {
        double slope = 0;
        try
        {
            slope = ((double) other.y - this.y) / ((double) other.x - this.x);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Error, x values cannot be the same");
        }
        return slope;
    }

    @Override
    public String toString()
    {
        return "Point[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
