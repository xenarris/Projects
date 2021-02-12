package iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class BagTest
{
    public static void main(String[] args)
    {
        //create bag
        Bag myBag = new Bag(6);

        //add a few elements to the bag
        myBag.add("eloquent");
        myBag.add("hilarious");
        myBag.add("equestrian");

        System.out.println(myBag.toString());

        //doesn't work!
//        for (int i = 0; i < myBag.size(); i++)
//        {
//            System.out.println(myBag.get(i));
//        }

        Iterator<Object> it = myBag.iterator();
        while (it.hasNext())
        {
            String word = (String) it.next();
            System.out.println(word);
        }

        for (Object word : myBag)
        {
            System.out.println(word);
        }

        //for-each loop, enhanced for loop
        ArrayList<String> colors = new ArrayList<>();

        colors.add("blue");
        colors.add("red");
        colors.add("white");

        // these use iterators internally (syntactic sugar)
        for (String color : colors)
        {
            System.out.println(color);
        }

        //for each uses iterator internally
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }
}
