package arraylists;

import java.util.ArrayList;

public class FunWithArrayLists
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<>();
        words.add("Something");
        words.add("Banana");
        words.add("Ladder");
        words.add("Mask");
        words.add("Super");
        words.add("Cake");

//        for (int i = 0; i < words.size(); i++)
//        {
//            words.remove(i);
//        }

        for (String word: words)
        {
            System.out.println(word);
        }

//        int numElements = 10000000;
//        ArrayList<Integer> numbers = new ArrayList<>();
//
//        System.out.println("Start Adding");
//
//        for (int i = 0; i < numElements; i++)
//        {
//            numbers.add(0,i);
//        }
//
//        System.out.println("Ended adding");
    }
}
