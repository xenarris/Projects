package sweets;

public class Sweet
{
    private boolean homemade;
    private int calories;

//    public Sweet()
//    {
//        homemade = true;
//        calories = 300;
//    }

    public Sweet(boolean homemade, int calories)
    {
        this.homemade = homemade;
        this.calories = calories;
    }

    public boolean isHomemade()
    {
        return homemade;
    }

    public int getCalories()
    {
        return calories;
    }

    public void setHomemade(boolean homemade)
    {
        this.homemade = homemade;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
    }

    @Override
    public String toString()
    {
        return "Sweet{" +
                "homemade=" + homemade +
                ", calories=" + calories +
                '}';
    }
}
