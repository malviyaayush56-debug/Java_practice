package Binary_Search;

import Array_Practice_DSA.Solution;
//
//public class Nearly_Sorted_Array {
//    static void main() {
//        Nearly_Sorted_Array obj = new Nearly_Sorted_Array();
//        int[] arr = {3, 5, 10, 9, 11};
//
//        int k = 9;
//        int ans = obj.findElementInNearlySortedArray(arr,k);
//        System.out.println("Element found at index : " + ans);
//    }
//    public int findElementInNearlySortedArray(int[] arr, int k) {
//       int low =0;
//       int high = arr.length -1;
//       while (low<=high){
//           int mid = low+(high-low)/2;
//           // mid check
//           if (arr[mid] == k) {
//               return mid;
//           }
//           // left adjacent check
//           if (mid - 1 >= low && arr[mid - 1] == k) {
//               return mid - 1;
//           }
//           // right adjacent check
//           if (mid + 1 <= high && arr[mid + 1] == k) {
//               return mid + 1;
//           }
//           // go to left side
//           if (arr[mid] > k) {
//               high = mid - 2;
//           }
//           // go to right side
//           else {
//               low = mid + 2;
//           }
//       }
//       return -1;
//    }
//}


//Short easy method
public class Nearly_Sorted_Array {

    public int findElementInNearlySortedArray(int[] arr, int k) {
        int low =0;
        int high = arr.length -1;
        while (low <= high){
            int mid = low + (high -low)/2;
            //check mid
            if (arr[mid] == k){
                return mid;
            }
            //check left
            if (mid > low && arr[mid-1] == k){
                return mid-1;
            }
            //check right
            if (mid < high && arr[mid+1] == k){
                return mid+1;
            }
            //move left
            if (arr[mid] > k){
                high = mid -2;
            }
            else {
               low =  mid + 2;
            }
        }
        return -1;

    }
    public static void main(String[] args) {

        Nearly_Sorted_Array obj = new Nearly_Sorted_Array();

        int[] arr = {3, 5, 10, 9, 11};

        int ans = obj.findElementInNearlySortedArray(arr, 9);

        System.out.println("Index : "+ans);
    }
}