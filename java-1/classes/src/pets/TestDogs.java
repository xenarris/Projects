package pets;

import java.util.Arrays;

public class TestDogs
{
    public static void main(String[] args)
    {
        //instantiate the dog class
        Dog sparky = new Dog("Sparky","pug",true, 4.5);
        Dog beauregard = new Dog("Beauregard", "Golden Retriever",
                true, 30.5);
        Dog fluffy = new Dog();

        // we use dot notation to access or change field data
        System.out.println(sparky.getName() + " is a " + sparky.getBreed());

        sparky.setBreed("Puggle");
        System.out.println(sparky.getName() + " is a " + sparky.getBreed());

        sparky.makeNoise();
        beauregard.makeNoise("ruff ruff");
        System.out.println(sparky.isPopularBreed());
        System.out.println(fluffy.isPopularBreed());

        sparky.setWeight(-10);
        System.out.println("Sparky Weight: " + sparky.getWeight());

        System.out.println(sparky);
        System.out.println(beauregard);
        System.out.println(fluffy);
    }

}
