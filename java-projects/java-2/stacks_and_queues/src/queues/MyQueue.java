package queues;

import java.util.ArrayList;

public class MyQueue
{

    private ArrayList<Object> theQueue = new ArrayList<>();

    public MyQueue()
    {

    }

    //add element to back of array
    public void enqueue(Object element)
    {
        theQueue.add(element);
    }

    //remove and return front of the array
    public Object dequeue()
    {
        if (theQueue.size() == 0)
        {
            return null;
        }

        return theQueue.remove(0);
    }

    public Object peek()
    {
        if (theQueue.size() == 0)
        {
            return null;
        }

        return theQueue.get(0);
    }

    public int size()
    {
        return theQueue.size();
    }

    public boolean isEmpty()
    {
        return theQueue.isEmpty();
    }
}
