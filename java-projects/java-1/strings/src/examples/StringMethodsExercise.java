package examples;

public class StringMethodsExercise
{
    public static void main(String[] args)
    {
        String message = "And here and there and near and far";
        andSubstring(message);

    }

    public static void andSubstring(String input)
    {
        String testString = input;
        final String AND = "and";
        int index = 0;

        do {
            index = testString.indexOf(AND);
            System.out.print(index + ", ");
            testString = testString.replaceFirst(AND, "   ");

        } while (testString.contains(AND));


//        while (testString.contains(AND))
//        {
//            index = index + 1;
//        //.indexOf(AND);
//            System.out.print(index + ", ");
//
//            testString = originString.substring(index + 1);
//
//
//        }
    }
}
