package Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;

public class Teacher implements Comparable<Teacher> {

    public int age;
    public String name;
    public int weight;

    // Constructor
    public Teacher(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    // Getter Setter
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    // Sorting by age
    @Override
    public int compareTo(Teacher that) {
        return this.age - that.age;
    }

    // Print Object
    @Override
    public String toString() {
        return "Teacher [age=" + age + ", name=" + name + ", weight=" + weight + "]";
    }

//    // Main Method
//    public static void main(String[] args) {
//
//        ArrayList<Teacher> list = new ArrayList<>();
//
//        list.add(new Teacher(25, "Rahul", 65));
//        list.add(new Teacher(20, "Amit", 70));
//        list.add(new Teacher(30, "Neha", 55));
//        list.add(new Teacher(22, "Priya", 50));
//
//        System.out.println("Before Sorting:");
//        System.out.println(list);
//
//        Collections.sort(list);
//
//        System.out.println("\nAfter Sorting by Age:");
//        System.out.println(list);
//    }
}