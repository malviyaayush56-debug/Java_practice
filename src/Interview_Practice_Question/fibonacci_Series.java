package Interview_Practice_Question;

public class fibonacci_Series {
//    static void main() {
//     int n = 10;
//     int a = 0;
//     int b = 1;
//        System.out.print(a+" "+b+" ");
//     for (int i=2;i<n;i++){
//       int  c = a+b;
//         System.out.print(c+" ");
//         a = b;
//         b = c;
//     }
//    }
   //recursion method

// static int fabonacci(int n){
//     if (n<=1){
//         return n;
//     }
//     return fabonacci(n-1)+fabonacci(n-2);
// }
//
//    static void main() {
//        int n = 10;
//        for (int i=0;i<n;i++){
//            System.out.print(fabonacci(i)+" ");
//        }
//    }

  //Best Optimized Method
//  static void main() {
//  int first = 0;
//  int second =1;
//  int n = 10;
//  while (n>0){
//      System.out.print(first+" ");
//      int next = first + second;
//      first = second;
//      second = next;
//      n--;
//  }
//  }
//Using Array method
  static void main() {
      int n = 10;
    int[] arr = new int[n];
      arr[0] = 0;
      arr[1] = 1;
      for (int i=2;i<n;i++){
          arr[i] = arr[i-1] + arr[i-2];
      }

      for (int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }



  }








}
