/*
    this file contains an CheckoutLine class.
    This is problem 6 of the class exercises.
    File: CheckoutLine.java
    Date: Nov 30, 2019
    Author: Jean-Kenneth Antonio
 */

package class_problems;

import java.util.Arrays;

public class CheckoutLine
{
    //fields
    private String[] peopleInLine;

    //parameterized constructor
    public CheckoutLine(String[] peopleInLine)
    {
        this.peopleInLine = peopleInLine;
    }

    //getters
    public String[] getPeopleInLine()
    {
        return peopleInLine;
    }

    public String isFirst()
    {
        return peopleInLine[peopleInLine.length - 1];
    }

    public String isLast()
    {
        return peopleInLine[0];
    }

    //remove first in line, move everyone one spot toward the front, and add name to last in line
    public void enterLine(String name)
    {
        String[] tempArray = peopleInLine;
        for (int i = peopleInLine.length - 1; i > 0; i--)
        {
            tempArray[i] = peopleInLine[i - 1];
        }
        tempArray[0] = name;
        peopleInLine = tempArray;
    }

    //toString()
    public String toString()
    {
        return "end --> " + Arrays.toString(peopleInLine) + " --> front";
    }
}
