package Oops_Concept.Encapsulation;

public class Tech {
    static void main() throws Exception {


    //Encapculation
    Teacher A = new Teacher(2,"Ayush",20,10,"Isha");
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.id);
        System.out.println(A.nos);
        System.out.println(A.getgf());
        A.Teaching();
        A.driving();
        A.study();

    }
}
