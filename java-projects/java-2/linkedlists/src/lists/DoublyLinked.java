package lists;

public class DoublyLinked
{
    //fields
    private Node head; //reference to the first node in the list
    private Node tail; //reference to the last node in the list
    private int size;

    public void add(Object element)
    {
        if(head==null)
        {
            head = tail = new Node(element);
        }
        else
        {
            tail.next = new Node(element);
            tail.next.previous = tail;
            tail = tail.next;
        }
        size++;
    }
    public boolean remove(Object element)
    {
        if(head == null)
        {
            return false;
        }
        else if(head.data.equals(element))
        {
            head = head.next;
            head.previous = null;
            size--;
            return true;
        }
        else if(tail.data.equals(element))
        {
            tail = tail.previous; //changed by flipping over = from pair program
            tail.next = null;
            size--;
            return true;
        }
        else
        {
            Node current = head;
            while(current.next != null && !current.data.equals(element)) //changed from pair program removed .data from current.next
            {
                current = current.next;
            }
            if(current.next == null)
            {
                return false;
            }
            else
            {
                current.previous.next = current.next;
                current.next.previous = current.previous;
                size--;
                return true;
            }
        }
    }
    public String toString()
    {
        if(head == null)
        {
            return "H -> null";
        }
        else
        {
            String result = "H";
            Node current = head;
            while (current !=null)
            {
                result+=" -> "+current.data;
                current = current.next;
            }
            return result+" -> null";
        }
    }
    private class Node
    {
        private Object data;
        private Node next;
        private Node previous;


        public Node(Object data)
        {
            this.data=data;
        }
        public Node(Object data, Node next, Node previous)
        {
            this.data=data;
            this.next=next;
            this.previous=previous;
        }
        public String toString()
        {
            return data.toString();
        }
    }

}
