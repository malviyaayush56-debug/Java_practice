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
    }

