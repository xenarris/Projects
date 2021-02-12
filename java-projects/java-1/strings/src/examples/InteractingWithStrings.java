package examples;

public class InteractingWithStrings
{
    public static void main(String[] args)
    {
        String address = "1000 apple ln. Seattle, Wa 98999";

        //count the number of alphabetical char, digits, and spaces
        int digitCount = 0, alphaCount = 0, spacesCount = 0;
        for (int i = 0; i < address.length(); i++)
        {
            char nextChar = address.charAt(i);

            if (Character.isDigit(nextChar))
            {
                digitCount++;
            }
            else if (Character.isAlphabetic(nextChar))
            {
                alphaCount++;
            }
            else if (Character.isSpaceChar(nextChar))
            {
                spacesCount++;
            }

        }

        System.out.println("Numeric digits: " + digitCount);
        System.out.println("Alphabetical chars: "  + alphaCount);
        System.out.println("Spaces: " + spacesCount);
        System.out.println("All char: " + address.length());
    }
}
