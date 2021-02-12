package maps;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WorkingWithMaps
{
    public static void main(String[] args)
    {
        //create a map from names to heights (in inches)
        HashMap<String, Double> heightMap = new HashMap<>();

        heightMap.put("Aaron", 59.2);
        heightMap.put("Sylvia", 61.1);
        heightMap.put("Henry", 70.1);
        heightMap.put("Josh", 58.8);

        //lookup values using my keys
//        double height = heightMap.get("Aaron");
        System.out.println(heightMap.get("Aaron"));

        //search for a missing key
        System.out.println(heightMap.get("Sylvia"));
        if (heightMap.get("Tyler") == null)
        {
            System.out.println("Tyler is not in the map");
        }

        if (heightMap.containsKey("Sylvia"))
        {
            System.out.println("Sylvia is in the map");
        }

        if (heightMap.containsValue(61.1))
        {
            System.out.println("Someone is 61.1 inches tall");
        }
        System.out.println();

        //we need to use a for each loop to iterate over our pairs
        for (Map.Entry<String,Double> pair: heightMap.entrySet())
        {
            //print just "tall" people
            if (pair.getValue() > 60)
            {
                System.out.println("Key: " + pair.getKey());
                System.out.println("Value: " + pair.getValue());
                System.out.println();
            }
        }

        //loop over our keys
        for (String key : heightMap.keySet())
        {
            System.out.println(key);
        }

        System.out.println();

        //loop over our values
        for (double value : heightMap.values())
        {
            System.out.println(value);
        }




        try(Scanner reader = new Scanner(new FileInputStream("files/dictionary.txt")))
        {
            while (reader.hasNextLine())
            {

            }
        }
        catch (FileNotFoundException ex)
        {

        }
    }
}
