package Array_Practice_DSA;

//public class Number_Of_Occurence {
//    static void main() {
//        int arr[] = {2, 4, 2, 6, 2, 8, 2, 10,4};
//        int target = 4;
//      int first = 0;
//      for(int i =0;i< arr.length;i++){
//          if (arr[i] == target){
//              first++;
//          }
//      }
//        System.out.println("Number of occurence "+first);
//    }
//}

// method 2 bubble sort method
public class Number_Of_Occurence {
    static void main() {
        int arr[] = {2, 4, 2, 6, 2, 8, 2, 10};
        int target = 2;
        int n = arr.length;
        // 🔹 Step 1: Bubble Sort
        for (int i=0;i<n-1;i++){
            for (int j = 0;j<n-i-1;j++){
                if (arr[j] > arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //step 2 count occurence
        int count =0;
        for (int i =0;i<n;i++){
            if (arr[i] == target){
                count++;
            }
        }
        System.out.println("Number of occurence "+count);
    }
}