package Array_Practice_DSA;

public class Rotated_Sorted_Arrays {
    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            //Target mil gaya
            if (arr[mid] == target) {
                return mid;
            }
//Left half sorted
            if (arr[start] <= arr[mid]) {
                //target left me hai
                if (target >= arr[start] && target < arr[mid]) {
                    end = mid - 1;
                }
                //Target right me hai
                else {
                    start = mid + 1;
                }
            }
            //Right Half sorted
            else {
                //Target right me hai
                if (target > arr[mid] && target <= arr[end]) {
                    start = mid + 1;
                }
                //Target left me hai
                else {
                    end = mid - 1;
                }


            }
        }
        return -1;
    }

    static void main() {
        int[] arr = {4,5,6,7,0,1,2};

        System.out.println(search(arr, 0));
    }
}