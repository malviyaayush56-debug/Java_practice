package Loops;

import java.util.Scanner;

public class loops_gp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

      for(int i=1; i<=5 ; i++){
          System.out.println(n+" ");
      if(n==4){
          n *= 4;
      } else {
          n *= 2;
      }

      }

    }
}
