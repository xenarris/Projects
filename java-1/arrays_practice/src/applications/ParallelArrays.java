package applications;

public class ParallelArrays
{
    public static void main(String[] args)
    {
        String[] dates = {
                "10/31/2019",
                "7/4/2019",
                "8/23/2019"
        };

        String[] names = {
                "Halloween Party",
                "Fourth of July",
                "Some gathering"
        };

        int[] rsvps = {12, 6, 19};

        //search for 4th of july event
        for (int i = 0; i < names.length; i++)
        {
            if (names[i].equals("Fourth of July"))
            {
                System.out.println("Yes!");
            }
        }

        //search date
        for (int i = 0; i < names.length; i++)
        {
            if (dates[i].equals("7/4/2019"))
            {
                System.out.println("Yes!");
            }
        }

        //print arrays
        for (int i = 0; i < dates.length; i++)
        {
            System.out.println(dates[i] + ": " + names[i] + " (" + rsvps[i] + ")");
        }
    }
}
