package Loops;

import java.util.Scanner;

public class Divisible {
    static void main() {
        Scanner sc = new Scanner(System.in);
     for(int i = 1; i<=100;i++){
     if (i==14 || i == 27) continue;
         if (i %2==0  && i%3==0){
             continue;
         }
         System.out.println(i+" ");
     }
    }
}
