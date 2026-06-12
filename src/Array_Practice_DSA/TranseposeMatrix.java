package Array_Practice_DSA;

public class TranseposeMatrix {
//    static void main() {
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6}
//        };
//        int row = arr.length;
//        int col = arr[0].length;
//         //Transpose metrix
//  int[][] transpose = new int[col][row];
//  for (int i=0;i<row;i++){
//      for (int j=0;j<col;j++){
//          transpose[j][i] = arr[i][j];
//      }
//  }
//
//        // Print transpose matrix
//        for(int i =0;i<col;i++){
//            for (int j=0;j<row;j++){
//                System.out.println(transpose[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }


    //short method
    static void main() {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };
        //transpose print
        for (int j =0;j< arr[0].length;j++){
            for (int i=0;i< arr.length;i++){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}