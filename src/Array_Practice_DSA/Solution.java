package Array_Practice_DSA;

import java.util.*;

public class Solution {

//    public int missingNumber(int[] nums){
//        int n = nums.length;
//        int sum = n * (n + 1) / 2;
//        int realSum = 0;
//
//        for (int x : nums){
//            realSum += x;
//        }
//
//        return sum - realSum;
//    }

//    public static void main(String[] args) {
//
//        int nums[] = {0,1,2,3,5}; // example (missing 4)
//
//        Solution obj = new Solution(); // object create
//        int result = obj.missingNumber(nums);
//
//        System.out.println("Missing Number: " + result);
//    }
    // method 2

//public int missingNumber(int[] nums) {
//    Arrays.sort(nums);
//
//    for (int i = 0; i < nums.length; i++) {
//        if (nums[i] != i) return i;
//    }
//
//    return nums.length;
//}
//
//    public static void main(String[] args) {
//
//        int nums[] = {0,1,2,3,5}; // example (missing 4)
//
//        Solution obj = new Solution(); // object create
//        int result = obj.missingNumber(nums);
//
//        System.out.println("Missing Number: " + result);
//    }
// method 3
    public int missingNumber(int[] nums) {
        int n = nums.length;

        int xor = 0;

        // XOR from 0 to n
        for (int i = 0; i <= n; i++) {
            xor ^= i;
        }

        // XOR with array elements
        for (int x : nums) {
            xor ^= x;
        }

        return xor;
    }
    public static void main(String[] args) {

        int nums[] = {0,1,2,3,5}; // example (missing 4)

        Solution obj = new Solution(); // object create
        int result = obj.missingNumber(nums);

        System.out.println("Missing Number: " + result);
    }

}