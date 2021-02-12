package writing_utensils;

public class Program
{
    public static void main(String[] args)
    {
        //instantiate a new Pencil Object
        Pencil myPencil = new Pencil("mechanical", "gray", true, 0.7);

        //access and change our field values
        System.out.println(myPencil.color);
        myPencil.size = 0.5;
        System.out.println("The size of the pencil is " + myPencil.size);

        //create another pencil
        Pencil pencil = new Pencil();

        System.out.println(pencil.color);
        pencil.size = 0.5;
        System.out.println("The size of the pencil is " + pencil.size);
    }


}
