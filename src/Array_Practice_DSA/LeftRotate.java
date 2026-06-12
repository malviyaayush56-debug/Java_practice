package Array_Practice_DSA;

import java.util.Arrays;

public class LeftRotate {
    static void reverse(int arr[], int start, int end){
while(start < end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
    }
    static void rotateLeft(int arr[], int k){
      int n = arr.length;
        // handle large k
        k = k % n;
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotateLeft(arr, 2);

        System.out.println(Arrays.toString(arr));
    }
}
