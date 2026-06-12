package Array;

public class SumArrayElement {

//    public static void main(String[] args) {
//
//        int[] arr = {10, 20, 30, 40};
//
//        int ans = sum(arr);
//
//        System.out.println("Sum = " + ans);
//    }
//    public static int sum(int[] arr){
//        int total =0;
//        for (int i=0;i<arr.length;i++){
//            total += arr[i]; //total = total + arr[i];
//        }
//        return total;
//    }


    static void main() {
        int[]  arr = {10,20,30,40,50};
        int sum =0;
        for (int num : arr){
            sum += num;
        }
        System.out.println("total sum is: "+sum);
    }
}
