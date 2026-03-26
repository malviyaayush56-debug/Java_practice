import java.util.Scanner;
public class CalculatePercentage {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a Marks:");
        double num = sc.nextDouble();
        System.out.println("Please enter a Marks:");
        double num1 = sc.nextDouble();
        System.out.println("Please enter a Marks:");
        double num2 = sc.nextDouble();
        System.out.println("Please enter a Marks:");
        double num3 = sc.nextDouble();
        System.out.println("Please enter a Marks:");
        double num4 = sc.nextDouble();

        double total = (num+num1+num2+num3+num4)/5;
        System.out.println(total);

    }
}
