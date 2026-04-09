package Pattern_java;

import java.util.Scanner;

public class Ractangle {
    static void main() {
        Scanner sc = new Scanner(System.in);

   int m = sc.nextInt();

        int n = sc.nextInt();

   for (int i=1;i<=m;i++){
       for (int j=1;j<=n;j++)
    if(i==1 || i==n || j==1 || j==n)
        System.out.print("* ");
       else System.out.print("# ");
   }
        System.out.println();
    }
}
