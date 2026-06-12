package Array;

public class twod_minimum_maximum {
    static void main() {
        int arr[][] = {

                {12, 2, 3}, {21, 20, 19,1}
        };
//        int min = arr[0][0];
        int max = arr[0][0];
//      for (int i=0;i< arr.length;i++){
//          for (int j=0; j< arr[i].length;j++){
//              if (arr[i][j]<min){
//                  min = arr[i][j];
//              }
//          }
        for (int i=0;i< arr.length;i++){
            for (int j=0; j< arr[i].length;j++){
                if (arr[i][j]>max){
                    max = arr[i][j];
                }
            }
      }
        System.out.println(max);
    }
}
