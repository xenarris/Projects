package exercises;

public class Janitor extends Employee
{
    @Override
    public int getHours()
    {
        return super.getHours() + 40;
    }

    @Override
    public double getSalary()
    {
        return super.getSalary() - 10000.0;
    }

    public void clean()
    {
        System.out.println("Workin' for the man.");
    }
}
