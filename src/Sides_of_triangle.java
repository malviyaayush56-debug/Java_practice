import java.util.Scanner;

public class Sides_of_triangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        System.out.println("Enter a number: ");
        int b = sc.nextInt();
        System.out.println("Enter a number: ");
        int c = sc.nextInt();


    if((a+b>c) && (b+c>a) && (a+c>b) ){
        System.out.println("they can be the sides of a tringle: ");
    }
    else {
        System.out.println("they can not be a triangle");
    }
    }
}
