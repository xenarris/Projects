package notebooks;

public class Notebook
{
    private String title;
    private String content;
    private String author;

    public Notebook(String title, String content, String author)
    {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    @Override
    public boolean equals(Object other)
    {
        //initial checks
        if (other == null)
        {
            return false;
        }
        else if (this == other)
        {
            return true;
        }
        else if (!(this.getClass().equals(other.getClass())))
        {
            return false;
        }
        else
        {
            //convert other to a Notebook variable and compare
            //objects by their fields
            Notebook otherNotebook = (Notebook)other;

            //determine what it means for notebook objects to be equal
            return this.title == otherNotebook.title;
        }
    }


    public String getTitle()
    {
        return title;
    }

    public String getContent()
    {
        return content;
    }

    public String getAuthor()
    {
        return author;
    }

    @Override
    public String toString()
    {
        return "Notebook{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
