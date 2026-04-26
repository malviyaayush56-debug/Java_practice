package Java_Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Array_Deque_Basic {
    static void main() {
        Deque<Integer> q = new ArrayDeque<>();
q.offer(5);
q.offer(10);
q.offer(15);
q.offerLast(45);
q.offerFirst(2);
        System.out.println(q);

        q.pollLast();
        System.out.println(q);
        System.out.println(q.size());
    }
}
