package maps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Exercises
{
    public static void main(String[] args)
    {
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(4);
        intList.add(6);

        System.out.println(numDupes(intList));

        String sentence = "a Good Morning!";
        stringFreq(sentence);

        readFile();

    }
    private static void readFile()
    {
        boolean finished = false;
        Scanner userInput = new Scanner(System.in);
        do
        {
            System.out.println("Enter 1 to exit.");
            System.out.println("Enter word: ");
            String word = userInput.nextLine();

            word = word.toLowerCase();

            Map<String, String> ourMap = new HashMap<>();
            try (Scanner reader = new Scanner(new FileInputStream("files/dictionary.txt")))
            {
                while (reader.hasNextLine())
                {
                    String line = reader.nextLine();
                    String[] definition = line.split(":");
                    ourMap.put(definition[0], definition[1]);
                }
            } catch (FileNotFoundException ex)
            {
                System.out.println("Error reading file.");
            }

            if (ourMap.containsKey(word))
            {
                System.out.println(ourMap.get(word));
            } else if (word.equals("1"))
            {
                finished = true;
            }
            else
            {
                System.out.println("No such word");
            }
        }
        while (!finished);
    }

    private static void stringFreq(String input)
    {
        Map<Character, Integer> charMap = new TreeMap<>();
        charMap.put('a', 0);
        charMap.put('e', 0);
        charMap.put('i', 0);
        charMap.put('o', 0);
        charMap.put('u', 0);

        for (int i = 0; i < input.length(); i++)
        {
            if (input.charAt(i) == 'a')
            {
                charMap.put('a', charMap.get('a') + 1);
            }
            if (input.charAt(i) == 'e')
            {
                charMap.put('e', charMap.get('e') + 1);
            }
            if (input.charAt(i) == 'i')
            {
                charMap.put('i', charMap.get('i') + 1);
            }
            if (input.charAt(i) == 'o')
            {
                charMap.put('o', charMap.get('o') + 1);
            }
            if (input.charAt(i) == 'u')
            {
                charMap.put('u', charMap.get('u') + 1);
            }
        }
        System.out.println(charMap);
    }

    private static int numDupes(ArrayList<Integer> integerArrayList)
    {
        Set<Integer> numSet = new HashSet<>();
        numSet.addAll(integerArrayList);

        return integerArrayList.size() - numSet.size();
    }


}
