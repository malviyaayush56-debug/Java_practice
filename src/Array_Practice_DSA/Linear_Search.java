package Array_Practice_DSA;

import java.util.Scanner;

public class Linear_Search {
  static int search(int[] arr,int target){
      for (int i =0; i< arr.length;i++){
          if (arr[i] == target){
              return i;
          }
      }
      return -1;

  }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60};
        System.out.println("Enter a number to Search: ");
        int target = sc.nextInt();

        int ans = search(arr,target);
        if (ans == -1){
            System.out.println("Element is not found:");
        }
        else {
            System.out.println("Element found at index: "+ans+ " Element "+arr[ans] );
        }
    }
}
