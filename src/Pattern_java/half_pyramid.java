//package Pattern_java;
//
//import java.util.Scanner;
//
//public class half_pyramid {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//  for (int i=1;i<=n;i++){
//      if (i==1|| i==2 || i==n){
//for (int j=1;j<=i;j++){
//    System.out.print("* ");
//}
//      }
//      else {
//          System.out.print("* ");
//          for (int j=1;j<=(i-2);j++){
//              System.out.print(" ");
//          }
//          System.out.print("* ");
//      }
//      System.out.println();
//  }
//
//
//    }
//}
package Pattern_java;

import java.util.Scanner;

public class half_pyramid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // first row or last row → full stars
            if (i == 1 || i == n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("* "); // first star

                // beech ka space (IMPORTANT FIX)
                for (int j = 1; j <= i - 2; j++) {
                    System.out.print("  "); // double space
                }

                System.out.print("* "); // last star
            }

            System.out.println();
        }
    }
}
