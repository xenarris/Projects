package two_dimensional_arrays;

public class SlidePracticeArrays
{
    public static void main(String[] args)
    {
        //personalInfo();
        gridArray();
    }

    public static void personalInfo()
    {
        String[][] personalInfo = {
                {"Jean-Kenneth ", "R ", "Antonio"},
                {"232421 ", "North Place, Somewhere, WA ", "98032"},
                {"Reading ", "Gaming ", "Sleeping"}
        };

        for (int i = 0; i < personalInfo.length; i++)
        {
            for (int j = 0; j < personalInfo[i].length; j++)
            {
                System.out.print(personalInfo[i][j]);
            }
            System.out.println();
        }
    }

    public static void gridArray()
    {
        int[][] gridTable = new int[10][10];

        //create rows
        for (int i = 0; i < gridTable.length; i++)
        {
            //columns
            for (int j = 0; j < gridTable[i].length; j++)
            {
                gridTable[i][j] = (i + 1) * (j + 1);
            }

        }

        //print table
        for (int i = 0; i < gridTable.length; i++)
        {
            for (int j = 0; j < gridTable[i].length; j++)
            {
                if (gridTable[i][j] < 10)
                {
                    System.out.print("  ");
                }
                else if (gridTable[i][j] < 100)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }
                System.out.print(gridTable[i][j]);

            }
            System.out.println();
        }
    }
}
