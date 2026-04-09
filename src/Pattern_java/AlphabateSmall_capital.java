package Pattern_java;

import java.util.Scanner;

public class AlphabateSmall_capital {
    static void main() {
        Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     for(int i=1;i<=n;i++){
         for (int j=1;j<=n;j++){
             if(i%2 ==1)
                 System.out.print((char)(i+96)+" " );
             else System.out.print((char) (i+64)+" ");

         }
         System.out.println();
     }

    }
}
