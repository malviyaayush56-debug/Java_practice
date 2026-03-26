package Loops;

import java.util.Scanner;

public class Sum_of_all_even {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
      while (n>0){
          int digit = n % 10;

          if(digit % 2 == 0){
              sum += digit;
          }
          n = n / 10;
      }
        System.out.println("sum of even digits = "+sum);
    }
}
