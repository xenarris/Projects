package sports;

/**
 * Class representing a Football Athlete
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class FootballAthlete extends TeamAthlete
{
    private String position;

    /**
     * Constructor for creating a football athlete
     *
     * @param name the name of the athlete
     * @param teamName the team name of the athlete
     * @param position the position of the athlete within the team
     */
    public FootballAthlete(String name, String teamName, String position)
    {
        super(name, teamName);
        this.position = position;
    }

    public String getPosition()
    {
        return position;
    }

    @Override
    public String toString()
    {
        return "Athlete Name: " + getName() +
                "\nTeam Name: " + getTeamName() +
                "\nPosition: " + position;
    }
}
