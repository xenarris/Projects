package project;

public class Video extends LibraryItem
{
    private double runtimeInMin;
    private String genre;
    private int publishYear;

    public Video(int uniqueID, String title, double runtimeInMin, String genre, int publishYear)
    {
        super(uniqueID, title);
        this.runtimeInMin = runtimeInMin;
        this.genre = genre;
        this.publishYear = publishYear;
    }

    public double getRuntimeInMin()
    {
        return runtimeInMin;
    }

    public void setRuntimeInMin(double runtimeInMin)
    {
        this.runtimeInMin = runtimeInMin;
    }

    public String getGenre()
    {
        return genre;
    }

    public void setGenre(String genre)
    {
        this.genre = genre;
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
        return "Video{" +
                "runtimeInMin=" + runtimeInMin +
                ", genre='" + genre + '\'' +
                ", publishYear=" + publishYear +
                '}';
    }
}
