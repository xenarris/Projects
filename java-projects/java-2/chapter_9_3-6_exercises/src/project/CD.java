package project;

public class CD extends LibraryItem
{
    private double length;
    private String genre;

    public CD(int uniqueID, String title, double length, String genre)
    {
        super(uniqueID, title);
        this.length = length;
        this.genre = genre;
    }

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
    }

    @Override
    public String toString()
    {
        return "CD{" +
                "runtimeInMin=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
