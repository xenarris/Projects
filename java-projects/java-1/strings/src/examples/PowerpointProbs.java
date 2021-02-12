package examples;

public class PowerpointProbs
{
    public static void main(String[] args)
    {
        System.out.println(findLastWord("Sabrina LaGasse name"));
       // System.out.println(reverse("Hello again sir"));
        //System.out.println(removeDigits("Address: 9900 Apple Ln. Tacoma, WA 99088"));
        //String reverseString = reverse("Hello again sir");
        //System.out.println(reverseString);
    }
    public static String findLastWord(String sentence)
    {
        /* OUR FIRST TRY.
        //removes trailing white space
        String newString = sentence.trim();

        for (int i = newString.length() -1; i >= 0 ; i--)
        {
            char myCharacter = newString.charAt(i);
            if (Character.isWhitespace(myCharacter))
            {
                newString = newString.substring(i +1);
                break;
            }
        }
        return newString;

         */
        return sentence.substring(sentence.lastIndexOf(" ") + 1);
    }

    public static String reverse(String input)
    {
        String newString = "";

        for (int i = input.length() -1 ; i >= 0 ; i--)
        {
            newString += input.charAt(i);
        }
        return newString;

        /* JOSH'S CODE
        String result = "";
        for (int i = 0; i < input.length() ; i++)
        {
            char nextChar = input.charAt(i);
            result = nextChar + result;
            System.out.println(result);
        }
        return result;
         */
    }
    public static String removeDigits(String source)
    {
        String newString = "";
        for (int i = 0; i < source.length() ; i++)
        {
            char myChar = source.charAt(i);
            if (!Character.isDigit(myChar))
            {
                newString += myChar;
            }
        }
        return newString;
    }
}
