package Oops_Concept.Class_object;

public class Main {
    static void main() {
        User user = new User("Isha","Ishu.72@gmail.com",20);
//      user.name = " Ayush";
//
//      user.rollNO =10;
//      user.emailId = " Malviyaayush56@gmail.com";

      user.name();

      user.emailId();
      user.rollNo();

      User user1 = new User("Pari","Pari23@gmail.com",27);
//      user1.name = "Virat";
//      user1.emailId = "Virat@gmail.com";
//      user1.rollNO= 18;

      user1.name();
      user1.emailId();
      user1.rollNo();
      user1.name("Malviya");
    }
}



