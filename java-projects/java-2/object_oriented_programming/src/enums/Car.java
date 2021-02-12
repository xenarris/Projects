package enums;

public class Car
{
    private Make make;
    private Model model;
    private EngineType engineType;

    public Car(Make make, Model model, EngineType engineType)
    {
        this.make = make;
        this.model = model;
        this.engineType = engineType;
    }

    public Make getMake()
    {
        return make;
    }

    public Model getModel()
    {
        return model;
    }

    public EngineType getEngineType()
    {
        return engineType;
    }

    @Override
    public String toString()
    {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", engine='" + engineType + '\'' +
                '}';
    }
}
