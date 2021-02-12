package splitting_strings;

import java.util.Arrays;

public class SplittingStrings
{
    public static void main(String[] args)
    {
        String input = "You are in a dark room : Turn on a flashlight = 1 | Run away = 2 | Cry = 3";

        //split on description / choices
        String[] descChoices = input .split(" : ");
        System.out.println(Arrays.toString(descChoices));

        String[] choices = descChoices[1].split(" \\| ");
        System.out.println(Arrays.toString(choices));

        String[] choice1 = choices[0].split(" = ");
        System.out.println(Arrays.toString(choice1));
    }
}
