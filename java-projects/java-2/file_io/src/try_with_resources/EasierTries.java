package try_with_resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EasierTries
{
    public static void main(String[] args)
    {
        try (Scanner reader = new Scanner(new FileInputStream("files/baby_names.txt")))
        {
            int count = 0;
            while(reader.hasNextLine())
            {
                reader.nextLine(); // read the line but not store the line
                count++;
            }
            System.out.println("Lines in file: " + count);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error reading from file " + ex.getMessage());
        }
    }
}
