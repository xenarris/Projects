package examples;

public class ResizableArray
{
    private static final int DEFAULT_CAPACITY = 10;

    //internal resizable array
    private Object[] data;

    //number of used spots in the internal array
    private int size = 0;

    public ResizableArray()
    {
        data = new Object[DEFAULT_CAPACITY];
    }

    public ResizableArray(int initalCapacity)
    {
        data = new Object[initalCapacity];

    }

    public void add(Object newElement)
    {
        //what happens if size == data.length? (exceed the the capacity of the data array)
        if (size == data.length)
        {
            resize();
        }

        //assign next available index
        data[size] = newElement;
        size++;
    }

    public void remove(Object toBeRemoved)
    {
        //remove the first of the occurrence of toBeRemoved from the internal array
        for (int i = 0; i < size; i++)
        {
            if (data[i].equals(toBeRemoved))
            {
                //shift all elements above the current element down one index
                for (int j = 0; j < size - 1; j++)
                {
                    data[j] = data[j + 1];
                }
                data[size - 1] = null;
                size--;

                break; // stop looking
            }
        }
    }

    public void printList()
    {
        System.out.print("[");
        for (int i = 0; i < data.length; i++)
        {
            if (i != 0)
            {
                System.out.print(", ");
            }
            System.out.print(data[i]);
        }
        System.out.println("]");
    }

    private void resize()
    {
        //create a new array
        Object[] newData = new Object[data.length * 2];

        //copy across all elements from the old to new array
        for (int i = 0; i < data.length; i++)
        {
            newData[i] = data[i];
        }

        // replace our internal array with the new one
        data = newData;
    }
}
