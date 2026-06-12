package Java_Collection_Framework;

import javax.management.Query;
import java.util.PriorityQueue;
import java.util.Queue;

public class Priority_Queue_Basic {
    static void main() {
        Queue<Integer> q = new PriorityQueue<>((a,b) -> a-b);
        //jo number sbse chota hoga uski priority bdi hogi
  //maxheap - Integer -> high value -> high priority
    q.offer(40);
    q.offer(30);
    q.offer(20);
    q.offer(5);
    q.offer(10);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);
    }
}
