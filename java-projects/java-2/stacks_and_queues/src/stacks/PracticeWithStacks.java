package stacks;

import java.util.Random;

public class PracticeWithStacks
{
    public static void main(String[] args)
    {
        BoundedStack stackOfRandomNumbers = new BoundedStack(100);
        Random random = new Random();

        //fill the stack
        while (!stackOfRandomNumbers.isFull())
        {
            int randomNum = random.nextInt(20);
            System.out.println(randomNum);
            stackOfRandomNumbers.push(randomNum);
        }

        printStackDetails(stackOfRandomNumbers);

        System.out.println("Dump all elements in the stack");
        while(!stackOfRandomNumbers.isEmpty())
        {
            System.out.println(stackOfRandomNumbers.pop());
        }

        printStackDetails(stackOfRandomNumbers);
    }

    private static void sanityCheck()
    {
        BoundedStack stack = new BoundedStack(5);
        //report on the size of the stacks
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
    }

    private static void printStackDetails(BoundedStack stack)
    {
        System.out.println("Empty? " + stack.isEmpty());
        System.out.println("Full? " + stack.isFull());
        System.out.println("Size? " + stack.size());
        System.out.println();

    }
}
