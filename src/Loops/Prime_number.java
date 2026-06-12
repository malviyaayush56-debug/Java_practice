package Loops;

import java.util.Scanner;

public class Prime_number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        boolean b = false;
        for(int i=2;i<n;i++){
        if(n%i==0){
       b = true;
            break;
        }
       }
        if(n==1)
            System.out.println("neither prime nor composite");
        if (b == false)
        System.out.println("composite number: ");
        else
        System.out.println("prime number");
      }
      }
