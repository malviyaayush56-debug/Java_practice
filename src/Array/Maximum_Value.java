package Array;

import java.util.Scanner;

public class Maximum_Value {
 public   static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
   int arr[] = {4,56,47,55,34,76,9};
   int n = arr.length;
   int maxValue = arr[0];
for (int i=1;i<n;i++){
    if (arr[i]>maxValue){
       maxValue = arr[i];
    }

}
     System.out.println(maxValue);

    }
}
