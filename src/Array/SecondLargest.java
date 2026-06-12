package Array;

import java.util.Arrays;

public class SecondLargest {
//    public static void main(String[] args) {
//
//        int[] arr = {10, 50, 20, 40, 30};
//
//        int ans = secondLargest(arr);
//
//        System.out.println("Second Largest = " + ans);
//    }
//    public static int secondLargest(int[] arr){
//int largest = Integer.MIN_VALUE;
//int secondLargest = Integer.MIN_VALUE;
//
//for (int i =0;i<arr.length;i++){
//    if (arr[i] > largest){
//        secondLargest = largest;
//        largest = arr[i];
//    }
//    else if (arr[i] > secondLargest && arr[i] != largest){
//        secondLargest = arr[i];
//    }
//}
//return secondLargest;
//    }


//    static void main() {
//        int[] arr = {10, 50, 20, 40, 30};
//        Arrays.sort(arr);
//        int secondlargest = arr[arr.length-2];
//        System.out.println(secondlargest);
//    }

    static void main() {

        int[] arr = {10, 50, 40, 20};

        Arrays.sort(arr);
        int largest = arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            if (arr[i] != largest){
                System.out.println(arr[i]);
                break;
            }
        }
    }


}
