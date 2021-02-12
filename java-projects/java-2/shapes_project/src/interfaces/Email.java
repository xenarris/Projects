package interfaces;

public class Email implements Printable
{
    private String subject;
    private String body;
    private String senderAddress;
    private String recieverAddress;

    public Email(String subject, String body, String senderAddress, String recieverAddress)
    {
        this.subject = subject;
        this.body = body;
        this.senderAddress = senderAddress;
        this.recieverAddress = recieverAddress;
    }

    public void printme()
    {
        //do something
    }

    public void printMessage(String message)
    {
        //do something
    }

    public void  printRepeatedMessage(String message, int repetition)
    {
        //do something
    }
}
