package interfaces;

public class Person implements Nameable
{
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName()
    {
        return firstName;
    }

    @Override
    public String getLastName()
    {
        return lastName;
    }

    public void printName()
    {
        System.out.println(firstName + " " + lastName);
    }
}
