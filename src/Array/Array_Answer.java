package Array;

import java.util.Scanner;

public class Array_Answer {

    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,3,10,20};
        int ans =1;
        int n = arr.length;

     for (int i=0; i<n; i++){
         int value = arr[i];
         ans = ans*value;
     }
        System.out.println(ans);
    }
}
