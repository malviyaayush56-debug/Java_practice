package Interview_Practice_Question;
//Method 1: Brute Force
//public class SquareRoot {
//    public static int mysqrt(int x){
//        int ans = 0;
//        for (double i=1;i*i<= x;i++){
//            ans = (int)i;
//        }
//        return ans;
//    }
//
//    static void main() {
//        double x = 8;
//        double  result = mysqrt((int) x);
//        System.out.println(result);
//    }
//}


//Method 2 Binary Search
//public class SquareRoot {
//    public static int mySqrt(int x){
//        // Edge cases
//        if (x ==0 || x==1) {
//            return x;
//        }
//            int start = 1;
//            int end = x;
//            int ans =0;
//            while (start <= end){
//                // Find middle
//                int mid = start+ (end - start)/2;
//
//                // Use long to avoid overflow
//                long square = (long)mid*mid;
//
//                // Perfect square found
//                if (square == x){
//                    return mid;
//                }
//                // Move right
//                if (square < x){
//                    ans = mid;
//                    start = mid+1;
//                }
//                // Move left
//                else {
//                    end = mid -1;
//                }
//            }
//
//
//        return ans;
//    }
//
//    static void main() {
//        int x =8;
////     double result = Math.sqrt(x);   // agar value decimal me chaiye
////        System.out.println("Square root is "+ result);
//        int result = mySqrt(x);
//        System.out.println("Square root of "+x+" is "+result);
//
//    }
//}


//Method 3 Newtons Method Advance Level Fast result

public class SquareRoot {
    public static int mySqrt(int x){
        // Edge case
        if (x == 0)
           return 0;

        // Initial guess
       long root = x;
        // Repeat until root becomes correct
       while (root * root > x){
           root = (root + x / root)/2;
       }
       return (int) root;
    }

    static void main() {
        int x = 8;
        int result = mySqrt(x);
        System.out.println("Square root is "+result);
    }
}