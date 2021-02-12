package notebooks;

public class Diary extends Notebook
{
    private String secrets;

    public Diary(String title, String content, String author, String secrets)
    {
        super(title, content, author);
        this.secrets = secrets;
    }

    public String getSecrets()
    {
        return secrets;
    }

    @Override
    public String toString()
    {
        return "Diary{" +
                "secrets='" + secrets + '\'' +
                '}';
    }
}
