package Array_Practice_DSA;
import java.util.HashSet;
public class UnionArray {
    static void printUnion(int arr1[], int arr2[]) {

        HashSet<Integer> set = new HashSet<>();

        // add elements of first array
        for (int x : arr1) {
            set.add(x);
        }

        // add elements of second array (FIX HERE)
        for (int x : arr2) {
            set.add(x);
        }

        // print union
        for (int x : set) {
            System.out.print(x + " ");
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4,9};
        int arr2[] = {3, 4, 5, 6};

        printUnion(arr1, arr2);
    }
}
