package Array_Practice_DSA;

public class Unsorted_Array {
    static  void getFirstUnsorted(int[] arr){
      for (int i=0;i< arr.length - 1;i++){
          if (arr[i] > arr[i+1]){
              System.out.println("First Unsorted Number: "+arr[i+1]);
              return;
          }
      }
        System.out.println("Array is Already Sorted ");

    }

    static void main() {
        int[] arr = {10,20,30,15,40,50};
        getFirstUnsorted(arr);
    }
}
