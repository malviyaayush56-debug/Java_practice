package Array_Practice_DSA;

//public class findUniqueElement {
//    static int Element(int arr[]){
//       for (int i=0;i< arr.length;i++){
//           int count = 0;
//        for (int j=0;j< arr.length;j++){
//            if (arr[i] == arr[j])
//                count++;
//        }
//        if (count == 1){
//            System.out.println(arr[i]);
//        }
//       }
//       return -1;
//    }
//
//
//    static void main() {
//        int nums[] = {2,3,5,4,5,3,4,1,2};
//        int result = Element(nums);
//        // direct call (static method)
//
//        System.out.println("Unique Element: " + result);
//    }
//
//}                 // method 2

public class findUniqueElement {
public int Element(int[] nums) {
    int xor = 0;

    for (int x : nums) {
        xor ^= x;
    }

    return xor;
}
    static void main () {
        int nums[] = {2, 3, 5, 4, 5, 3, 4, 1, 2};

      findUniqueElement obj = new findUniqueElement();
      int result = obj.Element(nums);

        System.out.println("Unique Element: " + result);


    }

}
























