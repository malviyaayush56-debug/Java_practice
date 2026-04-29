package Array_Practice_DSA;

public class Array_Intersection {
    static void printIntersection(int[] arr1, int[] arr2){
        for (int i = 0;i<arr1.length;i++){
  for(int j=0;j<arr2.length;j++){
      if (arr1[i] == arr2[j]){
          System.out.println(arr1[i] + " ");
          break; // duplicate avoid karne ke liye
      }
  }
        }
    }

    static void main() {
        int[] arr1 = {1, 2, 3, 4, 5,9,8};
        int[] arr2 = {3, 4, 5, 6, 7,9};
printIntersection(arr1,arr2);
    }
}
