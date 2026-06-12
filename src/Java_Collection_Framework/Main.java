package Java_Collection_Framework;

import java.util.*;

public class Main {
    static void main() {


    //List or Collection -> interface

//ArrayList -> concrete class
ArrayList<Integer> list = new ArrayList<>();
//add
 list.add(10);
list.add(20);
list.add(30);
        System.out.println(list);
        list.add(40);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        //add all
List<Integer> list2 = new ArrayList<>();
list2.add(101);
list2.add(102);
list2.add(20);

list.addAll(list2);
        System.out.println(list);
        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("Printing list2: "+list2);
        list2.clear();
        System.out.println(list2.size());

        //i went to traval list using iterator
        Iterator<Integer> iterator = list.iterator();
while (iterator.hasNext()){
    System.out.println("Element: "+iterator.next());
}


List<Integer> list3 = new ArrayList<>();
list3.add(11);
list3.add(12);
list3.add(13);

        System.out.println(list3.get(2));
        System.out.println("before set: "+list3);
        list3.set(0,100);
        System.out.println("After set: "+list3);
//Collection<Integer> collection = new ArrayList<>();

        //To Array method
  Object[] arr = list3.toArray();
for(Object obj: arr ){
    System.out.println(obj);
}
//contains method
        System.out.println( list3.contains(10));
//Sort method
list.add(12);
list.add(6);
        System.out.println("The entire list "+list);
Collections.sort(list);
        System.out.println("The entire list "+list);
        //Reverse order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("The entire list "+list);

     //Clone Method
 ArrayList<Integer> newList = (ArrayList<Integer>)list.clone();
        System.out.println(newList);
        System.out.println(newList.indexOf(30));
        //Ensure capacity
   ArrayList<Integer> marks = new ArrayList<>();
   marks.ensureCapacity(100);
        System.out.println(newList.isEmpty());



    }
}
