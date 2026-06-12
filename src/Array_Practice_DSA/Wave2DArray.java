package Array_Practice_DSA;
//
//public class Wave2DArray {
//    static void main() {
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        int row = arr.length;
//        int col = arr[0].length;
//  for (int j=0;j<col;j++){
//      //Even column
//      if (j%2 == 0){
//          for (int i =0;i<row;i++){
//              System.out.print(arr[i][j] + " ");
//          }
//      }
//      // Odd column
//      else {
//          for (int i=row-1;i>=0;i++){
//              System.out.println(arr[i][j] + " ");
//          }
//      }
//  }
//    }
//}
public class Wave2DArray {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int row = arr.length;
        int col = arr[0].length;

        for (int j = 0; j < col; j++) {

            // Even column
            if (j % 2 == 0) {

                for (int i = 0; i < row; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }

            // Odd column
            else {

                for (int i = row - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}