package Array;

import java.util.Scanner;

public class basic_array {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        int arr[] = {1,23,456,34,2455,76};
//
//        int n = arr.length;
//        for (int i=0; i<=n;i++){
//            System.out.println(arr[i]);
//        }
    int arr[] = {10,20,30,40,50};
    int sum = 0;
    int n = arr.length;

for (int i=0;i<n;i++) {
    int value = arr[i];
    sum += value;
}
        System.out.println(sum);
    }
}
