package lists;

public class LinkedList
{
    //fields
    private Node head; //reference to the first node in the list
    private Node tail; //reference ti the last node in the list
    private int size; //the size of the linked list

    //constructor

    public LinkedList()
    {
        //do nothing...
    }

    //methods
    public void add(Object element)
    {
        //is the linked list empty
        if (head == null)
        {
            head = tail = new Node(element);
        }
        else
        {
            //search to the end of the linked list and insert the new node
//            Node current = head;
//
//            while ((current.next != null))
//            {
//                current = current.next;
//            }
//
//            current.next = new Node(element);

            //speed up our insertions
            tail.next = new Node(element);
            tail = tail.next;
        }
        size++;
    }

    public boolean contains(Object element)
    {
        Node current = head;

        while (current != null)
        {
            if (current.data.equals(element))
            {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean remove(Object element)
    {
        //is the list empty?
        if (head == null)
        {
            return false;
        }
        else if (head.data.equals(element))
        {
            head = head.next;
            size--;
            return true;
        }
        else
        {
            // we will search for the element that may or may not be there
            Node current = head;
            while (current.next != null && current.next.data.equals(element))
            {
                current = current.next;
            }
            //how do i remove the code
            if (current.next == null)
            {
                //not found
                return false;
            }
            //found
            //if the removed element is our tail, then adjust the tail pointer
            if (current.next == tail)
            {
                tail = current;
            }

            current.next = current.next.next;
            size--;
            return true;
        }
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void clear()
    {
        head = null;
        size = 0;
    }

    public Object get(int index)
    {
        Node current = head;
        int count = 0;

        if(index < 0 || index > size)
        {
            throw new IndexOutOfBoundsException("Bad index given to get()");
        }

//        while (count <= index && current != null)
//        {
//            if(index == count)
//            {
//                return current.data;
//            }
//            count++;
//            current = current.next;
//        }
        for (int i = 0; i < index; i++)
        {
            current = current.next;
        }

        return current.data;
    }

    public String toString()
    {
        Node current = head;
        String result = "H -> ";
        while (current != null)
        {
            result = result + current.data + " -> ";
            current = current.next;
        }
        return result + "null";
    }

    private class Node
    {
        private Object data;
        private Node next;



        public Node(Object data)
        {
            this.data = data;
        }

        public Node(Object data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public String toString()
        {
            return "Data: " + data + ", next: " + next;
        }
    }
}
