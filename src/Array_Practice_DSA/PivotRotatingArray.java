package Array_Practice_DSA;
//Linear Search
//public class PivotRotatingArray {
//  public static int findpivot(int[] arr){
//      for (int i=0;i< arr.length-1;i++){
//        if (arr[i] > arr[i+1]){
//            return i;
//        }
//      }
//      return -1;
//  }
//
//    static void main() {
//        int[] arr = {4,5,6,7,0,1,2};
//int pivot = findpivot(arr);
//        System.out.println("Pivot Index "+pivot);
//    }
//}

//Method 2 Binary Search

import java.util.Arrays;

public class PivotRotatingArray {
    public static int findpivotArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start <= end){
            int mid = (start + end) /2;
            //Case 1
    if (mid < end && arr[mid] > arr[mid+1]){
        return mid;
    }
    //Case 2
   if (mid>start && arr[mid]< arr[mid-1]){
       return mid-1;
   }
   //left side sorted
     if (arr[start] >= arr[mid]){
         end = mid-1;
     }
    //Right side sorted
    else {
        start = mid+1;
     }
        }
        return -1;
    }

    static void main() {
        int[] arr = {4,5,6,7,0,1,2};

        int pivot = findpivotArray(arr);

        System.out.println("Pivot index = " + pivot);
    }
}