package javas_classes;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class UsingJavasQueues
{
    public static void main(String[] args)
    {
        Queue<Double> queueOfDoubles = new PriorityQueue<>();

        queueOfDoubles.offer(1.0);
        queueOfDoubles.offer(2.0);
        queueOfDoubles.offer(3.0);
        queueOfDoubles.offer(4.0);
        queueOfDoubles.offer(5.0);

        //make some changes
//        System.out.println(queueOfDoubles.poll());// 1
//        System.out.println(queueOfDoubles.peek());// 2
//        System.out.println(queueOfDoubles.poll());// 2
//        System.out.println(queueOfDoubles.poll());// 3
//        System.out.println(queueOfDoubles.peek());// 4
//        System.out.println(queueOfDoubles.peek());// 4
//
//        queueOfDoubles.offer(6.0);
//        System.out.println(queueOfDoubles.poll());  // 4

        //print our my elements
        while (!queueOfDoubles.isEmpty())
        {
            System.out.println(queueOfDoubles.poll());
        }
    }
}
