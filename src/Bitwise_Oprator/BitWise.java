package Bitwise_Oprator;

<<<<<<< HEAD
public class BitWise {
=======
import java.util.Scanner;

public class BitWise {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
       int n = sc.nextInt();
int count = 0;
while (n != 0){
    if ((n & 1) != 0){
        count++;
    }
    n=n>>1;
}
        System.out.println("set bit count : "+count);

//        if ((n & 1) == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//

        //        int a = 5;
//        int b = 6;
//        System.out.println(a & b);
//        System.out.println(a | b);
//        System.out.println(a ^ b);
//        System.out.println(~a);
//    int n = 1;
//    for(int i =1; i<=32; i++){
//        n = n << 1;
//        System.out.println(n);
//        System.out.println();
//    }
//        int n = 100;
//        for(int i =1; i<=10; i++){
//            n = n >> 1;
//            System.out.println(n);
//            System.out.println();
//        }

    }
>>>>>>> 620d996 (https://github.com/malviyaayush56-debug/Java_practice.git)
}
