package project;

public abstract class LibraryItem
{
    private int uniqueID;
    private String title;

    public LibraryItem(int uniqueID, String title)
    {
        this.uniqueID = uniqueID;
        this.title = title;
    }

    public int getUniqueID()
    {
        return uniqueID;
    }

    public String getTitle()
    {
    return title;
    }

    @Override
    public String toString()
    {
        return "LibraryItem{" +
                "uniqueID=" + uniqueID +
                ", title='" + title + '\'' +
                '}';
    }
}
