package enums;

public class TestCars
{
    public static void main(String[] args)
    {
        Car bug = new Car(Make.VOLKSWAGON, Model.BUG, EngineType.V4);
        Car van = new Car(Make.HONDA, Model.ODYSSEY, EngineType.V6);

        if (bug.getMake() == Make.VOLKSWAGON)
        {
            System.out.println("Nice car!");
        }

        if (van.getModel() == Model.ODYSSEY)
        {
            System.out.println("Where you going in that van?");
        }

        if (van.getEngineType() == EngineType.V6)
        {
            System.out.println("That car has some \"get up and go\"");
        }

        System.out.println(van.getEngineType().getCylinders());
        System.out.println(van.getEngineType().getHorsepower());
    }
}
