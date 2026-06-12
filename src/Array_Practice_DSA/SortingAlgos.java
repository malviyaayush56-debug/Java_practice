package Array_Practice_DSA;

public class SortingAlgos {
    static void main() {
        int arr[] = {5,6,1,2,3};
        for (int i =0;i< arr.length;i++){
            for (int j=0;j< arr.length-1;j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
