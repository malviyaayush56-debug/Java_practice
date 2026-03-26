package Loops;

import java.util.Scanner;

public class Table_print {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a table number: ");
      int n = sc.nextInt();

     for(int i = 1;i<=10;i++){
         System.out.println(n+" X "+i+" = " +(n * i));
     }

    }
}
