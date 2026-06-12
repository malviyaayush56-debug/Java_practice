package SOLID_RULES_BACKEND;
//A class should have only one responsibility
//Ek class ka sirf ek hi kaam hona chahiye.
//Single Responsibility Principle (SRP)

public class Single_Responsibility_Principle {
   public static class UserService{
       public void saveUser() {
           System.out.println("User saved");
       }
   }

    static class EmailService {

        public void sendEmail() {
            System.out.println("Email sent");
        }
    }


        public static void main(String[] args) {

            UserService u = new UserService();
            u.saveUser();

            EmailService e = new EmailService();
            e.sendEmail();

   }
}
