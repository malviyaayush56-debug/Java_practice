package Array_Practice_DSA;

public class Positive_Negative_Number {
    static void getSum(int[] arr){
        int positiveSum = 0;
        int negativeSum = 0;
        for (int i: arr){
          if (i>0){
              positiveSum +=i;
          }
          else if (i<0){
              negativeSum += i;
          }
        }
        System.out.println("Sum of +ve elements = "+positiveSum);
        System.out.println("Sum of -ve elements = "+negativeSum);

    }

    static void main() {
        int[] arr =  {10, -5, 20, -8, 7, -2};
        getSum(arr);
    }
}
