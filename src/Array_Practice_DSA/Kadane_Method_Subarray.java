package Array_Practice_DSA;

public class Kadane_Method_Subarray {
    static void main() {
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
        Kadane_Method_Subarray obj = new Kadane_Method_Subarray();
        int ans = obj.maxSubArray(arr);
        System.out.println(ans);

    }
    public int maxSubArray(int[] arr){
    int maxsum = arr[0];
    int currentsum = arr[0];
    for (int i=1;i<arr.length;i++){
        currentsum = Math.max(arr[i],currentsum+arr[i]);
     maxsum = Math.max(maxsum,currentsum);
    }
    return maxsum;
    }
}
