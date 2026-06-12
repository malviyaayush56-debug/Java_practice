package Array;

import java.util.Scanner;

public class Array_input {
    static void main() {
       int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
      int n = arr.length;

      for (int i=0;i<=n;i++){
          arr[i] = sc.nextInt();
      }
    }
}
