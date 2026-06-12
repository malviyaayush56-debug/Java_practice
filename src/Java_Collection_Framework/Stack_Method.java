package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stack_Method {
    static void main() {

        Stack<Integer> list = new Stack<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        System.out.println(list.pop());
        System.out.println(list.empty());
        System.out.println(list.push(3));
        System.out.println(list);

        System.out.println(list.peek());
        System.out.println(list.search(33));



//        //add all
//        List<Integer> list2 = new Stack<>();
//        list2.add(101);
//        list2.add(102);
//        list2.add(20);
//
//        list.addAll(list2);
//        System.out.println(list);
//        list.removeAll(list2);
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println("Printing list2: "+list2);
//        list2.clear();
//        System.out.println(list2.size());


    }
}
