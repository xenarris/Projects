package generics;

public class ObjectStorage
{
    private Object data;

    public ObjectStorage(Object data)
    {
        this.data = data;
    }

    public Object getData()
    {
        return data;
    }

    public void setData(Object data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "StringStorage{" +
                "data='" + data + '\'' +
                '}';
    }
}
