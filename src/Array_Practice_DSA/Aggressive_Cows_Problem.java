package Array_Practice_DSA;

import java.util.Arrays;

public class Aggressive_Cows_Problem {
    // Main Function
  public int aggressiveCows(int[] stalls, int k){
      //sort stalls positions
      Arrays.sort(stalls);
int low =1;

      // Maximum possible distance
int high = stalls[stalls.length -1] - stalls[0];
int ans =0;
//Binary search
      while (low<=high){
          int mid = low + (high - low)/2;
          if (isPossible(stalls,k,mid)){
              ans = mid;
              //Try bigger distance
              low = mid + 1;
          }else {
              //reduce distance
              high = mid -1;
          }
      }
      return ans;
  }
    // Helper Function
    private boolean isPossible(int[] stalls, int k, int minDistance){

        // First cow placed at first stall
        int cows = 1;
        int lastPosition = stalls[0];
        // Traverse remaining stalls
     for (int i=1;i<stalls.length;i++){
         //check distance
         if (stalls[i] - lastPosition >= minDistance){
             cows++;
             lastPosition = stalls[i];
             // All cows placed
             if (cows == k) {
                 return true;
             }
         }
     }
     return false;
    }
    // Main Method
    static void main() {
        Aggressive_Cows_Problem obj = new Aggressive_Cows_Problem();
        int[] stalls =  {1, 2, 4, 8, 9};
        int k = 3;
        int ans = obj.aggressiveCows(stalls,k);
        System.out.println("Largest Minimum Distance: " + ans);
    }
}
