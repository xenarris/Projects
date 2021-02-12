package project;

public class book extends LibraryItem
{
    private int pages;
    private int publishYear;

    public book(int uniqueID, String title, int pages, int publishYear)
    {
        super(uniqueID, title);
        this.pages = pages;
        this.publishYear = publishYear;
    }

    public int getPages()
    {
        return pages;
    }

    public void setPages(int pages)
    {
        this.pages = pages;
    }

    public int getPublishYear()
    {
        return publishYear;
    }

    public void setPublishYear(int publishYear)
    {
        this.publishYear = publishYear;
    }

    @Override
    public String toString()
    {
        return "book{" +
                "pages=" + pages +
                ", publishYear=" + publishYear +
                '}';
    }
}
