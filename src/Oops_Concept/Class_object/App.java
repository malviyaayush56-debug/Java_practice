package Oops_Concept.Class_object;

public class App {
 public static void main(String []args) throws Exception {
       Student A = new Student(1,20,5,"Ayush");
//       A.id = 5;
//       A.name = "Ayush";
//       A.age = 20;
//       A.nos = 2;
        System.out.println(A.id);
     System.out.println(A.name);
     System.out.println(A.age);
     System.out.println(A.nos);

     A.bunk();
     A.sleep();
     A.study();

    }
}
