package Pattern_java;

import java.util.Scanner;

public class oddtriangle {
//    public static void main(String[] args) {
//        int n = 5;
//        int num = 1;
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + " ");
//                num += 2;
//            }
//            System.out.println();
//        }
//    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
        int num = 1; // reset every row

        for (int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num += 2;
        }
        System.out.println();
    }
}
}
