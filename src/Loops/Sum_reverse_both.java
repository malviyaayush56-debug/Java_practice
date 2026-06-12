package Loops;

import java.util.Scanner;

public class Sum_reverse_both {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = sc.nextInt();

  int original = n;
  int reverse = 0;

  while(n>0){
      int digit = n%10;
      reverse = reverse * 10 + digit;

      n = n/10;
  }
  int sum = original + reverse;
        System.out.println("Reverse = " + reverse);
        System.out.println("The sum of given number = "+sum);

    }

    public static class Sides_of_triangle {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int a = sc.nextInt();
            System.out.println("Enter a number: ");
            int b = sc.nextInt();
            System.out.println("Enter a number: ");
            int c = sc.nextInt();


        if((a+b>c) && (b+c>a) && (a+c>b) ){
            System.out.println("they can be the sides of a tringle: ");
        }
        else {
            System.out.println("they can not be a triangle");
        }
        }
    }

    public static class Three_digit_number {
        static void main() {
            Scanner sc = new Scanner(System.in);

            System.out.println("please enter a  number: ");
            int a = sc.nextInt();
            System.out.println("please enter a  number: ");
            int b = sc.nextInt();
            System.out.println("please enter a  number: ");
            int c = sc.nextInt();

    if(a>b && a>c){
        System.out.println("a is gretest");
    } else if (b> a && b> c) {
        System.out.println("b is gretest");
    }
    else{
        System.out.println("c is gretest");
    }


    //        if(a > 99 && a<= 999 ){
    //            System.out.println("number is three digit ");
    //        }
    //        else{
    //            System.out.println("invalid number");
    //        }

    //    if(a % 5 == 0 || a % 3 == 0){
    //        System.out.println("number is divisible");
    //    }
    //    else{
    //        System.out.println("not divisible");
    //    }


        }
    }
}
