package Array_Practice_DSA;

public class Without_Using_Thirdvariable {
    static void main() {
  int a = 10;
  int b = 20;

        System.out.println("Before swap: ");
        System.out.println("a = "+a+" b = "+b);

//        // Swapping without third variable
//a = a+b;
//b = a -b;
//a = a - b;
        // Swapping using XOR
a = a^ b ;
b = a ^ b;
a = a ^ b;




        System.out.println("After Swap: ");
        System.out.println("a = " + a + ", b = " + b);
    }
}
