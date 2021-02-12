package project;

public class Magazine extends LibraryItem
{
    private int publishYear;
    private int publishMonth;
    private int edition;

    public Magazine(int uniqueID, String title, int publishYear, int publishMonth, int edition)
    {
        super(uniqueID, title);
        this.publishYear = publishYear;
        this.publishMonth = publishMonth;
        this.edition = edition;
    }

    public int getPublishYear()
    {
        return publishYear;
    }

    public void setPublishYear(int publishYear)
    {
        this.publishYear = publishYear;
    }

    public int getPublishMonth()
    {
        return publishMonth;
    }

    public void setPublishMonth(int publishMonth)
    {
        this.publishMonth = publishMonth;
    }

    public int getEdition()
    {
        return edition;
    }

    public void setEdition(int edition)
    {
        this.edition = edition;
    }

    @Override
    public String toString()
    {
        return "Magazine{" +
                "publishYear=" + publishYear +
                ", publishMonth=" + publishMonth +
                ", edition=" + edition +
                '}';
    }
}
