package pets;

public class Dog
{
    //fields
    private String name;
    private String breed;
    private boolean domesticated;
    private double weight;

    //default constructor
    public Dog()
    {
        name = "Fluffy";
        breed = "Boxer";
        domesticated = true;
        weight = 60;
    }
    //parameterized constructor
    public Dog(String name, String breed, boolean domesticated, double weight)
    {
        this.name = name;
        this.breed = breed;
        this.domesticated = domesticated;
        this.weight = weight;
    }

    //setters
    public void setName (String name)
    {
        if(name != null && name.equals(""))
        {
            this.name = name;
        }
    }

    public void setBreed(String breed)
    {
        if(breed != null && breed.equals(""))
        {
            this.breed = breed;
        }
    }

    public void setDomesticated(boolean domesticated)
    {
        this.domesticated = domesticated;
    }

    public void setWeight(double weight)
    {
        if (weight > 0)
        {
        this.weight = weight;
        }
    }

    //getters
    public String getName()
    {
        return name.toUpperCase();
    }

    public String getBreed()
    {
        return breed;
    }

    public boolean getDomesticated()
    {
        return domesticated;
    }
    public double getWeight()
    {
        return weight;
    }

    public void makeNoise()
    {
        System.out.println("rufffff");
    }

    public void  makeNoise(String noise)
    {
        System.out.println(noise);
    }

    public boolean isPopularBreed()
    {
        if(breed.equals("Pug") || breed.equals("Boxer"))
        {
            return true;
        }
        return false;
    }

//    public String toString()
//    {
//        return "Name: " + name;
//    }
}
