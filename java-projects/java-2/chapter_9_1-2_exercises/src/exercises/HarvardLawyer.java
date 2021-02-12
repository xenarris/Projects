package exercises;

public class HarvardLawyer extends Lawyer
{
    @Override
    public double getSalary()
    {
        return super.getSalary() * 1.2;
    }

    @Override
    public int getVacationDays()
    {
        return super.getVacationDays() + 3;
    }

    @Override
    public String getVacationForm()
    {
        return super.getVacationForm() + super.getVacationForm()
                + super.getVacationForm() + super.getVacationForm();
    }
}
