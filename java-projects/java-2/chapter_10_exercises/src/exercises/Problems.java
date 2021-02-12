package exercises;

import java.util.ArrayList;
import java.util.List;

public class Problems
{
    public static void main(String[] args)
    {
        //self check problems 3-6
        selfCheckProblems();
        System.out.println();

        //exercise problem 1
        ArrayList<String> emptyList = new ArrayList<>();
        System.out.println("Empty list average: " + averageVowels(emptyList));

        ArrayList<String> filledList = new ArrayList<>(List.of("It", "was", "a", "stormy", "night"));
        System.out.println("Filled list average: " + averageVowels(filledList)); // I counted the vowels uppercase and lowercase;


    }

    private static void selfCheckProblems()
    {
        //problem 3 self-check
        ArrayList<String> arrayList = new ArrayList<>(List.of("It", "was", "a", "stormy", "night"));
        System.out.println(arrayList);

        //problem 4 self-check
        arrayList.add(3, "and");
        arrayList.add(3, "dark");
        System.out.println(arrayList);

        //problem 5 self-check
        arrayList.set(1, "IS");
        System.out.println(arrayList);

        //problem 6 self-check
        arrayList.remove(2);
        System.out.println(arrayList);
    }

    //problem 1 exercises
    private static double averageVowels(ArrayList<String> list)
    {
        double vowelCount = 0;
        String stringElement;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        if (list.size() == 0)
        {
            return 0.0;
        }

        for (int i = 0; i < list.size(); i++)
        {
            stringElement = list.get(i).toLowerCase();

            for (int j = 0; j < stringElement.length(); j++)
            {
                char letter = stringElement.charAt(j);
                for (int k = 0; k < vowels.length; k++)
                {
                    if (letter == vowels[k])
                    {
                        vowelCount++;
                    }
                }
            }
        }
        return vowelCount / list.size();
    }
}
