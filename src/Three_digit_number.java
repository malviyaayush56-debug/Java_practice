import java.util.Scanner;

public class Three_digit_number {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("please enter a  number: ");
        int a = sc.nextInt();
        System.out.println("please enter a  number: ");
        int b = sc.nextInt();
        System.out.println("please enter a  number: ");
        int c = sc.nextInt();

if(a>b && a>c){
    System.out.println("a is gretest");
} else if (b> a && b> c) {
    System.out.println("b is gretest");
}
else{
    System.out.println("c is gretest");
}


//        if(a > 99 && a<= 999 ){
//            System.out.println("number is three digit ");
//        }
//        else{
//            System.out.println("invalid number");
//        }

//    if(a % 5 == 0 || a % 3 == 0){
//        System.out.println("number is divisible");
//    }
//    else{
//        System.out.println("not divisible");
//    }
        
        
    }
}
