package transport;

public class TestBicycle
{
    public static void main(String[] args)
    {
        Bicycle diamondback = new Bicycle();
        Bicycle giant = new Bicycle("Giant", 6, 55.0);

        System.out.println(diamondback);
        System.out.println(giant);
    }
}
