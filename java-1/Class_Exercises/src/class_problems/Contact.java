/*
    this file contains a Contact class.
    This is problem 7 of the class exercises.
    File: Contact.java
    Date: Nov 30, 2019
    Author: Jean-Kenneth Antonio
 */

package class_problems;

public class Contact
{
    //fields
    private String fullName;
    private int addrNumber;
    private String addrStreet;
    private String addrCity;
    private String addrState;
    private int addrZip;

    //parameterized constructor
    public Contact(String fullName, int addrNumber, String addrStreet,
                   String addrCity, String addrState, int addrZip)
    {
        this.fullName = fullName;
        this.addrNumber = addrNumber;
        this.addrStreet = addrStreet;
        this.addrCity = addrCity;
        this.addrState = addrState;
        this.addrZip = addrZip;
    }

    //update address
    public void updateAddress(int number, String street, String city, String state, int zip)
    {
        this.addrNumber = number;
        this.addrStreet = street;
        this.addrCity = city;
        this.addrState = state;
        this.addrZip = zip;
    }

    //getters
    public String getFullName()
    {
        return fullName;
    }

    public int getAddrNumber()
    {
        return addrNumber;
    }

    public String getAddrStreet()
    {
        return addrStreet;
    }

    public String getAddrCity()
    {
        return addrCity;
    }

    public String getAddrState()
    {
        return addrState;
    }

    public int getAddrZip()
    {
        return addrZip;
    }

    public String toString()
    {
        return "Contact - " + fullName + ", "  + addrNumber +
                " " + addrStreet  +
                " " + addrCity +
                ", " + addrState +
                " " + addrZip;
    }
}
