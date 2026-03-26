package Loops;

import java.util.Scanner;

public class Higest_factor_loop {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
  int a = 1;
      for(int i = n-1;i>=1;i--){
          if (n % i ==0) {
              a = i;
              break;
          }

      }
        System.out.println(a);
    }
}
