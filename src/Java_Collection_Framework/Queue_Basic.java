package Java_Collection_Framework;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_Basic {
    static void main() {
//        Queue<Integer> q = new LinkedList<>();
        Deque<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        System.out.println(q);
//        System.out.println(q.element());
        System.out.println(q.peek());
//        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q);


    }
}
