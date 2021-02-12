package generics;

public class DoubleStorage
{
    private double data;

    public DoubleStorage(double data)
    {
        this.data = data;
    }

    public double getData()
    {
        return data;
    }

    public void setData(double data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "DoubleStorage{" +
                "data=" + data +
                '}';
    }
}
