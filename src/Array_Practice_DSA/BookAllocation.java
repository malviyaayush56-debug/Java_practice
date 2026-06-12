package Array_Practice_DSA;
//
//public class BookAllocation {
//    // Function to check allocation possible or not
//public static boolean isPossible(int[] arr , int students , int maxpages){
//    // Start with first student
//    int studentcount = 1;
//
//    // Current student pages
//    int currentpages = 0;
//
//    // Traverse all books
//    for (int i=0;i< arr.length;i++){
//
//        // If adding current book stays within limit
//        if (currentpages + arr[i] <= maxpages){
//
//            // Give book to same student
//            currentpages += arr[i];
//        } else {
//            // New student required
//            studentcount++;
//
//            // Current book assigned to new student
//            currentpages = arr[i];
//
//            // If students exceed limit
//            if (studentcount > students){
//                return false;
//            }
//        }
//    }
//    // Allocation possible
//    return true;
//}
//// Main allocation function
//public static int allocateBooks(int[] arr, int students) {
//    // If students more than books
//    if (students > arr.length){
//        return -1;
//    }
//    int low = 0;
//    int high = 0;
//    // Finding search space
//    for (int i=0;i<arr.length;i++){
//        // Maximum book pages
//        low = Math.max(low, arr[i]);
//
//        // Total pages
//        high += arr[i];
//    }
//    int answer = -1;
//
//    // Binary Search
//    while (low <= high) {
//
//        int mid = low + (high - low) / 2;
//
//        // Check possible or not
//        if (isPossible(arr, students, mid)) {
//
//            // Store answer
//            answer = mid;
//
//            // Try smaller answer
//            high = mid - 1;
//
//        } else {
//
//            // Need larger answer
//            low = mid + 1;
//        }
//    }
//
//    return answer;
//}
//    public static void main(String[] args) {
//
//        int[] arr = {12, 34, 67, 90};
//
//        int students = 2;
//
//        int result = allocateBooks(arr, students);
//
//        System.out.println("Minimum Maximum Pages = " + result);
//    }
//}



//short method


public class BookAllocation {

    public static int findpages(int[] arr, int students) {

        if (students > arr.length)
            return -1;

        int low = 0, high = 0;

        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }

        while (low < high) {

            int mid = (low + high) / 2;

            int student = 1;
            int pages = 0;

            for (int x : arr) {

                if (pages + x > mid) {
                    student++;
                    pages = x;
                } else {
                    pages += x;
                }
            }

            if (student <= students) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        int[] arr = {12, 34, 67, 90};

        int students = 2;

        int ans = findpages(arr, students);

        System.out.println(ans);
    }
}