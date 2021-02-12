package examples;

public class LoopingOverArrays
{
    public static void main(String[] args)
    {
        String[] petNames = {"fluffy", "chonkers", "furrball", "fuzzbucket", "fluffers", "rascal"};
        for (int i = 0; i < petNames.length; i++)
        {
            petNames[i] = petNames[i].toUpperCase();
            petNames[i] = petNames[i].replace("A","@");
            System.out.println(petNames[i]);
        }
    }

    public static void changeNums()
    {
        //declare an array with 6 numbers
        int[] numbers = new int[6];

        numbers[0] = 13;
        numbers[1] = 3;
        numbers[2] = 17;
        numbers[3] = -1;
        numbers[4] = -5;
        numbers[5] = 0;

        //increment each number
        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] *= 2;
        }

        //print it out
        for (int i = 0; i <numbers.length ; i++)
        {
            System.out.println(numbers[i]);
        }

    }

    public static  void coins()
    {
        //coin flips () true is heads, false is tails
        boolean[] coinFlips = {true, true, false, true, false, false, false, false, true,
                false, true, true, true, true, true, false, false, true};

        for (int i = 0; i < coinFlips.length; i++)
        {
            if (coinFlips[i] == true)
            {
                System.out.println("Heads!");
            }
            else
            {
                System.out.println("Tails!");
            }
        }
    }
}
