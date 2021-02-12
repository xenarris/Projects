package applications;

import java.util.Random;

public class Sorting
{
    public static void main(String[] args)
    {
        //create test array and sort it
//        int[] input = {7, 3, 1, 9, 5, 4, 1};
        int[] array = createRandomArray(100000);
        bubbleSort(array);

        //print out all elements and see of they are sorted!
        for (int i = 0; i < array.length; i++)
        {
            System.out.println(array[i]);
        }


    }

    public static void bubbleSort(int[] array)
    {
        //bubble the highest element to the highest index
        for (int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < array.length - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    //swapping, we are going to this often in data structures
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

    }

    public static int[] createRandomArray(int size)
    {
        // create the array
        Random random = new Random();
        int[] randomArray = new int[size];

        //assign random numbers to the array
        for (int i = 0; i < randomArray.length; i++)
        {
            randomArray[i] = random.nextInt(size);
        }
        return randomArray;
    }
}
