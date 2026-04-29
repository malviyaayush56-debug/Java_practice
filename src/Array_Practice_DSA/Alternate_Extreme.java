package Array_Practice_DSA;

public class Alternate_Extreme {
    static void printAlternateExtreme(int[] arr){
  int start = 0;
  int end = arr.length-1;

  while (start <= end){
      if (start == end){
          System.out.println(arr[start]+" ");
      }
      else {
          System.out.print(arr[start] + " ");
          System.out.print(arr[end] + " ");
      }
      start++;
      end--;
  }
    }

    static void main() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        printAlternateExtreme(arr);
    }
}
