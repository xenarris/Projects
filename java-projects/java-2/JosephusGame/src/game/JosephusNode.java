package game;

//A doubly-linked list node. This node class is not an inner class, 
//so you will need to use getters/setters to access the fields in 
//the class. They should not be public.

/**
 * A doubly-linked list node
 *
 * @author Jean-Kenneth Antonio
 * @version 1.0
 */
public class JosephusNode
{
    private String name;
    private JosephusNode next;
    private JosephusNode prev;

    /**
     * A constructor for a JosephusNode with a name
     *
     * @param name the name of the player
     */
    public JosephusNode(String name)
    {
        this.name = name;
    }

    /**
     * A constructor for a JosephusNode with a name, next, and prev
     *
     * @param name the name of the player
     * @param next reference to the next JosephusNode in the list
     * @param prev reference to the previous JosephusNode in the list
     */
    public JosephusNode(String name, JosephusNode next, JosephusNode prev)
    {
        this.name = name;
        this.next = next;
        this.prev = prev;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public JosephusNode getNext()
    {
        return next;
    }

    public void setNext(JosephusNode next)
    {
        this.next = next;
    }

    public JosephusNode getPrev()
    {
        return prev;
    }

    public void setPrev(JosephusNode prev)
    {
        this.prev = prev;
    }
}
