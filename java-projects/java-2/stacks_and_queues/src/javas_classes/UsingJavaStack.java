package javas_classes;

import java.util.Stack;

public class UsingJavaStack
{
    public static void main(String[] args)
    {
        Stack<String> stack = new Stack<>();

        printStackDetails(stack);

        //add a few elements
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");

        //report again
        printStackDetails(stack);

        //remove a few elements
        System.out.println(stack.peek()); //d
        System.out.println(stack.pop()); //d
        System.out.println(stack.pop()); // c
        System.out.println(stack.peek()); // b
        System.out.println(stack.pop()); // b
        System.out.println(stack.peek()); // a

        //report again
        printStackDetails(stack);

        //add a few elements to the stack
        stack.push("e");
        stack.push("f");
        stack.push("g");
        stack.push("h");
        stack.push("i");

        for (String letter: stack)
        {
            System.out.println(letter);
        }
    }

    private static void printStackDetails(Stack stack)
    {
        System.out.println("Empty? " + stack.isEmpty());
        System.out.println("Size? " + stack.size());
        System.out.println();

    }
}
