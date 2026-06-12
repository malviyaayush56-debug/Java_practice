package Binary_Search;

//public class Roti_Prata_problem {
//    static boolean canCook(int p, int[] ranks, int time) {
//
//        int total = 0;
//
//        for (int rank : ranks) {
//
//            int currTime = 0;
//            int prataNo = 1;
//
//            while (currTime + rank * prataNo <= time) {
//
//                currTime += rank * prataNo;
//                total++;
//                prataNo++;
//
//                if (total >= p) {
//                    return true;
//                }
//            }
//        }
//
//        return false;
//    }
//
//    static int minTime(int p, int[] ranks) {
//
//        int minRank = Integer.MAX_VALUE;
//
//        for (int rank : ranks) {
//            minRank = Math.min(minRank, rank);
//        }
//
//        int low = 0;
//        int high = minRank * (p * (p + 1) / 2);
//
//        int ans = high;
//
//        while (low <= high) {
//
//            int mid = low + (high - low) / 2;
//
//            if (canCook(p, ranks, mid)) {
//
//                ans = mid;
//                high = mid - 1;
//
//            } else {
//
//                low = mid + 1;
//            }
//        }
//
//        return ans;
//    }
//
//    public static void main(String[] args) {
//
//        int p = 10;
//        int[] ranks = {1, 2, 3, 4};
//
//        System.out.println(minTime(p, ranks));
//    }
//}



public class Roti_Prata_problem {
//    static boolean canCook(int p , int[] ranks , int time){
//        int total =0;
//        for (int rank : ranks){
//            int used = 0;
//            int i =1;
//     while (true){
//         used += rank * i;
//         if (used > time)
//             break;
//         total++;
//         i++;
//     }
//        }
//        return total>=p;
//    }
//    static int minTime(int p, int[] ranks){
//        int low =0;
//        int high = 1000;
//        int ans =0;
//        while (low<= high){
//            int mid = (low+high)/2;
//            if (canCook(p,ranks,mid)){
//                ans =mid;
//                high = mid -1;
//
//            }else {
//                low = mid +1;
//            }
//        }
//        return ans;
//    }
//
//    static void main() {
//        int p =10;
//        int[] ranks = {1,2,3,4};
//        int answer = minTime(p, ranks);
//
//        System.out.println("Minimum Time = " + answer);
//    }



    //Method 2 brute force method
    static boolean canCook(int p, int[] ranks, int time) {

        int total = 0;

        for (int rank : ranks) {

            int used = 0;
            int prataNo = 1;

            while (used + rank * prataNo <= time) {

                used += rank * prataNo;
                total++;
                prataNo++;
            }
        }

        return total >= p;
    }

    static int minTime(int p, int[] ranks) {

        int time = 0;

        while (true) {

            if (canCook(p, ranks, time)) {
                return time;
            }

            time++;
        }
    }

    public static void main(String[] args) {

        int p = 10;
        int[] ranks = {1, 2, 3, 4};

        System.out.println(minTime(p, ranks));
    }
}

