/*
    this file contains an IPAddressV4 class.
    This is problem 3 of the class exercises.
    File: IPAddressV4.java
    Date: Nov 30, 2019
    Author: Jean-Kenneth Antonio
 */

package class_problems;

public class IPAddressV4
{
    //fields
    private int firstOctet;
    private int secondOctet;
    private int thirdOctet;
    private int fourthOctet;

    //default constructor
    public IPAddressV4()
    {
        firstOctet = 127;
        secondOctet = 0;
        thirdOctet = 0;
        fourthOctet = 1;
    }

    public IPAddressV4(int firstOctet, int secondOctet, int thirdOctet, int fourthOctet)
    {
        //place ip addresses in array to prepare for check
        int[] iPAddresses = {firstOctet,secondOctet,thirdOctet,fourthOctet};
        //check for out of bounds (0,255)
        for (int i = 0; i < iPAddresses.length; i++)
        {
            if (iPAddresses[i] < 0 || iPAddresses[i] > 255)
            {
                firstOctet = 127;
                secondOctet = 0;
                thirdOctet = 0;
                fourthOctet = 1;
            }
        }

        this.firstOctet = firstOctet;
        this.secondOctet = secondOctet;
        this.thirdOctet = thirdOctet;
        this.fourthOctet = fourthOctet;
    }

    public boolean isLocalHost()
    {
        if (firstOctet == 127 && secondOctet == 0 &&  thirdOctet == 0 && fourthOctet == 1)
        {
            return true;
        }
        return false;
    }

    public int getFirstOctet()
    {
        return firstOctet;
    }

    public int getSecondOctet()
    {
        return secondOctet;
    }

    public int getThirdOctet()
    {
        return thirdOctet;
    }

    public int getFourthOctet()
    {
        return fourthOctet;
    }

    public void setFirstOctet(int firstOctet)
    {
        this.firstOctet = firstOctet;
    }

    public void setSecondOctet(int secondOctet)
    {
        this.secondOctet = secondOctet;
    }

    public void setThirdOctet(int thirdOctet)
    {
        this.thirdOctet = thirdOctet;
    }

    public void setFourthOctet(int fourthOctet)
    {
        this.fourthOctet = fourthOctet;
    }

    public String toString()
    {
        return "IPAddressV4: " + firstOctet +
                "." + secondOctet +
                "." + thirdOctet +
                "." + fourthOctet;
    }
}
