package points;

public class TestPlane
{

    public static void main(String[] args)
    {
        //create and add points
        CartesianPlane plane = new CartesianPlane("My Plane", 10);

        plane.addPoint(0,0);
        plane.addPoint(1,2);
        plane.addPoint(3,4);
        plane.addPoint(5,6);

        //create a new object based upon the plane instance
        CartesianPlane.Point myPoint = new CartesianPlane.Point(1,2);

        //print out the points
        System.out.println(plane.toString());
    }

}
