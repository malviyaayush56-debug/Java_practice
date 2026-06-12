package Loops;

import java.util.Scanner;

public class Reverse_given_num {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
  int reverse = 0;

  while(n>0){
      int digit = n % 10;
      reverse = reverse * 10 + digit;
      n = n/10;
  }
        System.out.println("Reverse number is "+reverse);
    }

    public static class CalculatePercentage {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter a Marks:");
            double num = sc.nextDouble();
            System.out.println("Please enter a Marks:");
            double num1 = sc.nextDouble();
            System.out.println("Please enter a Marks:");
            double num2 = sc.nextDouble();
            System.out.println("Please enter a Marks:");
            double num3 = sc.nextDouble();
            System.out.println("Please enter a Marks:");
            double num4 = sc.nextDouble();

            double total = (num+num1+num2+num3+num4)/5;
            System.out.println(total);

        }
    }

    public static class Practice2 {
        static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("please enter a cost price: ");
            double a = sc.nextDouble();

            System.out.println("please enter a selling price: ");
            double b = sc.nextDouble();

        if(a > b) {
            System.out.println("the seller has made loss");
        } else if (a<b) {
            System.out.println("the saller has gain profite");
        }
        else if (a == b){
            System.out.println("naither saller has gain profit nor loss: ");
        }
        }
    }
}
