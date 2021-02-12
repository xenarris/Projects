package modules;

public class CupOfDice
{
    private Dice[] dice;

    public CupOfDice(Dice[] dice)
    {
        this.dice = dice;
    }

    public Dice[] getDice()
    {
        return dice;
    }
}
