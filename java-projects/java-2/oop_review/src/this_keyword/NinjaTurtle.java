package this_keyword;

public class NinjaTurtle
{
    private String bandanaColor;
    private String weapon;
    private String name;

    public NinjaTurtle()
    {
        //this is constructor chaining
        this("Blue", "Katana", "Leonardo");
    }

    public  NinjaTurtle(String name)
    {
        System.out.println(name);
        //this() must be the first statement in the constructor
    }

    public NinjaTurtle(String bandanaColor, String weapon, String name)
    {
        this.bandanaColor = bandanaColor;
        this.weapon = weapon;
        this.name = name;
    }

    public String getBandanaColor()
    {
        return bandanaColor;
    }

    public String getWeapon()
    {
        return weapon;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "NinjaTurtle{" +
                "bandanaColor='" + bandanaColor + '\'' +
                ", weapon='" + weapon + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
