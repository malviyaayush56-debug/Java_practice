package Array;

public class twod_array_sum {
    static void main() {
        int arr[][] = {
                {1,2,3},{1,2,3}
        };
        int sum =0;
        int ans =1;
  for (int i=0;i<arr.length;i++){
      for (int j=0;j<arr[i].length;j++){
          int value = arr[i][j];
          sum = sum + value;
          ans = ans * value;
      }
  }
        System.out.println(sum);
        System.out.println(ans);
    }
}
