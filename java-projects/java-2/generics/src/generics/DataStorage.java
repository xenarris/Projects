package generics;

//this is a generic class
//the class that uses a generic type
public class DataStorage<T>
{
    private T data;

    public DataStorage(T data)
    {
        this.data = data;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
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
