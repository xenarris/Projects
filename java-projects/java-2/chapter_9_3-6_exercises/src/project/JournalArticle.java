package project;

public class JournalArticle extends LibraryItem
{
    private int publishYear;
    private String authorName;
    private int publishMonth;

    public JournalArticle(int uniqueID, String title, int publishYear, String authorName, int publishMonth)
    {
        super(uniqueID, title);
        this.publishYear = publishYear;
        this.authorName = authorName;
        this.publishMonth = publishMonth;
    }

    public int getPublishYear()
    {
        return publishYear;
    }

    public void setPublishYear(int publishYear)
    {
        this.publishYear = publishYear;
    }

    public String getAuthorName()
    {
        return authorName;
    }

    public void setAuthorName(String authorName)
    {
        this.authorName = authorName;
    }

    public int getPublishMonth()
    {
        return publishMonth;
    }

    public void setPublishMonth(int publishMonth)
    {
        this.publishMonth = publishMonth;
    }

    @Override
    public String toString()
    {
        return "JournalArticle{" +
                "publishYear=" + publishYear +
                ", authorName='" + authorName + '\'' +
                ", publishMonth=" + publishMonth +
                '}';
    }
}
