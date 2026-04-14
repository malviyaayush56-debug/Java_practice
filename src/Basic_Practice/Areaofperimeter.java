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

    public static class Three_point_fall {
        static void main() {
            Scanner sc = new Scanner(System.in);

            double x1 = 1,x2=1,x3=3,y1=2,y2=2,y3=3;
            double m1  = (y2-y1)/(x2-x1);
            double m2 = (y3-y2)/(x3-x2);

           if(m1==m2){
               System.out.println("the three points lie on a single line");
           }
            else {
               System.out.println("the three point dont lie ona single line");
           }
        }
    }

    public static class practice {
        static void main() {
            int i = 2 , j = 3 , k , l;
            double a, b;

            k = i/j*j;
            l = j / i * i ;
            a = i / j * j ;
            b = j / i * i;

            System.out.println(k+""+l+""+a+""+b);
        }
    }
}
