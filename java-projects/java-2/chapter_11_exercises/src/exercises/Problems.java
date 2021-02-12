package exercises;


import java.util.*;

/*
    Exercises: 5, 6, 8, 9, 16

    Jean-Kenneth Antonio
    IT 220
    February 13, 2020
 */
public class Problems
{
    public static void main(String[] args)
    {
        //problem 5
        List<Integer> integerList = new ArrayList<>();
        integerList.add(7);
        integerList.add(4);
        integerList.add(-9);
        integerList.add(4);
        integerList.add(15);
        integerList.add(8);
        integerList.add(27);
        integerList.add(7);
        integerList.add(11);
        integerList.add(-5);
        integerList.add(32);
        integerList.add(-9);
        integerList.add(-9);
        sortAndRemoveDuplicates(integerList);

        System.out.println();

        //problem 6
        List<Integer> integerList1 = new ArrayList<>();
        List<Integer> integerListEmpty = new ArrayList<>();
        integerList1.add(3);
        integerList1.add(7);
        integerList1.add(3);
        integerList1.add(-1);
        integerList1.add(2);
        integerList1.add(3);
        integerList1.add(7);
        integerList1.add(2);
        integerList1.add(15);
        integerList1.add(15);
        System.out.println("Filled List: " + countUnique(integerList1));
        System.out.println("Empty List: " + countUnique(integerListEmpty));

        System.out.println();

        //problem 8
        List<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("A");
        stringArrayList.add("Pot");
        stringArrayList.add("Is");
        stringArrayList.add("Possibly");
        stringArrayList.add("A");
        stringArrayList.add("Rare");
        stringArrayList.add("Object");
        System.out.println(maxLength(stringArrayList));

        System.out.println();

        //problem 9
        List<Integer> integerListEven = new ArrayList<>();
        integerListEven.add(2);
        integerListEven.add(4);
        integerListEven.add(16);
        integerListEven.add(80);

        System.out.println(hasOdd(integerList));
        System.out.println(hasOdd(integerListEven));
        System.out.println(hasOdd(integerListEmpty));

        System.out.println();

        //problem 16
        Map<String, String> mapExample = new HashMap<>();
        Map<String, String> mapExample2 = new HashMap<>();
        mapExample.put("Marty", "206-9024");
        mapExample.put("Hawking", "123-4567");
        mapExample.put("Smith", "949-0504");
        mapExample.put("Newton", "123-4567");

        mapExample2.put("Marty", "206-9024");
        mapExample2.put("Hawking", "555-1234");
        mapExample2.put("Smith", "949-0504");
        mapExample2.put("Newton", "123-4567");
        System.out.println(is1to1(mapExample));
        System.out.println(is1to1(mapExample2));

    }

    //problem 5
    private static void sortAndRemoveDuplicates(List<Integer> list)
    {
        Set<Integer> sortedList= new TreeSet<>();
        sortedList.addAll(list);
        for (int element: sortedList)
        {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    //problem 6
    private static int countUnique(List<Integer> list)
    {
        Set<Integer> tempList = new HashSet<>();
        tempList.addAll(list);

        return tempList.size();

    }

    //problem 8
    private static int maxLength(List<String> list)
    {
        String longestWord = "";
        for (String word: list)
        {
            if (word.length() > longestWord.length())
            {
                longestWord = word;
            }
        }
        return longestWord.length();
    }

    //problem 9
    private static boolean hasOdd(List<Integer> list)
    {
        for (int num : list)
        {
            if (num % 2 == 1)
            {
                return true;
            }
        }
        return false;
    }

    //problem 16
    private static boolean is1to1(Map<String, String> map)
    {
        int key = map.keySet().size();
        Set<String> tempString = new HashSet<>();

        tempString.addAll(map.values());

        int value = tempString.size();

        if (key == value)
        {
            return true;
        }
        return false;
    }

}
