package esports;

/**
 * Class representing an Amateur player
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class AmateurPlayer extends Player
{
    private String nickname;

    /**
     * Constructor for creating an AmateurPlayer object
     *
     * @param name the name of the player
     * @param nickname the nickname of the player
     */
    public AmateurPlayer(String name, String nickname)
    {
        super(name);
        this.nickname = nickname;
    }

    public String getNickname()
    {
        return nickname;
    }

    @Override
    public String toString()
    {
        return "Player name: " + getName() +
                "\nPlayer nickname: " + nickname;
    }
}
