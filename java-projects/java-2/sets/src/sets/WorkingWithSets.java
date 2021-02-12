package sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WorkingWithSets
{
    public static void main(String[] args)
    {
        //basics();
        example();
    }


    private static void basics()
    {
        //built for speed - uses a hash table internally
        HashSet<String> words = new HashSet<>();

        //built for ordering elements - uses a binary search tree internally
        TreeSet<Integer> numbers = new TreeSet<>();

        //both set classes use the Set<T> interface
        Set<String> names = new TreeSet<>();

        //add()
        String[] elements = {"Terry", "Cho", "Alice", "Terrence", "Tyler", "Isabella", "Isabella"};
        for (int i = 0; i < elements.length; i++)
        {
            names.add(elements[i]);
        }

        //iterate over the elements in the set
        for (int i = 0; i < names.size(); i++)
        {

        }

        // we need to use the enhanced for loop
        for (String name : names)
        {
            System.out.println(name);
        }

        //other methods - contains(), remove()
        System.out.println();
        System.out.println(names.contains("Isabella"));
        names.remove("Isabella");
        System.out.println(names.contains("Isabella"));

        //set methods - UNION (join together all the elements in the two sets)
        Set<String> otherNames = new TreeSet<>();
        otherNames.add("Billie");
        otherNames.add("Valeria");

        names.addAll(otherNames); // the names set will contain the ressuilt of the union

        System.out.println();
        for (String name : names)
        {
            System.out.println(name);
        }

        System.out.println();
        for (String name : otherNames)
        {
            System.out.println(name);
        }

        //set methods - INTERSECTION (remove all elements that are not shared in two sets)
        otherNames = new TreeSet<>();
        otherNames.add("William");
        otherNames.add("Terrence");
        otherNames.add("Cho");

        names.retainAll(otherNames); // the names set will contain the result of the intersection

        System.out.println();
        for (String name : names)
        {
            System.out.println(name);
        }

        //set methods - DIFFERENCE (remove all elements in a set from another set)
        otherNames.removeAll(names); // the otherNames will contain the result of the difference

        System.out.println();
        for (String name : otherNames)
        {
            System.out.println(name);
        }
    }

    private static void example()
    {
        char[] letters = {'a', 's', 'b', 's', 'z', 'w', 'b', 'a', 'b'};

        // with a group of elements, is there a duplicate?
        Set<Character> letterSet = new HashSet<>();
        for (int i = 0; i < letters.length; i++)
        {
            letterSet.add(letters[i]);
        }
        System.out.println("Duplicates? " + (letters.length != letterSet.size()));

        //how many duplicates?
        System.out.println("Number of duplicates: " + (letters.length - letterSet.size()));

        // what are the duplicates?


    }

}
