package Pattern_java;

import java.util.Scanner;

public class SquarePattern {
    static void main() {
        Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int a = n;
   for(int i=1;i<=n;i++){
       for (int j=1;j<=a;j++){
           System.out.print("*"+" ");
       }
       a--;
       System.out.println();
   }

    }
}
