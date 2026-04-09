package Pattern_java;

import java.util.Scanner;

public class Star {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("pleese enter rows:");
        int rows = sc.nextInt();
        System.out.println("please enter a colom");
        int col = sc.nextInt();
//       for (int i =1;i<=rows;i++){
//           for (int j =1;j<=col;j++){
//               System.out.print("* ");
   for (int i =1;i<=rows;i++){
       for (int j=1;j<=col;j++){
//           System.out.print((char) (j+96)+" ");
           System.out.print((i)+" ");

           }
           System.out.println();
//           System.out.println("* * * * *");
       }
    }
}
