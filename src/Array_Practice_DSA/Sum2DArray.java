package Array_Practice_DSA;

public class Sum2DArray {
    static void main() {
        int nums[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = 0; j < nums[i].length; j++){
                sum = sum + nums[i][j];
            }
            System.out.println("Sum Of Row "+i+"= "+sum);
        }
    }
}
