package Array_Practice_DSA;

public class Rotate_Image {
    static void main() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = arr.length;
        //print rotated matrix
        for (int j=0;j<n;j++){
            for (int i=n-1;i>=0;i--){
                System.out.println(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
