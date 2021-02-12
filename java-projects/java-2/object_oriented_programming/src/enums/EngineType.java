package enums;

public enum EngineType
{
    V4(4, 60),
    V6(6, 220),
    V8(8, 300);

    private int cylinders;
    private int horsepower;

    private EngineType(int cylinders, int horsepower)
    {
        this.cylinders = cylinders;
        this.horsepower = horsepower;
    }

    public int getCylinders()
    {
        return cylinders;
    }

    public int getHorsepower()
    {
        return horsepower;
    }
}
