package Java_Collection_Framework;

import java.util.LinkedList;

public class linked_list {
    static void main() {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        System.out.println(list.indexOf(40));
        System.out.println(list.size());
//        list.add(20);
//        list.add(20);
//       System.out.println(list.lastIndexOf(20));
 // Add first and last method

        System.out.println("my complete list: "+list);
        list.addFirst(5);
        System.out.println(list);
        list.addLast(75);
        System.out.println(list);

        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list.getFirst());
        System.out.println(list);
        System.out.println(list.getLast());

        //peek method
        System.out.println(list.peek());
        System.out.println("before poll "+list);
        System.out.println("Apply poll "+list.poll());
        System.out.println("After poll "+list);
        list.offer(2);
        System.out.println(list);


    }
}
