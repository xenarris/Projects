package esports;

/**
 * Class representing a professional player
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class ProfessionalPlayer extends Player
{
    private String sponsor;

    /**
     * Constructor to create a ProfessionalPlayer object
     * @param name The name of the player
     * @param sponsor the sponsor of the player
     */
    public ProfessionalPlayer(String name, String sponsor)
    {
        super(name);
        this.sponsor = sponsor;
    }

    public String getSponsor()
    {
        return sponsor;
    }

    @Override
    public String toString()
    {
        return "Player name: " + getName() +
                "\nPlayer sponsor: " + sponsor;
    }
}
