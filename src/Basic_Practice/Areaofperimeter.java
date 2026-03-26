package Basic_Practice;

import java.util.Scanner;

public class Areaofperimeter {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a length: ");
        int a = sc.nextInt();
        System.out.println("enter a width: ");
        int b = sc.nextInt();

      int area =  a * b;
      int perimeter = 2*(a + b);
      if(area > perimeter && a == b){
          System.out.println("area is greater then perimeter ");
          System.out.println("square ");
      }
      else {
          System.out.println("perimeter is big");
      }
    }

    public static class intiger {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int a = sc.nextInt();
    //        if(a % 2 == 0){
    //            System.out.println("number is even");
    //        }
    //        else{
    //            System.out.println("number is odd");
    //        }

       if(a % 5 == 0){
           System.out.println("numbr is divisible");
       }
       else {
           System.out.println("number is not divisible");
       }

        }
    }

    public static class Charactor {
        static void main() {
            Scanner sc = new Scanner(System.in);

    //    char ch = 'A';
    //        System.out.println(ch);
    //
    //        String tp = "Ayush malviya";
    //        System.out.println(tp);

         char ch = 'a';
            System.out.println(ch);
            int x = (int)ch;
            System.out.println(x);
        }
    }

    public static class Nased_if_else {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int a = sc.nextInt();

        if(a % 5 ==0 || a % 3 == 0){

        if(a % 15 != 0){
            System.out.println("number is divisible");
        }
        else {
            System.out.println("not matching the required condition");
        }

        }
        }
    }
}
