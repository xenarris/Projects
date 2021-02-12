package adventure_game;

import java.io.*;
import java.util.Scanner;

/**
 * This class is a
 * Create You Own Adventure game
 * that the user can play from a
 * text file then write the completed
 * story to a text file;
 *
 * @author Jean-Kenneth Antonio
 * @version 1.1
 */

public class ChooseAdventureGame
{
    private static String storyName = "";
    private static String[] linesInStory;
    private static String[] descChoices;
    private static String[] choices;
    private static boolean finish = false;
    private static int lineChoice = 1;
    private static int storyLineCount = 0;
    private static int[] lineChoices;

    /**
     * Starts and introduces the Create Your Own Adventure game
     *
     * @param args command-line arguments
     */

    public static void main(String[] args)
    {
        try
        {
            System.out.println("Welcome to my Choose your own Adventure program!");
            chooseStory();
            wipeComplete();
            lineCount();
            storyIntoArray();
            readStory();
            System.out.println("\nThanks for helping tell my story!");
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("\nSorry, story file does not exist!");
        }
    }

    //method asks user for a story
    private static void chooseStory() throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please choose a story:");

        // looks for stories
        findStories();

        // prompts user to enter a story name
        System.out.print("Name: ");
        storyName = input.nextLine();

        // checks to see if user input name exists
        storyExists();
    }

    //wipes previous play through file, or creates one if
    //the story doesn't exist in the complete folder
    private static void wipeComplete() throws FileNotFoundException
    {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(concatPathComplete(storyName))))
        {
            // replaces the text file with basically nothing
            writer.print("");
        }
    }

    // plays the story in a loop until finish = true
    private static void readStory() throws FileNotFoundException
    {
        while (!finish)
        {
            try
            {
                // updates current story line when looped over
                String currentLine = linesInStory[lineChoice - 1];

                // splits the line into arrays in story
                split(currentLine);

                // asks for user input with exception checking
                chooseOption();
            }
            // catch should trigger if the story cannot write story into array.
            // e.g. a blank txt file, improperly formatted story, a rogue trailing white space, etc.
            catch (ArrayIndexOutOfBoundsException ex)
            {
                System.out.println("Sorry, story is invalid! ");
                break;
            }
        }
    }

    //checks if chosen story exists and throws a FileNotFoundException if non-existent
    private static void storyExists() throws FileNotFoundException
    {
        try (Scanner reader = new Scanner(new FileInputStream(concatPathIncomplete(storyName))))
        {
        }
    }

    // Method prints story names in stories/incomplete
    private static void findStories()
    {
        File dir = new File("stories/incomplete");
        File[] contents = dir.listFiles();

        // loop that removes path and extension from each found file
        // and prints only the file name
        for (int i = 0; i < contents.length; i++)
        {
            File current = contents[i];
            String storyName = current.getPath();
            storyName = storyName.replaceFirst("stories\\\\incomplete\\\\","");
            storyName = storyName.replaceFirst(".txt","");
            System.out.println(storyName);
        }
    }

    // counts the number of lines in the story file
    private static void lineCount() throws FileNotFoundException
    {
        //counts the lines in the story
        int count = 0;
        try (Scanner reader = new Scanner(new FileInputStream(concatPathIncomplete(storyName))))
        {
            while(reader.hasNextLine())
            {
                reader.nextLine(); // read the line but not store the line
                count++;
            }
            storyLineCount = count; // stores total line count of the story file
        }
    }

    // put the story into an array for easier access
    private static void storyIntoArray() throws FileNotFoundException
    {
        try (Scanner reader = new Scanner(new FileInputStream(concatPathIncomplete(storyName))))
        {
            //creates array with length of the story to store file in
            linesInStory = new String[storyLineCount];

            //read an entire file into an array
            for (int i = 0; i < linesInStory.length; i++)
            {
                // places each line into the array
                String line = reader.nextLine();
                linesInStory[i] = line;
            }
        }
    }

    // asks for user input with validation
    private static void chooseOption() throws FileNotFoundException
    {
        Scanner input = new Scanner(System.in);
        boolean validChoice = false;
        PrintWriter writer = null;

        // will ask for user input and loop until valid choice is entered
        while (!validChoice)
        {
            try
            {
                writer = new PrintWriter(new FileOutputStream(concatPathComplete(storyName), true));
                int choice;
                String choiceString;

                // prints user input to both console and file
                writer.println(choiceString = input.nextLine());
                choice = Integer.parseInt(choiceString); // converts string to integer

                // compares user choice to current line's choices
                for (int i = 0; i < lineChoices.length; i++)
                {
                    if (choice == lineChoices[i])
                    {
                        validChoice = true;
                        lineChoice = choice;
                        if (lineChoice < 0)
                        {
                            finish = true;
                        }
                    }
                }

                // enters if user inputs a bad number
                if (!validChoice)
                {
                    System.out.println("Invalid choice");
                    writer.println("Invalid choice\n");
                    writer.close();
                    readLine();
                }
                else
                {
                    writer.println();
                }
            }
            // enters catch if parseInt cannot grab int from user input
            catch (NumberFormatException ex)
            {
                System.out.println("Invalid choice");
                writer.println("Invalid choice\n");
                writer.close();
                readLine();
            }
            finally
            {
                // closes PrintWriter object if exceptions happen and not null
                if (writer != null)
                {
                    writer.close();
                }
            }
        }
    }

    // splits the current line into different arrays to print
    private static void split(String input)
    {
        //split on description / choices
        descChoices = input.split(" : ");

        // split on choices
        choices = descChoices[1].split(" \\| ");
        lineChoices = new int[choices.length];

        // grabs the numbered options from each choice into an array
        for (int i = 0; i < choices.length; i++)
        {
            String[] choiceOptions = choices[i].split(" = ");
            for (int j = 0; j < choiceOptions.length; j++)
            {
                lineChoices[i] = Integer.parseInt(choiceOptions[1]);
            }
        }
        // prints the current line
        readLine();
    }

    // prints the current line of the story to console and file
    private static void readLine()
    {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(concatPathComplete(storyName), true)))
        {
            System.out.println();

            // prints current story description to file and console
            System.out.println(descChoices[0]);
            writer.println(descChoices[0]);

            // prints formatted choices of the current line to file and console
            for (int i = 0; i < lineChoices.length; i++)
            {
                System.out.print(lineChoices[i] + ": ");
                System.out.println(choices[i].substring(0, choices[i].length() - 4));
                writer.print(lineChoices[i] + ": ");
                writer.println(choices[i].substring(0, choices[i].length() - 4));
            }
        }
        catch (FileNotFoundException ex)
        {
            System.out.println("Error writing to file: " + ex.getMessage());
        }
    }

    //returns the relative path of the story in the incomplete folder
    private static String concatPathIncomplete(String name)
    {
        return "stories/incomplete/" + name + ".txt";
    }

    //returns the relative path of the story in the incomplete folder
    private static String concatPathComplete(String name)
    {
        return "stories/complete/" + name + ".txt";
    }
}
