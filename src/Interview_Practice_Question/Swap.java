package Interview_Practice_Question;

public class Swap {
    static void main() {
        int a = 4;
        int b = 5;

        a= a+b;
        b=a-b;
        a=a-b;

        System.out.println(a);
        System.out.println(b);
    }
}
