package examples;

public class DeclaringArrays
{
    public static void main(String[] args)
    {
        //declare and array with 6 characters
        char[] name = {'J', 'a', 'k', 'e', ' ', 'A'};

        //calling a method that produces an array for our code
//        String anotherName = "Susie";
//        name = anotherName.toCharArray();
//        name[0] = 'J';
//        name[1] = 'a';
//        name[2] = 'k';
//        name[3] = 'e';
//        name[4] = ' ';
//        name[5] = 'A';

        //accessing elements in the array
        System.out.println("The first char is: " + name[0]);
        name[0] = 's';
        System.out.println("The first char is: " + name[0]);

        System.out.println("The length of your name id: " + name.length);
    }
}
