package Methods;

import java.awt.print.Printable;

public class method {
  static void printTable(){
        for (int i=1;i<=10;i++){
            int sum = 2*i;
            System.out.println("-> "+sum);
        }
    }
   static void printSum(int x,int y){{
        System.out.println("sum: "+(x+y));
  }
    }
    static void multiply(int x , int y){
      int mul = (x*y);
        System.out.println("multipication: "+mul);
    }

    static void main() {
      printSum(4,6);
      multiply(7,3);
        System.out.println("hiii");
      printTable();
        System.out.println("by by");
    }
}
