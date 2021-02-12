package stacks;

public class BoundedStack
{
    private int maxSize;
    private Object[] theStack;
    private int topOfStack = 0;
    private int size = 0;

    public BoundedStack(int maxSize)
    {
        this.maxSize = maxSize;
        theStack = new Object[maxSize];
    }


    //These are my ADT methods
    // method stubs are empty methods that still compiles
    public boolean push(Object element)
    {
        //out of room..
        if (topOfStack >= theStack.length)
        {
            return false;
        }

        theStack[topOfStack] = element;
        topOfStack++;
        size++;
        return true;
    }

    //remove and returns the top element of the stack
    public Object pop()
    {
        //return null if the stack is empty
        if (topOfStack == 0)
        {
            return null;
        }

        //save the top element of the stack
        Object top = theStack[topOfStack - 1];

        //remove the top element of the array
        theStack[topOfStack - 1] = null;
        topOfStack--;
        size--;

        return top;
    }

    //returns the top element of the stack
    public Object peek()
    {
        if (topOfStack == 0)
        {
            return null;
        }

        return theStack[topOfStack - 1];
    }

    //returns the number of elements in the stack
    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {

        return size == 0;
    }

    public boolean isFull()
    {
        return size == maxSize;
    }

}
