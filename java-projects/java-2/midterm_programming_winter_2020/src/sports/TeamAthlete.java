package sports;

/**
 * Class representing an Athlete team
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class TeamAthlete extends Athlete
{
    private String teamName;

    /**
     * Constructor for creating a TeamAthlete object
     *
     * @param name the name of the athlete
     * @param teamName the team name of the athlete
     */
    public TeamAthlete(String name, String teamName)
    {
        super(name);
        this.teamName = teamName;
    }

    public String getTeamName()
    {
        return teamName;
    }

    @Override
    public String toString()
    {
        return "Athlete Name: " + getName() +
                "\nTeam Name: " + teamName;
    }
}
