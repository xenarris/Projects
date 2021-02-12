package examples;

import java.util.ArrayList;

public class UsingJavasArrayList
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        //add()
        for (int i = 100; i < 1100 ; i += 100)
        {
            numbers.add(i);
        }
        System.out.println(numbers.toString());

        //size relate methods
        System.out.println("Size(): " + numbers.size());
        System.out.println("isEmpty(): " + numbers.isEmpty());

        //loop and remove all elements from the internal array
        numbers.clear();
        System.out.println("isEmpty(): " + numbers.isEmpty());
        System.out.println(numbers.toString());

        //add(index) - insert operation
        for (int i = 0; i <= 100; i++)
        {
            //causes shifting! - BAD!!
            numbers.add(0,i);
        }
        System.out.println(numbers.toString());

        //remove by index or element
        numbers.remove(new Integer(100));
        System.out.println(numbers.toString());

        numbers.remove(3);
        System.out.println(numbers.toString());

        //get() and set()
        System.out.println(numbers.get(0)); //akin to square bracket notation with arrays
        System.out.println(numbers.set(0,10000));
        System.out.println(numbers.toString());

        //contains()
        System.out.println("contains(): " + numbers.contains(10000));
        System.out.println("contains(): " + numbers.contains(20000));

        //looping over an arraylist (not like an array!)
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + " ");
        }

        //for-each loop (enhanced for loop
        for (int element : numbers) //auto unboxing
        {
            System.out.print(element + ", ");
        }
        System.out.println(); // new line

        //be usre to be careful whe ninteracting with operations
        //int he arraylist class (avoid shifting)

        numbers.clear();
        System.out.println("Starts work...");
        for (int i = 0; i < 1000000; i++)
        {
            numbers.add(0, i); // shifting is BAD!
        }
        System.out.println("End work...");
    }
}
