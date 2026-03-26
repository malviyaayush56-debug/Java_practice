import java.util.Scanner;

public class Student_percentage_que {
    static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your percentage");
        int a = sc.nextInt();

       if(a >= 90 && a<= 100 ) {
           System.out.println("excellent");
       }
       else if (a >= 80 && a <= 90){
               System.out.println("very good");
           }
           else if(a >= 70 && a <= 80){
               System.out.println("good");
           }
           else if(a >= 60 && a <= 70){
               System.out.println("can do better");
           }
           else if(a >= 50 && a <= 60){
               System.out.println("Average");
           }
           else if(a >= 40 && a <= 50){
               System.out.println("below average");
           }
         else if (a < 40) {
               System.out.println("fail");
           }
         else {
               System.out.println("better luck next time");
           }

       }
    }

