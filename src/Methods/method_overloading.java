package Methods;

public class method_overloading {
  static int add(int a, int b){
      return a+b;
  }
    static int add(int a, int b, int c){
        return a+b+c;
    }



    static void main() {
        System.out.println(add(5,8));
        System.out.println(add(4,7,9));
    }
}
