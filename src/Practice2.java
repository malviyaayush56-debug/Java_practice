import java.util.Scanner;

public class Practice2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a cost price: ");
        double a = sc.nextDouble();

        System.out.println("please enter a selling price: ");
        double b = sc.nextDouble();

    if(a > b) {
        System.out.println("the seller has made loss");
    } else if (a<b) {
        System.out.println("the saller has gain profite");
    }
    else if (a == b){
        System.out.println("naither saller has gain profit nor loss: ");
    }
    }
}
