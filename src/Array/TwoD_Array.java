package Array;

import java.util.Scanner;

public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] brr = {
                {1,2},
                {2,3},
                {3,4},
                {4,5}
        };

        int row = brr.length;
        int col = brr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}