package Array_Practice_DSA;

public class Binary_Search {
    static void main() {
        int a[] = {1,2,3,5,6};
        int target = 3;
        int low = 0;
        int high = a.length-1;
        int result =-1;
        while (low <= high){
            int mid = (low + high)/2;
          if (a[mid] == target){
              result = mid;
              break;
          }
          else if(a[mid] < target){
              low = mid + 1;

          }else {
              high = mid-1;
          }
        }
        if (result != -1)
            System.out.println("Found at index: "+result);
   else
            System.out.println("not found");
    }
}
