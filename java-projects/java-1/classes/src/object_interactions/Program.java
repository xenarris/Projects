package object_interactions;

public class Program
{
    public static void main(String[] args)
    {
        //create a user
        User me = new User("books4me", "Josh Archer");

        //create a shelf for the user
        BookShelf shelf = new BookShelf();

        //create a few books
        Book book1 = new Book("2345235423542", "IT", "Stephen King");
        Book book2 = new Book("9879879876545", "Another", "King Shark");
        Book book3 = new Book("2345336536342", "Pie", "Matt Sir");

        shelf.addBook(book1);
        shelf.addBook(book2);
        shelf.addBook(book3);

        for (int i = 0; i < 7; i++)
        {
            shelf.addBook(book1);
        }

        System.out.println("This is " + me.getUsername() + "'s bookshelf");
        shelf.printShelf();
    }
}
