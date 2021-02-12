package exercises;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ChapterExercises
{
    public static void main(String[] args)
    {
        //problem 1
        Stack<Integer> testStack = new Stack<>();
        testStack.add(3);
        testStack.add(-5);
        testStack.add(1);
        testStack.add(2);
        testStack.add(-4);

        splitStack(testStack);

        System.out.println();

        //problem 2
        Stack<Integer> testStack1 = new Stack<>();
        testStack1.add(3);
        testStack1.add(7);
        testStack1.add(1);
        testStack1.add(14);
        testStack1.add(9);

        stutter(testStack1);

        System.out.println();

        //problem 3
        Stack<Integer> testStack2 = new Stack<>();
        testStack2.add(3);
        testStack2.add(7);
        testStack2.add(1);
        testStack2.add(14);
        testStack2.add(9);
        System.out.println(copyStack(testStack2));

        System.out.println();

        //problem 6
        Queue<Integer> testQueue = new LinkedList<>();
        testQueue.add(3);
        testQueue.add(5);
        testQueue.add(4);
        testQueue.add(17);
        testQueue.add(6);
        testQueue.add(83);
        testQueue.add(1);
        testQueue.add(84);
        testQueue.add(16);
        testQueue.add(37);
        rearrange(testQueue);
        System.out.println(testQueue);


    }

    //problem 1
    private static void splitStack(Stack<Integer> stack)
    {
        Queue<Integer> intQueue = new LinkedList<>();

        while (!stack.isEmpty())
        {
            intQueue.add(stack.pop());
        }

        while (!intQueue.isEmpty())
        {
            if (stack.isEmpty())
            {
                stack.push(intQueue.remove());
            }
            else if (intQueue.peek() > stack.peek())
            {
                stack.add(intQueue.remove());
            }
            else
            {
                intQueue.add(stack.pop());
            }
        }

        System.out.println(stack);
    }

    //problem 2
    private static void stutter(Stack<Integer> stack)
    {
        Queue<Integer> integerQueue = new LinkedList<>();
        int temp;

        while (!stack.isEmpty())
        {
            temp = stack.pop();
            integerQueue.add(temp);
            integerQueue.add(temp);
        }

        while (!integerQueue.isEmpty())
        {
            stack.push(integerQueue.remove());
        }

        while (!stack.isEmpty())
        {
            integerQueue.add(stack.pop());
        }

        System.out.println(integerQueue);

    }

    //problem 3
    private static Stack<Integer> copyStack(Stack<Integer> stack)
    {
        Queue<Integer> integerQueue = new LinkedList<>();
        Stack<Integer> newStack = new Stack<>();

        while (!stack.isEmpty())
        {
            integerQueue.add(stack.pop());
        }

        while (!integerQueue.isEmpty())
        {
            stack.add(integerQueue.remove());
        }

        while (!stack.isEmpty())
        {
            integerQueue.add(stack.pop());
        }

        while (!integerQueue.isEmpty())
        {
            stack.push(integerQueue.peek());
            newStack.push(integerQueue.remove());
        }

        return newStack;
    }

    //problem 6
    private static void rearrange(Queue<Integer> queue)
    {
        Stack<Integer> stack = new Stack<>();
        int queueSize = queue.size();

        for (int i = 0; i < queueSize; i++)
        {
            if (queue.peek() % 2 == 0)
            {
                queue.add(queue.remove());
            }
            else
            {
                stack.add(queue.remove());
            }
        }

        while (!stack.isEmpty())
        {
            queue.add(stack.pop());
        }

        for (int i = 0; i < queueSize; i++)
        {
            if (queue.peek() % 2 == 0)
            {
                queue.add(queue.remove());
            }
            else
            {
                stack.add(queue.remove());
            }
        }

        while (!stack.isEmpty())
        {
            queue.add(stack.pop());
        }
    }

}
