package Loops;

import java.util.Scanner;

public class Sum_of_Digit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

//  int sum = 0;
//  while (n>0){
//      int digit = n % 10;
//      sum += digit;
//      n = n/10;
//  }
//
//        System.out.println("sum of digits = "+ sum);



int product = 1;

while(n>0){
    int digit = n % 10;
    product = product * digit;
    n = n / 10;

}
        System.out.println("Product of digits ="+product);
    }

    public static class Double_datatpe {
        static void main() {
            double x = 3.245;
            double y = 10;

            double sum = x +y;
            System.out.println(sum);
        }
    }

    public static class NumberIncrement {
        static void main() {
            int x = 5;
            System.out.println(x);
            x++;
            System.out.println(x);
            x--;
            System.out.println(x);
            ++x;
            System.out.println(x);
        }
    }

    public static class NumberPrint {
      public  static void main() {

          int a = 1;
          int b = 3;

          int sum = a + b;

          System.out.println(sum);

        }
    }

    public static class Problem1 {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter no. 1: ");
            int a = sc.nextInt();
            System.out.println("Please enter no. 2: ");
            int b = sc.nextInt();

          int reminder = a % b ;

            System.out.println(reminder);

        }
    }

    public static class Student_percentage_que {
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
}

