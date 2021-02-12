package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises
{
    private static ArrayList<String> favWords = new ArrayList<>();

    public static void main(String[] args)
    {

        favWords.add("concatenation");
        favWords.add("ok");
        favWords.add("alrighty");
        favWords.add("understand");
        favWords.add("frustration");
        favWords.add("poppycock");

        Scanner input = new Scanner (System.in);
        System.out.println("Enter a search term: ");

        String search = input.nextLine();
        System.out.println("ArrayList contains() method output: " + favWords.contains(search));
        System.out.println("Our contains() method output: " + contain(search));



    }

    private static boolean contain(String input)
    {
        ArrayList<String> temp = favWords;
        boolean found = false;

       while (temp.size() > 0 && found == false)
       {
           if (input.equals(temp.get(temp.size() - 1)))
           {
               found = true;
           }
           else
           {
               temp.remove(temp.size() - 1);
               System.out.println("test");
           }

       }

       return found;
    }


}
