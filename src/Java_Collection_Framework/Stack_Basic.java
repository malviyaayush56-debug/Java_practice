package Java_Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Stack_Basic {
    static void main() {
        Deque<Integer> s = new ArrayDeque<>();
        s.add(4);
        s.push(5);
        s.push(10);
        System.out.println(s);
        s.pop();
        System.out.println(s);
    }
}
