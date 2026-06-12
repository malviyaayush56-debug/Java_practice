package Array_Practice_DSA;


import java.util.Arrays;

public class BinarySearchEasy {
//    static void main() {
//        int arr[] = {14,23,21,1,5,6,8,9,4,3,1};
//        int target = 5;
//      int start = 0;
//      int end = arr.length-1;
//
//      while (start <= end){
//          int mid = (start+end)/2;
//          if (arr[mid] == target){
//              System.out.println("Element found "+target);
//              break;
//          }
//          else if (target > arr[mid]){
//              start = mid + 1;
//          }
//          else {
//              end = mid -1;
//          }
//
//      }
//    }



    static void main() {
        int arr[] = {14,23,21,1,5,6,8,9,4,3,1};
        int target = 9;
        Arrays.sort(arr);
        System.out.println("Array is sort ");
//   for (int num : arr){
//       System.out.println(num+" ");
//   }
//        System.out.println();
   //Step 2 -> Binary Search
        int start = 0;
        int end = arr.length-1;
        while (start <= end){
            int mid = (start + end )/2;
            if (arr[mid] == target){
                System.out.println("Element found at index "+mid);
                break;
            } else if (target > arr[mid]) {
                start = mid +1;
            }
            else {
                end = mid - 1;
            }
        }
    }

}
