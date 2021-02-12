package writing;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PracticeWritingToFiles
{
    public static void main(String[] args)
    {
        PrintWriter writer = null;
        try
        {
            writer = new PrintWriter(new FileOutputStream("files/output.txt", true));

            writer.println("Hello, file!");

            for (int i = 1; i <= 10 ; i++)
            {
                writer.print(i);
                writer.print(", ");
            }

            writer.println("All done!");


        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error writing to file...");
        }
        finally
        {
            //this will clear the internal buffer and
            //and push all remaining files
            if (writer != null)
            {
                writer.close();
            }
        }
    }
}
