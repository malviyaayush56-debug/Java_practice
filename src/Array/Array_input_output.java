package Array;

import java.util.Scanner;

public class Array_input_output {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][4];
   for (int i=0;i<=arr.length-1;i++){
       for (int j=0;j<= arr.length-1;j++){
           System.out.println("provie value for row= "+i+"and coloum = "+j);
           arr[i][j] = sc.nextInt();
       }
   }
        for (int i = 0; i < arr.length; i++) {          // rows
            for (int j = 0; j < arr.length; j++) {      // columns
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
