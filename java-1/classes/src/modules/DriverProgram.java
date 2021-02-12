package modules;

public class DriverProgram
{
    public static void main(String[] args)
    {
        DiceModule module = new DiceModule();
        Dice die = new Dice(6, "red");
        Dice die2 = new Dice(4, "blue");

        DiceModule.rollDie(die);
        DiceModule.rollSeveralTimes(die2, 5);

        System.out.println();

        Dice[] dice = {die, die2, die, die2};

        CupOfDice cup = new CupOfDice(dice);

        DiceModule.rollCupOfDice(cup);

    }
}
