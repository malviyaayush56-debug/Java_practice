package Binary_Search;

public class Row_With_Maximum1s {
//    // first 1 find karne ka function
//    static int firstOne(int[] arr) {
//
//        int low = 0;
//        int high = arr.length - 1;
//        int ans = -1;
//
//        while (low <= high) {
//
//            int mid = (low + high) / 2;
//
//            // agar 1 mila
//            if (arr[mid] == 1) {
//                ans = mid;      // index store
//                high = mid - 1; // left me jao
//            }
//
//            // agar 0 mila
//            else {
//                low = mid + 1; // right me jao
//            }
//        }
//
//        return ans;
//    }
//
//    public static void main(String[] args) {
//
//        int[][] mat = {
//                {0, 0, 0, 1},
//                {0, 0, 1, 1},
//                {0, 1, 1, 1},
//                {1, 1, 1, 1}
//        };
//
//        int max = 0;
//        int row = -1;
//
//        // har row check karo
//        for (int i = 0; i < mat.length; i++) {
//
//            // first 1 ka index
//            int index = firstOne(mat[i]);
//
//            // agar 1 present hai
//            if (index != -1) {
//
//                // total 1s count
//                int count = mat[i].length - index;
//
//                // max update
//                if (count > max) {
//                    max = count;
//                    row = i;
//                }
//            }
//        }
//
//        System.out.println("Row index: " + row);
//    }

    static int firstOne(int[] arr) {

        int low = 0, high = arr.length - 1, ans = -1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == 1) {
                ans = mid;
                high = mid - 1; // left jao
            } else {
                low = mid + 1; // right jao
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {0,0,0,1},
                {0,0,1,1},
                {0,1,1,1},
                {1,1,1,1}
        };

        int row = -1, max = 0;

        for (int i = 0; i < mat.length; i++) {

            int index = firstOne(mat[i]);

            if (index != -1) {

                int count = mat[i].length - index;

                if (count > max) {
                    max = count;
                    row = i;
                }
            }
        }

        System.out.println(row);
    }
    }
