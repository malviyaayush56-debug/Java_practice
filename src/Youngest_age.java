import java.util.Scanner;

public class Youngest_age {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a age: ");
        int r = sc.nextInt();
        System.out.println("Enter a age: ");
        int s = sc.nextInt();
        System.out.println("Enter a age: ");
        int a = sc.nextInt();


        if(r<s && r<a){
            System.out.println("Ram is youngest");
        } else if (s<r && s<a) {
            System.out.println("Shyam is youngest");
        }
        else if(a<s && a<r){
            System.out.println("Ajay is yougest");
        }
        else {
            System.out.println("age is same");
        }
    }
}
