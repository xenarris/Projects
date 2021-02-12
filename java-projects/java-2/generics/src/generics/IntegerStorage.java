package generics;

public class IntegerStorage
{
    private int data;

    public IntegerStorage(int data)
    {
        this.data = data;
    }

    public int getData()
    {
        return data;
    }

    public void setData(int data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "IntegerStorage{" +
                "data=" + data +
                '}';
    }
}
