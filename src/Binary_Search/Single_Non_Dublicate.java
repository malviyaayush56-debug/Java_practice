package Binary_Search;

public class Single_Non_Dublicate {
    public int singleNonDublicate(int[] nums){
        int low =0;
        int high = nums.length-1;
        while (low<high){
            int mid = low+(high-low)/2;
                //Mid ko even bnana hai
            if (mid %2 ==1){
                mid--;
            }
            //agar pair sahi hai
            if (nums[mid] == nums[mid+1]){
                //Single element right side me hoga
                low = mid +2;
            }else {
                //single element left side me hoga
                high = mid;
            }
        }
        return nums[low];
    }

    static void main() {
        Single_Non_Dublicate obj = new Single_Non_Dublicate();
        int[] nums = {1,1,2,3,3,4,4,8,8};

        int ans = obj.singleNonDublicate(nums);

        System.out.println("Single Element is : " + ans);
    }
}
