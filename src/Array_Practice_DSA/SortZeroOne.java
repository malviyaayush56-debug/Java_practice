package Array_Practice_DSA;


import java.util.Arrays;

public class SortZeroOne {
//    static void sortArray(int arr[]){
//
//        // next position for 0
//        int j = 0;
//    for (int i=0;i< arr.length;i++){
//        if (arr[i] == 0){
//            // swap arr[i] with arr[j]
//            int temp = arr[i];
//            arr[i] = arr[j];
//            arr[j] = temp;
//            j++;
//        }
//    }
//    }
//
//    static void main() {
//        int arr[] = {0,1,0,1,0,1};
//        sortArray(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }

    //Method 2
    // Counting Method

//    static void sortArray(int arr[]){
//        int count = 0;
//        for (int x : arr){
//            if (x==0)
//                count++;
//        }
//        for (int i= 0 ; i< arr.length;i++){
//            if (i<count)
//                arr[i] = 0;
//            else arr[i] = 1;
//        }
//    }
//
//    static void main() {
//        int arr[] = {0,1,0,1,0,1};
//        sortArray(arr);
//
//        System.out.println(Arrays.toString(arr));
//    }



        static int[] sortArray(int[] nums) {
            int i = 0;
            int j = nums.length - 1;

            while (i < j) {

                // swap condition
                if (nums[i] == 1 && nums[j] == 0) {
                    nums[i] = 0;
                    nums[j] = 1;
                    i++;
                    j--;
                }

                // agar left already 0 hai → aage badho
                if (nums[i] == 0) {
                    i++;
                }

                // agar right already 1 hai → peeche aao
                if (nums[j] == 1) {
                    j--;
                }
            }
            return nums;
        }

        public static void main(String[] args) {
            int arr[] = {0,1,0,1,0,1};

            sortArray(arr);

            System.out.println(Arrays.toString(arr));
        }
}



















