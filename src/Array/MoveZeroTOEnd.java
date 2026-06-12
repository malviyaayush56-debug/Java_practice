package Array;
import java.util.Arrays;
public class MoveZeroTOEnd {
    public static void main(String[] args) {

        int[] arr = {1,0,2,0,4,0,5};

        moveZero(arr);

        System.out.println(Arrays.toString(arr));
    }
    public static void moveZero(int[] arr) {
        int j=0;
        for (int i=0;i< arr.length;i++){
            if (arr[i] != 0){
                int swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                j++;
            }
        }
    }
}
