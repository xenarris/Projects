package exercises;

/*
    Exercises: 1, 2, 3, 4, 5
    Jean-Kenneth Antonio
    IT 220
    February 26, 2020
 */


public class LinkedIntList
{
    private ListNode front;

    public LinkedIntList()
    {
        front = null;
    }

    public int size()
    {
        int count = 0;
        ListNode current = front;
        while (current != null)
        {
            current = current.next;
            count++;
        }
        return count;
    }

    //Problem 1
    public void set(int index, int value)
    {
        ListNode current;
//        int count = 0;
//        for (int i = 0; i < size(); i++)
//        {
//            if (count == index)
//            {
//                current.data = value;
//                break;
//            }
//            current = current.next;
//            count++;
//        }

        current = nodeAt(index);
        current.data = value;
    }

    //problem 2
    public int min()
    {
        ListNode current = front;
        int min = front.data;
        for (int i = 0; i < size(); i++)
        {
            if (min > current.data)
            {
                min = current.data;
            }
            current = current.next;
        }
        return min;
    }

    //problem 3
    public boolean isSorted()
    {
        ListNode current = front;
        int previousInt = front.data;
        for (int i = 0; i < size(); i++)
        {
            if (previousInt <= current.data)
            {
                return false;
            }
            previousInt = current.data;
            current = current.next;
        }
        return true;
    }

    //problem 4
    public int lastIndexOf(int value)
    {
        ListNode current = front;
        int  index = 0;
        int lastIndex = -1;
        for (int i = 0; i < size(); i++)
        {
            if (value == current.data)
            {
                lastIndex = index;
            }
            current = current.next;
            index++;
        }

        return lastIndex;
    }

    //problem 5
    public int countDuplicates()
    {
        ListNode current = front;
        int previousNum = 0;
        int numDupes = 0;
        for (int i = 0; i < size(); i++)
        {
            if (previousNum == current.data)
            {
                numDupes++;
            }
            current = current.next;
        }

        return numDupes;
    }

    private ListNode nodeAt(int index)
    {
        ListNode current = front;
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }
        return current;
    }

    private class ListNode
    {
        public int data;
        public ListNode next;

        public ListNode(int data, ListNode next)
        {
            this.data = data;
            this.next = next;
        }

        public ListNode()
        {
            this(0, null);
        }

        public ListNode(int data)
        {
            this(data, null);
        }
    }
}
