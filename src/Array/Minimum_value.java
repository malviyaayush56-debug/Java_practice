package Array;


import java.util.Scanner;

public class Minimum_value {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,6,7,98,4,1,6};
        int n = arr.length;
        int minimum = arr[0];

     for (int i=1;i< n ; i++){
         if (arr[i] < minimum){
             minimum = arr[i];
         }
     }
        System.out.println(minimum);
    }
}
