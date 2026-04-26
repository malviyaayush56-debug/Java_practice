package Java_Collection_Framework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetBasic {
    static void main() {

      HashSet<Student> set = new HashSet<>();
Student s1 = new Student(1,"Ayush");
Student s2 = new Student(2,"Isha");
Student s3 = new Student(3,"Spiderman");
Student s4 = new Student(1,"Ayush");

set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set);

//  Set<Integer> set1  = new HashSet<>();
//  Set<Integer> set2  = new HashSet<>();
//
//     set1.add(10);
//     set1.add(15);
////     set1.add(5);
//     set1.add(20);
//
//     set2.add(10);
//     set2.add(15);
//     set2.add(20);
//     set2.add(6);
//        System.out.println(set1);
//     set1.retainAll(set2);
//        System.out.println(set1);
//        System.out.println(set2);
//        System.out.println(set2.containsAll(set1));
//        System.out.println(set1.containsAll(set2));
//
//        Set<Integer> s = new LinkedHashSet<>();
//        s.add(10);
//        s.add(15);
//        s.add(10);
//        s.add(18);
//        s.add(20);
//        s.add(18);
//        System.out.println(s);
//
//        Set<Integer> t = new TreeSet<>();
//        s.add(10);
//        s.add(15);
//        s.add(10);
//        s.add(18);
//        s.add(20);
//        s.add(18);
//        System.out.println(t);



    }
}
