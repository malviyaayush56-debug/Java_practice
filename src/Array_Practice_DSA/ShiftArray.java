package Array_Practice_DSA;

public class ShiftArray {

    static void shiftByOne(int arr[]) {
        int n = arr.length;

        // last element store karo
        int last = arr[n - 1];

        // sab elements ko right shift karo
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // last element ko first position pe daal do
        arr[0] = last;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};

        shiftByOne(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
