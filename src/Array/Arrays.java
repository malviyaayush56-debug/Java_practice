package Array;

import java.util.Scanner;

public class Arrays {
    static void main() {
        Scanner sc = new Scanner(System.in);
       int arr[];
       arr = new int[4];

       int brr[] = {1,2,3,5,7,8,13};
        System.out.println(brr[2]);
        int n = brr.length;
//        System.out.println(n);
//    for (int index =0;index<=n-1;index++){
//        System.out.println(arr[index]);
//    }
      for (int val:brr){
          System.out.println(val);
      }

    }
}
