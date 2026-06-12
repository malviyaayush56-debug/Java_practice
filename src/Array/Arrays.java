package Array;

public class Arrays {
//    static void main() {
//        int marks[] = {1,2,34,56,78,9,7};
//        int target = 78;
//        for (int i=0;i<marks.length;i++){
//            if (marks[i] == target){
//                System.out.println("Index Value is "+i);
//            }
//        }
//    }
    public static int findnum(int[] arr, int target){
        int low =0;
        int high = arr.length-1;
        while (low<=high){
            int mid = low + (high - low)/2;
            // Target mil gaya
            if (arr[mid] == target) {
                return mid;
            }
         else if(arr[mid] < target){
          low = mid+1;
            }
           else {
               high = mid -1;
            }
        }

        return -1;
    }
    // Main Method
    public static void main(String[] args) {

        int arr[] = {1, 3, 5, 7, 9, 11, 15, 20};

        int target = 11;

        int result = findnum(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }



}
