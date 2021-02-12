package applications;

public class CountingParts
{
    public static void main(String[] args)
    {
        String sentence = "We went to the movie at 7pm.";
        String[] words = sentence.split("[w].*?[t]");

        for (int i = 0; i < words.length; i++)
        {
            System.out.println("Word: " + words[i]);
        }

        char[] characters = sentence.toCharArray();
        for (int i = 0; i < characters.length; i++)
        {
            System.out.println(characters[i]);
        }
    }
}
