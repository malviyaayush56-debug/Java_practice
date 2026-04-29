package Array_Practice_DSA;

public class Maximum_Array {
//    static int getMaxx(int[] arr ){
//
//    int max = arr[0];
//    for (int i=1;i< arr.length;i++){
//        if (arr[i] > max){
//            max = arr[i];
//        }
//    }
//    return max;
//    }

    static int getMax(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        return max;
    }




//    static void main() {
//        int[] arr = {2,4,9,4,10,6};
//        int ans = getMaxx(arr);
//        System.out.println("Maximum Element is : "+ans);
//    }
    //Math.maximum method
static void main() {
    int[] arr = {2,4,9,4,1,6};
    int ans = getMax(arr);
    System.out.println("Maximum Element is : "+ans);
}


}
