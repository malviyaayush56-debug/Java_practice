package Array_Practice_DSA;

public class Swap_Alternate {
  static void swapAlternate(int[] arr){
      for (int i=0;i< arr.length -1;i+=2){
          //Swap arr[i] and arr[i+1]
  int temp = arr[i];
  arr[i] = arr[i+1];
  arr[i+1] = temp;

      }
      //print array
      for (int i : arr) {
          System.out.print(i + " ");
      }
  }
    static void main() {

        int[] arr = {1, 2, 3, 4, 5, 6};

        swapAlternate(arr);
    }
}
