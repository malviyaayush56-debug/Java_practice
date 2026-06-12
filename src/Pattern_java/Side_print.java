package Pattern_java;

import java.util.Scanner;

public class Side_print {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number:");
        int n = sc.nextInt();

    for (int row=1; row<=n; row++){
        for (int col=1;col<=n-row;col++){
            System.out.print(" ");
        }
        for (int col=1;col<=n;col++){
            System.out.print("* ");
        }
        System.out.println();
    }


    }
}