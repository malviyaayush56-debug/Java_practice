package Interview_Practice_Question;

import java.util.Scanner;

public class Prime_Number {
//    static void main() {
//  int n =19;
//  int count = 0;
//  for (int i=1;i<=n;i++){
//      if (n%i==0){
//          count++;
//      }
//  }
//  if (count == 2){
//      System.out.println("Prime Number");
//  }
//  else{
//      System.out.println("Not a Prime Number");
//  }
//    }
//method 2
//    static void main() {
//        int n=19;
//      boolean isprime = true;
//      if (n <= 1){
//          isprime = false;
//      }
//      for (int i=2;i<n;i++){
//          if (n % i == 0){
//              isprime = false;
//              break;
//          }
//      }
//      if (isprime){
//          System.out.println("Prime");
//    }
//      else {
//          System.out.println("Not Prime");
//      }
//    }

  //Method 3
//  static void main() {
//      int n = 18;
//      boolean isPrime = true;
//      if (n <= 1) {
//          isPrime = false;
//      }
//      for (int i = 2; i <= Math.sqrt(n); i++) {
//          if (n % i == 0) {
//              isPrime = false;
//              break;
//          }
//      }
//      if (isPrime) {
//          System.out.println("prime");
//      } else {
//          System.out.println("not prime");
//      }
//  }

   static boolean isprime(int n){
       if (n<=1){
           return false;
       }
       for (int i=2;i<=Math.sqrt(n);i++){
           if (n%i==0){
               return false;
           }
       }
       return true;
   }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = sc.nextInt();

  if (isprime(n)){
      System.out.println("Prime number");
  }else{
      System.out.println("Not a Prime number");
  }
    }


}
