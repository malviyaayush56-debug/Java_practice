package Array_Practice_DSA;

public class Multiply_Array {

  static void getMultiply(int[] arr) {

      for (int i : arr) {
          System.out.println(i * 10);
      }


  }
    static void main() {
        int[] arr = {2, 3,5,6,7,8};
        getMultiply(arr);
    }
}
