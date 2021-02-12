package datastructures;

/**
 * The bag is a fixed size group of elements
 * which cannot be accessed by index
 */
public class Bag<T>
{
    //store bag in an array
    private T[] bagElements;
    private  int nextAvailableIndex;

    public Bag(int sizeOfTheBag)
    {
        bagElements =(T[])new Object[sizeOfTheBag];
    }

    public boolean add(T newElement)
    {
        //is the bag full?
        if (isFull())
        {
            return false;
        }
        bagElements[nextAvailableIndex++] = newElement;
        return true;
    }

    public boolean contains(T elementToSearchFor)
    {
        for (int i = 0; i < bagElements.length; i++)
        {
            T currentElement = bagElements[i];

            if (currentElement == elementToSearchFor)
            {
                return true;
            }
        }
        return false;
    }

    public boolean isFull()
    {
        if (nextAvailableIndex > bagElements.length - 1)
        {
            return true;
        }
        return false;
    }
}
