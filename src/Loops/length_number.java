package Loops;

import java.util.Scanner;

public class length_number {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int a = sc.nextInt();
  int count = 0;
    while(a!=0){
        a /= 10;
        count++;
    }
        System.out.println("the digit is 1"+ count);

    }
}
