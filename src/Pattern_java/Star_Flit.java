package Pattern_java;

import java.util.Scanner;

public class Star_Flit {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
   for (int i=1;i<=n;i++){
//       for (int j=1;j<=n+1-i;j++){
       for (int j=n;j>=i;j--){
//           System.out.print("*"+" ");
           System.out.print(j+" ");
       }
       System.out.println();
   }
    }
}
