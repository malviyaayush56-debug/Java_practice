package Oops_Concept.Class_object;

public class Student {
    //Atributes

    public int id;
    public int age;
    public String name;
    public int nos;
    //Constructor
//public Student(){
//    System.out.println("Student defualt ctor called");
//}

    public Student(int id, int age, int nos, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //Methods/Behaviour
public void study(){
    System.out.println(name+" Studying...");
}
    public void sleep(){
        System.out.println(name+" Sleeping...");
    }
    public void bunk(){
        System.out.println(name+" bunk School...");
    }


    }

