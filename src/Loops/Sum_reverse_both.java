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
}
