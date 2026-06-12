package Binary_Search;

public class TwoD_Metrix {
    static void main() {
        TwoD_Metrix obj = new TwoD_Metrix();
        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };

        int target = 16;

        boolean ans = obj.searchMatrix(matrix, target);

        System.out.println(ans);
    }
//  public boolean searchMatrix(int[][] matrix, int target){
//      int rows = matrix.length;
//      int cols = matrix[0].length;
//
//      int low = 0;
//      int high = rows * cols - 1;
//      while (low <= high) {
//
//          int mid = low + (high - low) / 2;
//          // 1D index ko 2D me convert karna
//          int row = mid / cols;
//          int col = mid % cols;
//
//          int element = matrix[row][col];
//
//          if (element == target) {
//              return true;
//          }
//
//          else if (element < target) {
//              low = mid + 1;
//          }
//
//          else {
//              high = mid - 1;
//          }
//      }
//      return false;
//      }


    //Short Method
    public boolean searchMatrix(int[][] matrix, int target) {
     int row =0;
     int col = matrix[0].length-1;
     while (row<matrix.length && col >=0){
         if (matrix[row][col] == target){
             return true;
         }
         else if (matrix[row][col] > target){
             col--;
         }
         else {
             row++;
         }
     }
     return false;
    }

}
