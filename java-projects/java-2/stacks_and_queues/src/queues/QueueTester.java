package queues;

public class QueueTester
{
    public static void main(String[] args)
    {
        MyQueue newQueue = new MyQueue();

        //adding elements
        newQueue.enqueue(1);
        newQueue.enqueue(2);
        newQueue.enqueue(3);
        newQueue.enqueue(4);

        //check first element
        System.out.println(newQueue.peek());
        System.out.println();

        //removed all current elements
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.dequeue());
        System.out.println();

        //random tests + test empty ArrayList
        newQueue.enqueue(6);
        newQueue.enqueue(9);
        System.out.println(newQueue.dequeue());
        newQueue.enqueue("e");
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.dequeue());
        System.out.println(newQueue.dequeue());


        newQueue.enqueue("a");
        newQueue.enqueue("b");
        newQueue.enqueue("c");

        while(newQueue.size() < 500000)
        {
            //TODO
        }
    }
}
