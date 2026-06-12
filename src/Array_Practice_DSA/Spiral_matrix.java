package Array_Practice_DSA;

public class Spiral_matrix {
    static void main() {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
//       //top row
//        for (int i=0;i<4;i++){
//            System.out.println(arr[0][i]+" ");
//        }
//        //right column
//        for (int i=1;i<4;i++){
//            System.out.println(arr[i][3]+" ");
//        }
////bottom row
//        for (int i=2;i>=0;i--){
//            System.out.println(arr[3][i]+" ");
//        }
//        //left column
//        for (int i=2;i>=1;i--){
//            System.out.println(arr[i][0]+" ");
//        }
//        // inner top
//        for (int i=1;i<=2;i++){
//            System.out.println(arr[1][i]+" ");
//        }
//        //inner right
//        System.out.println(arr[2][2]+" ");
//        //inner bottom
//        System.out.println(arr[2][1]+" ");


        //Method 2
        int top = 0, bottom = 3;
        int left = 0, right = 3;

        while (true) {

            // top row →
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            if (top > bottom)
                break;

            // right column ↓
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            if (left > right)
                break;

            // bottom row ←
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;

            if (top > bottom)
                break;

            // left column ↑
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;

            if (left > right)
                break;
        }


        }
    }
