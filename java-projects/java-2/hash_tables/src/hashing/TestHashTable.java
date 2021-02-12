package hashing;

public class TestHashTable
{

    public static void main(String[] args)
    {
        HashTable table = new HashTable();

        //test out our add method
        int[] elementsToInsert = {12, 4, 15, 18, 22, 33, 24, 111, 0, 13, 15, 28, 54, 50};

        for(int element : elementsToInsert)
        {
            table.add(element);
            System.out.println(table);
        }

        System.out.println(table.contains(12));
        System.out.println(table.contains(22));
        System.out.println(table.contains(13));
        System.out.println();

        System.out.println(table.contains(1));
        System.out.println(table.contains(-10));
    }
}
