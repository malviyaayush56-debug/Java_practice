package Array_Practice_DSA;

import java.util.Arrays;

public class Aggresive_cow {
//  public static boolean possible(int[] arr, int k, int dist){
//      int cow = 1;
//      int last = arr[0];
//
//      for (int i=1;i< arr.length;i++){
//          //place next cow
//          if (arr[i] - last >= dist){
//              cow++;
//              last = arr[i];
//          }
//      }
//      return cow >= k;
//  }
//
//    static void main() {
//        int[] arr =  {1, 2, 4, 8, 9};
//        int k = 3;
//        Arrays.sort(arr);
//        int low =1;
//        int high = arr[arr.length -1] - arr[0];
//        int ans = 0;
//        while (low<= high){
//            int mid = (low+high)/2;
//            if (possible(arr,k,mid)){
//                ans = mid;
//                low = mid +1;
//
//            }else {
//                high = mid -1;
//            }
//        }
//        System.out.println(ans);
//    }



    static boolean check(int[] a, int k, int d) {

        int cow = 1, last = a[0];

        for (int i = 1; i < a.length; i++) {

            if (a[i] - last >= d) {

                cow++;
                last = a[i];
            }
        }

        return cow >= k;
    }

    public static void main(String[] args) {

        int[] a = {1, 2, 4, 8, 9};
        int k = 3;

        Arrays.sort(a);

        int l = 1;
        int h = a[a.length - 1] - a[0];
        int ans = 0;

        while (l <= h) {

            int mid = (l + h) / 2;

            if (check(a, k, mid)) {

                ans = mid;
                l = mid + 1;

            } else {

                h = mid - 1;
            }
        }

        System.out.println("Largest Minimum Distance: " + ans);
    }
}
