package modules;

public class DiceModule
{
    public static void rollDie(Dice die)
    {
        System.out.println("You rolled a " + die.getSides() + " sided " +
                die.getColor() + " die and got a " + die.roll());
    }

    public static void rollSeveralTimes(Dice die, int times)
    {
        for (int i = 0; i < times; i++)
        {
            rollDie(die);
        }
    }

    public static void rollCupOfDice(CupOfDice cup)
    {
        Dice[] dice = cup.getDice();
        for (int i = 0; i < dice.length; i++)
        {
            rollDie(dice[i]);
        }
    }

    public static Dice[] getCommonDice(String color)
    {
     Dice[] dice = {
             new Dice (4, color),
             new Dice(6, color),
             new Dice( 8, color),
             new Dice( 12 ,color)
     };
     return dice;
    }
}
