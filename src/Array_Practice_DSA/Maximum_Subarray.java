package Array_Practice_DSA;

public class Maximum_Subarray {
    public int maxSubArray(int[] nums){
        int sum =0;
        int maxi = Integer.MIN_VALUE;


        for (int i=0;i< nums.length;i++){
            //step 1 sum crete
        sum = sum + nums[i];
        //Step 2 maxi update krna
            maxi = Math.max(maxi,sum);
        //step 3 sum check krte hai for negative value
        if (sum<0){
            sum = 0;
        }
    }
       return maxi;
}

    static void main() {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        // Object create
Maximum_Subarray obj = new Maximum_Subarray();
        // Method call
        int result = obj.maxSubArray(nums);
        // Output print
        System.out.println("Maximum Subarray Sum = " + result);
    }

}




