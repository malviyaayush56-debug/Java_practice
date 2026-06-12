package Array;
import java.util.Arrays;
public class RotateNumber {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int k = 2;

        rotate(arr, k);

        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr, int start, int end) {

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
    public static void rotate(int[] arr, int k) {

        int n = arr.length;

        k = k % n; // handle big k

        // step 1: full reverse
        reverse(arr, 0, n - 1);

        // step 2: first k reverse
        reverse(arr, 0, k - 1);

        // step 3: remaining reverse
        reverse(arr, k, n - 1);
    }
}
