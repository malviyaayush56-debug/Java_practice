package Interview_Practice_Question;

import java.util.Scanner;

public class Factorial_Program {
//    static void main() {
//        int n =5;
//        int fact =1;
//        for (int i=1;i<=n;i++){
//            fact = fact * i;
//        }
//        System.out.println(fact);
//    }

    //reverse loop method

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
       int n = sc.nextInt();
      int fact = 1;
      for (int i=n;i>1;i--){
          fact = fact * i;
      }
        System.out.println(fact);
    }

}
