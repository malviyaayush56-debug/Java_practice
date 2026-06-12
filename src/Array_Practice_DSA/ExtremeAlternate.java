package Array_Practice_DSA;

public class ExtremeAlternate {
 static void printExtreme(int arr[]){
     int i =0;
     int j = arr.length-1;
     while (i<= j){
         if (i==j){
             System.out.print(arr[i]+ " ");
         }
         else {
             System.out.print(arr[i]+" ");
             System.out.print(arr[j]+" ");
         }
         i++;
         j--;
     }
 }

    static void main() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        printExtreme(arr);
    }
}
