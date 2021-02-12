package hashing;

import java.sql.SQLOutput;
import java.util.Arrays;

public class HashTable
{
    private static final int DEFAULT_TABLE_SIZE = 10;
    private static final double LOAD_FACTOR = 0.6;
    private static final int RESIZE_FACTOR = 2;

    // we need the table of elements
    private Object[] table;
    private int size;

    public HashTable()
    {
        table = new Object[DEFAULT_TABLE_SIZE];
    }

    public boolean add(Object element)
    {
        //check if the table is too full
        if ((double)size / table.length >= LOAD_FACTOR)
        {
            resize();
        }

        int code = Math.abs(element.hashCode());
        int index = code % table.length;

        //check for duplicate or collision
        while (table[index] != null)
        {
            //check for duplicate
            if (table[index].equals(element))
            {
                return false;
            }
            index = (index + 1) % table.length;
        }

        table[index] = element;
        size++;

        return true;
    }

    private void resize()
    {
        //create a new table wit ha new length
        Object[] oldTable = table;
        table = new Object[oldTable.length * RESIZE_FACTOR];
        size = 0;

        //copy each of the elements from the old table to the new
        for (int i = 0; i < oldTable.length; i++)
        {
            if (oldTable[i] != null)
            {
                add(oldTable[i]);
            }
        }
    }

    public boolean contains(Object element)
    {
        int code = Math.abs(element.hashCode());
        int index = code % table.length;

        while (table[index] != null)
        {
            //check for element
            if (table[index].equals(element))
            {
                return true;
            }
            index = (index + 1) % table.length;
        }

        return false;
    }

    public int size()
    {
        return size;
    }

    @Override
    public String toString()
    {
        return Arrays.toString(table);
    }
}
