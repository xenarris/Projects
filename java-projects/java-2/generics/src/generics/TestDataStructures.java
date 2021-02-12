package generics;

import javax.xml.crypto.Data;

public class TestDataStructures
{
    public static void main(String[] args)
    {
        IntegerStorage myIntStorage = new IntegerStorage(10);
        System.out.println(myIntStorage.getData());

        DoubleStorage myDoubleStorage = new DoubleStorage(10.0);
        System.out.println(myDoubleStorage.getData());

        ObjectStorage stringStorage = new ObjectStorage(("Hello World!"));
        ObjectStorage intStorage = new ObjectStorage((10));
        ObjectStorage doubleStorage = new ObjectStorage((19.5));

        //we're limitd in how we can interact with the object in ObjectStorage
        System.out.println(stringStorage.getData());

        String retrievedObject = (String)stringStorage.getData();
        System.out.println(retrievedObject.toUpperCase());

        int retrievedNumber = (int)intStorage.getData();
        System.out.println(retrievedNumber);

        //test using our generic class
        DataStorage<String> dsString = new DataStorage<>("Hello, world");
        System.out.println(dsString.getData().toUpperCase());

        //type used cannot be a primitive. has to be an reference type
        //the generic type given when using a generic class must be
        //a reference type (not a primitive type)
        //ex. int double float short long byte boolean char (Primitives)
        //ex Integer Double Float Short Byte Long Boolean CHARACTER *

        DataStorage<Integer> dsInteger = new DataStorage<>(10); // diamond notation. infers second diamond is the same
        System.out.println(dsInteger.getData());

        //unboxed automatically

        int number = dsInteger.getData();
    }
}
