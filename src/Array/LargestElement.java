package Array;

//public class LargestElement {
//    static void main() {
//        int arr[] = {1,2,34,76,89,90,3,5};
//    int n = arr.length;
//    int maxValue = arr[0];
//    for (int i=0;i< arr.length;i++){
//        if (arr[i] >= maxValue){
//            maxValue = arr[i];
//        }
//    }
//        System.out.println("Largest elment is: "+maxValue);
//
//    }
//}


import java.util.Scanner;

//Dynamic programing
public class LargestElement {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of array: ");
       int size = sc.nextInt();

      int arr[] = new int[size];
        System.out.println("Enter the array value one by one");
        for (int i=0;i<size;i++){
        arr[i] = sc.nextInt();
        }
      int largestValue = findLargestElement(arr);
        System.out.println("Largest value is "+largestValue);

    }
    public static int findLargestElement(int arr[]){
        int maxvalue = arr[0];
        for (int i=0;i< arr.length;i++){
            if (arr[i] > maxvalue){
                maxvalue = arr[i];
            }
        }
        return maxvalue;
    }
}