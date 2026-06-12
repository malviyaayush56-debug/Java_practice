package Array_Practice_DSA;
//binary serch method
//public class PeakMountainArray {
//    static void main() {
//        int arr[] = {1, 3, 5, 7, 6, 4, 2};
//        int start = 0;
//        int end = arr.length-1;
//        while (start < end){
//            int mid = (start + end)/2;
//            // agar mid chhota hai next element se
//            if (arr[mid] < arr[mid+1]){
//                start = mid+1; // right side move karo
//            }else {
//                // left side ya peak yahi ho sakta hai
//                end = mid;
//            }
//        }
//        System.out.println("Peak index: " + start);
//        System.out.println("Peak value: " + arr[start]);
//    }
//}

//Linear method
//public class PeakMountainArray {
//    static void main() {
//        int arr[] = {1, 3, 5, 7, 6, 4, 2};
//        for (int i=1;i< arr.length-1;i++) {
//            if (arr[i] > arr[i-1] && arr[i] > arr[i+1] ){
//                System.out.println("Peak index: " + i);
//                System.out.println("Peak value: " + arr[i]);
//                break;
//            }
//        }
//    }
//}

//Method 3 agr array ka first element hi peak mountain ho tb
public class PeakMountainArray {

    public static void main(String[] args) {

        int arr[] = {5, 3, 1, 2, 4};  // unsorted array

        int n = arr.length;

        // single element case
        if (n == 1) {
            System.out.println("Peak index: 0");
            System.out.println("Peak value: " + arr[0]);
            return;
        }

        // check first element
        if (arr[0] > arr[1]) {
            System.out.println("Peak index: 0");
            System.out.println("Peak value: " + arr[0]);
            return;
        }

        // check middle elements
        for (int i = 1; i < n - 1; i++) {

            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.println("Peak index: " + i);
                System.out.println("Peak value: " + arr[i]);
                return;
            }
        }

        // check last element
        if (arr[n - 1] > arr[n - 2]) {
            System.out.println("Peak index: " + (n - 1));
            System.out.println("Peak value: " + arr[n - 1]);
        }
    }
}