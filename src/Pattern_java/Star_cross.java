package Pattern_java;

import java.util.Scanner;

public class Star_cross {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // odd ya even dono chalega

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j || i + j == n + 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
