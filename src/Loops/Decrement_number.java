package Loops;

import java.util.Scanner;

public class Decrement_number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
    int i;
//    for( i=1;i<=n;i=i+3){
//
//            System.out.println(i);
//    }
        for( i=1;i<=n;i=i+2){

            System.out.println(i);
        }
    }
}
