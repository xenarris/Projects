package reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PracticeReadingFromFiles
{
    public static void main(String[] args)
    {
        Scanner reader = null;

        try
        {
            //create a scanner
            reader = new Scanner(new FileInputStream("files/war_and_peace.txt"));

            //read an entire file into a program
            while (reader.hasNextLine())
            {
                //read a line
                String line = reader.nextLine();
                System.out.println(line);
            }


//            //read a line from the file
//            String line = reader.nextLine();
//            System.out.println(line);
//
//            int number = reader.nextInt();
//            System.out.println("Number: " + number);
//
//            String word = reader.next();
//            System.out.println("Word: " + word);
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error reading from file!");
        }
        finally
        {
            if (reader != null)
            {
                reader.close();
            }
        }
    }
}
