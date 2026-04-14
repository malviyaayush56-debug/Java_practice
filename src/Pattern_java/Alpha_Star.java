package Pattern_java;

import java.util.Scanner;

public class Alpha_Star {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//     for (int i=1; i<=n;i++){
//         for (int j=1;j<=i-1;j++){
//             System.out.print("  ");
//         }
//         for(int j=1;j<=2*n-2*i;j++){
//             System.out.print("* ");
//         }
//         System.out.println();
//     }
        for (int i=1; i<=n;i++){
            for (int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
