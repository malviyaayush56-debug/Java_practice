package Array_Practice_DSA;



public class Painter_Partition_Problem {
   public  int mintime(int[] boards , int k){
       int low = 0;
       int high = 0;
       // low = maximum board
       // high = total sum
      for (int board : boards){
          low = Math.max(low,board);
          high += board;
      }
      //binary search
       while (low < high){
           int mid = low + (high - low) / 2;
           // Check if possible to paint within mid time
  if (isPossible(boards,k,mid)){
      high = mid; // try smaller answer
  }else {
      low = mid +1; // need bigger answer
  }
       }
       return low;
   }
    // Helper Function
    private boolean isPossible(int[] boards, int k , int maxTime){
       int painters = 1;
       int sum =0;
       for (int board : boards){
           // If adding current board exceeds maxTime
       if (sum + board > maxTime){
           painters++; // new painter
           sum = board;
           // painters exceeded
           if (painters > k) {
               return false;
           }
       }else {
           sum += board;
       }
       }
       return true;
    }

    static void main() {
        Painter_Partition_Problem obj = new Painter_Partition_Problem();
     int[] boards = {10,20,30,40};
     int k = 2;
     int ans = obj.mintime(boards,k);
        System.out.println("Minimum Time: " + ans);
    }
}
