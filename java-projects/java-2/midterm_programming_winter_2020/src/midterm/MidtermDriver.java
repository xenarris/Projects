package midterm;

import esports.AmateurPlayer;
import esports.ProfessionalPlayer;
import sports.FootballAthlete;

/**
 *  This is the driver class of the midterm
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class MidtermDriver
{
    /**
     * Starts the program
     *
     * @param args command-line arguments
     */
    public static void main(String[] args)
    {
        AnyPlayer[] players =
                {
                        new FootballAthlete("Russel Wilson", "Seahawks", "Quarterback"),
                        new FootballAthlete("Tom Brady", "Patriots", "Quarterback"),
                        new ProfessionalPlayer("Johan Sundstein", "Mountain Dew"),
                        new AmateurPlayer("Anne Mills","Top Mad Lad")
                };

        printNames(players);
    }

    /**
     * Prints the names of the players in an AnyPlayer[] array
     *
     * @param players the AnyPlayer[] objects array
     */
    public static void printNames(AnyPlayer[] players)
    {
        System.out.println("Names of " + players.length + " players");
        for (int i = 0; i < players.length; i++)
        {
            System.out.println(players[i].getName());
        }
    }
}
