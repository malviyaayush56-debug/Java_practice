package Pattern_java;

import java.util.Scanner;

public class Triangle {
    static void main() {
        System.out.println("Welcome : ");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = sc.nextInt();
  for (int i=1;i<=num;i++){
      for (int j=1; j<= i;j++){
//          System.out.print((char)(j+64)+"");
          System.out.print("*");
      }
      System.out.println();
  }

    }
}
