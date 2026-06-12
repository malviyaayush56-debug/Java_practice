package Array_Practice_DSA;

import java.util.HashMap;

public class ArrayMode {
    static void findMode(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();
      for(int num : arr){
          map.put(num,map.getOrDefault(num,0)+1);
      }
  for (int i: map.keySet()){
      //i will represent key
      System.out.println(i+" -> "+map.get(i));
  }
    }

    static void main() {
        int arr[] = {1,2,2,3,3,3,4,4,5,5,5,5,5};
        findMode(arr);
    }
}