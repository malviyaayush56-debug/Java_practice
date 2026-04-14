package Pattern_java;

import java.util.Scanner;

public class Fulll_Pyramid_Blank {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces (left side)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars + hollow logic
            for (int j = 1; j <= (2 * i - 1); j++) {

                // boundary condition
                if (j == 1 || j == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}