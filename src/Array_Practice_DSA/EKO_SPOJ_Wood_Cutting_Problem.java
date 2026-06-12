package Array_Practice_DSA;
//
//public class EKO_SPOJ_Wood_Cutting_Problem {
//    static void main() {
//      int[] trees = {20,15,10,17};
//      int m = 7;
//      int result = maxHeight(trees,m);
//        System.out.println("Maximum Saw Height = " + result);
//    }
//    public static int maxHeight(int[] trees,int m){
//        int low =0;
//    int high = 0;
//
//        // sabse bada tree find kar rahe
//     for (int h : trees){
//         high = Math.max(high,h);
//     }
//     int ans = 0;
//     //Binary Search
//        while (low <= high){
//            //middle height
//            int mid = low + (high - low)/2;
//  long wood =0;
//  //Total wood calculate
//            for(int h : trees){
//                // sirf bade trees cut honge
//                if (h>mid){
//                    wood += (h-mid);
//                }
//            }
//            // enough wood mil gaya
//            if (wood>=m){
//                ans = mid;
//                // aur bada answer try karo
//                low = mid +1;
//            } else {
//                //height kam karo
//                high = mid -1;
//            }
//        }
//        return ans;
//    }
//}


//Method 2


public class EKO_SPOJ_Wood_Cutting_Problem {
    public static int solve(int[] trees, int m) {

        int start = 0;
        int end = 0;

        // max height find
        for (int x : trees) {
            if (x > end) {
                end = x;
            }
        }

        int answer = 0;

        while (start <= end) {

            int mid = (start + end) / 2;

            int wood = 0;

            // wood count
            for (int x : trees) {

                if (x > mid) {
                    wood = wood + (x - mid);
                }
            }

            // enough wood
            if (wood >= m) {

                answer = mid;

                // bigger height try
                start = mid + 1;
            }

            else {

                // height decrease
                end = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] trees = {20, 15, 10, 17};

        int m = 7;

        System.out.println(solve(trees, m));
    }
}