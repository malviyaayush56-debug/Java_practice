package Basic_Practice;

import java.util.Scanner;

public class Absolute_value {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
      int a = sc.nextInt();

//     if (a >= 0 ){
//         System.out.println("number is absolute");
//     }
//     else {
//         System.out.println("number is not absolute");
//     }

        if(a < 0){
          a = a*(-1);
        }
        System.out.println("the absolute value is "+a);
    }

    public static class Area_of_circle {
        static void main() {
           double radius = 5;
           double pi = 3.1415;
           double area = pi* radius*radius;

            System.out.println(area);
        }
    }

    public static class leap_years {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a year: ");
            int a = sc.nextInt();

          if(a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
              System.out.println("year is leaper");
          } else {
              System.out.println("year is not leaper");
          }

        }
    }

    public static class AreaInputCircle {
        static void main() {
            Scanner sc = new Scanner(System.in);

            System.out.print("Please enter a radius: ");
            double r = sc.nextDouble();
    //        double pi = 3.1415;

            double area = r * r * Math.PI;

            System.out.println(area);
        }
    }
}
