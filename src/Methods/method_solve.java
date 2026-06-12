package Methods;

public class method_solve {
    static void main() {
        int num=5;
        System.out.println(num);
        solve(num);
        System.out.println(num);
    }
    static void solve(int num){
        System.out.println(num);
        num *= 10;
        System.out.println(num);
    }
}
