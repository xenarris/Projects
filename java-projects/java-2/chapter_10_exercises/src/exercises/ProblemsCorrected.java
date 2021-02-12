package exercises;

/*
    Jean-Kenneth Antonio
    02/05/2020

Exercises: 3, 4, 5, 6,
Programming Projects: 1
 */

import java.util.ArrayList;

public class ProblemsCorrected
{
    public static void main(String[] args)
    {
        //exercises 3-6
        ProblemsCorrected problems = new ProblemsCorrected();

        //Problem 3
        ArrayList<String> list = new ArrayList<>();
        list.add("Jake");
        list.add("Martha");
        list.add("Sam");
        list.add("Mark");

        System.out.println(list);
        removeEvenLength(list);
        System.out.println(list);

        System.out.println();

        //Problem 4
        ArrayList<String> sentence = new ArrayList<>();
        sentence.add("how");
        sentence.add("are");
        sentence.add("you?");

        System.out.println(sentence);
        doubleList(sentence);
        System.out.println(sentence);

        System.out.println();

        //Problem 5
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(4);
        intList.add(1);
        intList.add(2);
        intList.add(0);
        intList.add(3);

        System.out.println(intList);
        scaleByK(intList);
        System.out.println(intList);

        System.out.println();

        //Problem 6
        ArrayList<Integer> intList2 = new ArrayList<>();
        intList2.add(3);
        intList2.add(8);
        intList2.add(92);
        intList2.add(4);
        intList2.add(2);
        intList2.add(17);
        intList2.add(9);

        System.out.println(intList2);
        minToFront(intList2);
        System.out.println(intList2);

    }

    //Problem 3
    private static void removeEvenLength(ArrayList<String> list)
    {
        String test = "";
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            test = list.get(i);
            if (test.length() % 2 == 0)
            {
              indexes.add(i);
            }
        }

        for (int i = indexes.size() - 1 ; i >= 0; i--)
        {
            int index = indexes.get(i);
            list.remove(index);
        }
    }

    //Problem 4
    private static void doubleList(ArrayList<String> list)
    {
        ArrayList<String> addList = new ArrayList<>();

        addList.addAll(list);
        list.clear();

        for (int i = 0; i < addList.size(); i++)
        {
            list.add(addList.get(i));
            list.add(addList.get(i));
        }
    }

    //Problem 5
    private static void scaleByK(ArrayList<Integer> list)
    {
        ArrayList<Integer> newList = new ArrayList<>();
        newList.addAll(list);
        list.clear();

        for (int i = 0; i < newList.size(); i++)
        {
            for (int j = 0; j < newList.get(i); j++)
            {
                list.add(newList.get(i));
            }

        }
    }

    //Problem 6
    private static void minToFront(ArrayList<Integer> list)
    {
        int smallest = list.get(0);
        int index = 0;

        for (int i = 0; i < list.size(); i++)
        {
            if (list.get(i) < smallest)
            {
                smallest = list.get(i);
                index = i;
            }
        }

        list.remove(index);
        list.add(0,smallest);
    }

}
