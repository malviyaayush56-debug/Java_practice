package Array;
import java.util.Arrays;

public class ReverseArray {

//    public static void reverse(int[] arr) {
//
//        int start = 0;
//        int end = arr.length - 1;
//
//        while (start < end) {
//
//            // Swap
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//
//            start++;
//            end--;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        int[] arr = {10, 20, 30, 40, 50};
//
//        reverse(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }



    //reverse loop method
    static void main() {
        int[] arr = {10, 20, 30, 40, 50};
        for (int i= arr.length-1;i>=0;i--){
            System.out.print(arr[i]+ " ");
        }
    }
}
