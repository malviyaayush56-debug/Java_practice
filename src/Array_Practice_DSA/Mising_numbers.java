package Array_Practice_DSA;

import java.util.Arrays;

//
//import java.util.Arrays;
//
public class Mising_numbers {
//    static void main() {
//        int[] arr = {1,2,3,5,7,9};
//        Arrays.sort(arr);
//
//    for (int i=0;i < arr.length-1;i++){
//        if (arr[i+1] != arr[i]+1){
//            System.out.println("Mising Number: = "+(arr[i]+1));
//
//        }
//    }
//    }

//Mising element from an array dublicates

    static void main() {
        int[] arr = {1,2,2,4,5,5};
        Arrays.sort(arr);
    for (int i=0;i< arr.length-1;i++){

        // duplicate skip
        if (arr[i] == arr[i + 1]) {
            continue;
        }
        // missing check
        while (arr[i + 1] > arr[i] + 1) {
            System.out.println("Missing Element: " + (arr[i] + 1));

            arr[i]++;
        }
        }

    }
}
