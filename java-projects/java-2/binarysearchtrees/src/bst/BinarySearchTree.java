package bst;

public class BinarySearchTree
{
    //fields
    private Node root;
    private int size = 0;


    //constructors
    public BinarySearchTree()
    {
        //do nothing
    }

    //binary search tree ADT methods
    public void add(Comparable<Integer> element)
    {
        //check if the tree is empty
        if (root == null)
        {
            root = new Node(element);
            size++;
        }
        else
        {
            add(element,root);
        }
    }

    //private recursive method that helps us move down the tree
    //to insert a new element
    private void add(Comparable<Integer> elementToInsert, Node currentNode)
    {
        if (currentNode.data.compareTo(elementToInsert) == 0)
        {
            //the element is already in the tree, stop
            return;
        }
        else if (currentNode.data.compareTo(elementToInsert) > 0) // look to the left
        {
         //no left child
            if (currentNode.left == null)
            {
                currentNode.left = new Node(elementToInsert);
                size++;
            }
            else
            {
                //there is left child, go search there
                add(elementToInsert, currentNode.left);
            }
        }
        else if (currentNode.data.compareTo(elementToInsert) < 0) // look to the right
        {
            //no right child
            if (currentNode.right == null)
            {
                currentNode.right = new Node(elementToInsert);
                size++;
            }
            else
            {
                //there is right child, go search there
                add(elementToInsert, currentNode.right);
            }
        }
    }


    public boolean contains(Comparable search)
    {
        //recursively
        if (root == null)
        {
            return false;
        }
        else
        {
            //return containsRecursive(search, root);
            return containsIterative(search,root);
        }
    }

    private boolean containsRecursive(Comparable search, Node currentNode)
    {
        if (currentNode.data.compareTo(search) == 0)
        {
            return true;
        }
        else if (currentNode.data.compareTo(search) > 0)
        {
            return containsRecursive(search, currentNode.left);
        }
        else if (currentNode.data.compareTo(search) < 0)
        {
            return containsRecursive(search, currentNode.right);
        }
        return false;
    }

    private boolean containsIterative(Comparable search, Node currentNode)
    {
        Node current = root;
        while (current != null)
        {
            if (current.data.compareTo(search) == 0)
            {
                return true;
            }
            else if (current.data.compareTo(search) > 0)
            {
                current = current.left;
            }
            else if (current.data.compareTo(search) < 0)
            {
                current = current.right;
            }
        }
        return false;
    }


    public void remove()
    {

    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void printPreOrder()
    {
        printPreOrder(root);
    }

    //recursive travel
    private void printPreOrder(Node current)
    {
        if (current != null)
        {
            //NLR
            System.out.println(current.data);
            printPreOrder(current.left);
            printPreOrder(current.right);
        }
    }

    public void printInOrder()
    {
        printInOrder(root);
    }

    //recursive travel
    private void printInOrder(Node current)
    {
        if (current != null)
        {
            //LNR
            printInOrder(current.left);
            System.out.println(current.data);
            printInOrder(current.right);
        }

    }

    public void printPostOrder()
    {
        printPostOrder(root);
    }

    //recursive travel
    private void printPostOrder(Node current)
    {
        if (current != null)
        {
            //LRN
            printPostOrder(current.left);
            printPostOrder(current.right);
            System.out.println(current.data);

        }

    }

    private class Node
    {
        //use the comparable interface for elements
        private Comparable data;
        private Node left;
        private Node right;

        public Node(Comparable<Integer> data)
        {
            this.data = data;
        }

        public Node(Comparable data, Node left,Node right)
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        @Override
        public String toString()
        {
            return data.toString();
        }
    }
}
