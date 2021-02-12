package points;

public class CartesianPlane
{
    private String name;
    private Point[] points;

    public CartesianPlane(String name, int maxNumPoints)
    {
        this.name = name;
        points = new Point[maxNumPoints];
    }

    public void addPoint(double x, double y)
    {
        //create a new point
        Point myPoint = new Point(x,y);

        //find a spot for the point
        for (int i = 0 ; i < points.length; i++)
        {
            if (points[i] == null)
            {
                points[i] = myPoint;
                break;
            }
        }
    }

    public String toString()
    {
        String result = "Plane: " + name + "\n";

        for (int i = 0; i < points.length; i++)
        {
            if (points[i] != null)
            {
                result += points[i].x + ", " + points[i].y +"\n";
                points[i].printContainingPlane();
            }
        }
        return result;
    }

    //we can put a class within a class
    //we can also make this private or public
    //when putting a class in a class put it in the bottom
    //add static to break the relationship to the outer class
    //try to always make inner class static
    public static class Point
    {
        private double x,y;

        public Point(double x, double y)
        {
            this.x = x;
            this.y = y;
        }

        public void printContainingPlane()
        {
            //i want to print the CartesianPlane object that was used
            //to create this Point object
            //System.out.println(CartesianPlane.this.name);
        }

        public double getX()
        {
            return x;
        }

        public void setX(double x)
        {
            this.x = x;
        }

        public double getY()
        {
            return y;
        }

        public void setY(double y)
        {
            this.y = y;
        }

        @Override
        public String toString()
        {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }
}
