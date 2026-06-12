package Array_Practice_DSA;

import java.util.HashMap;

public class FrequencyExtreme {
    static  void findFreq(int arr[]){
        HashMap<Integer,Integer> map = new HashMap<>();
        // Step 1: count frequency
for (int x : arr){
    map.put(x,map.getOrDefault(x,0)+1);
}
        int maxFreq = Integer.MIN_VALUE;
        int minFreq = Integer.MAX_VALUE;
        int maxElement = -1;
        int minElement = -1;
        // Step 2: find max & min frequency
        for (int key : map.keySet()) {
            int freq = map.get(key);

            // max frequency
            if (freq > maxFreq) {
                maxFreq = freq;
                maxElement = key;
            }

            // min frequency
            if (freq < minFreq) {
                minFreq = freq;
                minElement = key;
            }
        }
        System.out.println("Highest Frequency: " + maxElement + " -> " + maxFreq);
        System.out.println("Lowest Frequency: " + minElement + " -> " + minFreq);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3, 3, 4};

        findFreq(arr);
    }
  }
