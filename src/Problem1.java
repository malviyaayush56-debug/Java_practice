import java.util.Scanner;

public class Problem1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter no. 1: ");
        int a = sc.nextInt();
        System.out.println("Please enter no. 2: ");
        int b = sc.nextInt();

      int reminder = a % b ;

        System.out.println(reminder);

    }
}
