
package Array_Practice_DSA;

import java.util.Arrays;
import java.util.HashSet;

public class SortRemover {

//    public int removeduplicate(int[] arr){
//        if (arr.length == 0)
//            return 0;
//
//        int i = 0;
//
//        for (int j = 1; j < arr.length; j++){
//            if (arr[j] != arr[i]){
//                i++;
//                arr[i] = arr[j];
//            }
//        }
//        return i + 1;
//    }
//
//    public static void main(String[] args) {
//
//        SortRemover obj = new SortRemover();
//
//        int arr[] = {1,2,3,4,1,6,1,3,6,2};
//
//        Arrays.sort(arr); // 🔥 important fix
//
//        int result = obj.removeduplicate(arr);
//
//        System.out.println("New Length " + result);
//
//        for (int i = 0; i < result; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }
    //Method 2

//    public int removedublicate(int[] arr) {
//        HashSet<Integer> set = new HashSet<>();
//        int i = 0;
//        for (int num : arr) {
//            if (!set.contains(num)) {
//                set.add(num);
//                arr[i++] = num;
//            }
//        }
//        return i;
//    }
//
//    public static void main(String[] args) {
//
//        SortRemover obj = new SortRemover();
//
//        int arr[] = {1, 2, 3, 4, 1, 6, 1, 3, 6, 2};
//
//        Arrays.sort(arr); // 🔥 important fix
//
//        int result = obj.removedublicate(arr);
//
//        System.out.println("New Length " + result);
//
//        for (int i = 0; i < result; i++){
//            System.out.print(arr[i] + " ");
//        }
//    }

   public int removedublicate(int[] arr){
       int[] unique =Arrays.stream(arr).distinct().toArray();
       for (int i=0;i< unique.length;i++){
           arr[i] = unique[i];
       }
       return unique.length;
   }
    public static void main(String[] args) {

        SortRemover obj = new SortRemover();

        int arr[] = {1, 2, 3, 4, 1, 6, 1, 3, 6, 2};

        Arrays.sort(arr); // 🔥 important fix

        int result = obj.removedublicate(arr);

        System.out.println("New Length " + result);

        for (int i = 0; i < result; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}