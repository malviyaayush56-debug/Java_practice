package Array_Practice_DSA;

public class Count_Zero_One {

    static void getCount(int[] arr) {
        int numZero = 0;
        int numOne = 0;

        for (int i : arr) {
            if (i == 0) {
                numZero ++;
            } else if (i == 1) {
                numOne ++;
            }
        }
        System.out.println("Total Zero = " + numZero);
        System.out.println("Total One = " + numOne);

    }

    static void main() {
        int[] arr = {1,0,0,1,0,1,1,0,0};
        getCount(arr);
    }
    }
