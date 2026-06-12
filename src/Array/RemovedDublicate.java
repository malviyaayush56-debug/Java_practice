package Array;

public class RemovedDublicate {
//    public static void main(String[] args) {
//
//        int[] arr = {1,1,2,2,3};
//
//        int n = removeDuplicates(arr);
//
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//    public static int removeDuplicates(int[] arr) {
//      int j=0;
//      for (int i=1;i< arr.length;i++){
//          if (arr[i] != arr[j]){
//              j++;
//              arr[j] = arr[i];
//          }
//      }
//
//        return j+1;
//    }

    static void main() {
        int[] arr = {1, 1, 2, 2, 3};

        int j = 0;
        for (int i=1;i< arr.length;i++){
            if (arr[i] != arr[j]){
                j++;
                arr[j] = arr[i];
            }
        }
        // print unique elements
        for (int i = 0; i <= j; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
