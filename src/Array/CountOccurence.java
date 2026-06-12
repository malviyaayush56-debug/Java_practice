package Array;

public class CountOccurence {
//    static void main() {
//
//        int[] arr = {1, 2, 3, 2, 4, 2, 5};
//int ans = count(arr,2);
//        System.out.println("Occurence number is: "+ans);
//    }
//
//   public static int count(int[] arr, int target){
//        int count =0;
//        for (int i=0;i<arr.length;i++){
//            if (arr[i] == target){
//                count++;
//            }
//        }
//        return count;
//   }
static void main() {
    int[] arr = {1,2,2,3,2,4};

    int target = 2;
    int count=0;
    for (int num : arr){
        if (num == target){
            count++;

        }
    }
    System.out.println(count);
}
}
