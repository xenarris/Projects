package practice;

public class ArraysPracticeProblems
{
    public static void main(String[] args)
    {
        problem1();
        System.out.println();
        problem2();
        System.out.println();
        problem3();
    }

    public static void problem1()
    {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        for (int i = 0; i < daysOfWeek.length; i++)
        {
            System.out.println(daysOfWeek[i]);
        }
        System.out.println();
        for (int i = 0; i < daysOfWeek.length; i++)
        {
            if (daysOfWeek[i].equals("Monday"))
            {
                daysOfWeek[i] = "Saturday";
            }
            System.out.println(daysOfWeek[i]);
        }
    }

    public static void problem2()
    {
        int[] intArray = new int[50];

        for (int i = 0; i < intArray.length; i++)
        {
            intArray[i] = i * 2 + 2;
        }

        for (int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }

    public static void problem3()
    {
        double[] doubleArray = new double[10];
        double sum = 0;

        for (int i = 0; i < doubleArray.length; i++)
        {
            doubleArray[i] = i + 1.5;
            //System.out.println(doubleArray[i]);
        }

        for (int i = 0; i < doubleArray.length; i++)
        {
            sum += doubleArray[i];
            System.out.println(sum);
        }
    }
}
