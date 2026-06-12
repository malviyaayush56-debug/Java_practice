package Array_Practice_DSA;

import java.util.Arrays;
import java.util.HashMap;

public class FIndTargetSum {
//static int[] findsum(int[] arr,int target){
//    for (int i=0;i< arr.length;i++){
//        for (int j=i+1;j<arr.length;j++){
//            if (arr[i] + arr[j] == target){
//                int ans[] = {arr[i],arr[j]};
//                return ans;
//            }
//        }
//    }
//   int ans[] = {};
//    return ans;
//}
//
//    static void main() {
//        int[] arr = {1,2,3,5,7,15,26};
//        int target =9;
//        int[] result = findsum(arr,target);
////output
//        if (result[0] != -1){
//            System.out.println("Values: " + result[0] + ", " + result[1]);
//        } else {
//            System.out.println("No solution found");
//        }
//    }



// Void method (no return)
//static void findsum(int[] arr, int target) {
//
//    boolean found = false;
//
//    for (int i = 0; i < arr.length; i++) {
//        for (int j = i + 1; j < arr.length; j++) {
//
//            if (arr[i] + arr[j] == target) {
//                System.out.println("Values: " + arr[i] + ", " + arr[j]);
//                found = true;
//                return; // stop after first match
//            }
//        }
//    }
//
//    if (!found) {
//        System.out.println("No solution found");
//    }
//}

//HashMap Method
//static void findsum(int[] arr,int target){
//    HashMap<Integer,Integer> map = new HashMap<>();
// for (int i=0;i< arr.length;i++){
//     int complement = target - arr[i];
//     if (map.containsKey(complement)){
//         System.out.println("Values: " + complement + ", " + arr[i]);
//   return;
//     }
//     map.put(arr[i],i);
// }
//    System.out.println("No solution found");
//}

//Sorting + Two Pointer method
static void findsum(int[] arr, int target) {
    Arrays.sort(arr);
int left =0;
int right = arr.length-1;
while (left<right){
  int sum = arr[left] + arr[right];
  if (sum == target){
      System.out.println("Values "+arr[left]+ ", "+ arr[right]+" Target is : "+sum );
 return;
  }
  else if (sum<target){
      left++;
  }
  else {
      right--;
  }
}
    System.out.println("No solution Found ");
}
    // Main method
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5, 7, 15, 26};
        int target = 10;

        findsum(arr, target);

    }
}