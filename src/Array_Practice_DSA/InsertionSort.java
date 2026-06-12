package Array_Practice_DSA;

public class InsertionSort {
    static void main() {
      int a[] = {5,6,1,2,3};
      for (int i=1;i< a.length;i++){
          int key = a[i];
          int j=i-1;
          //shift element greater than key
     while (j >= 0 && a[j] > key){
         a[j+1] = a[j];
         j--;
     }
     a[j+1] = key;
      }
      //print sorted array
        for (int i=0;i< a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}
