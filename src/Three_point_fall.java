import java.util.Scanner;

public class Three_point_fall {
    static void main() {
        Scanner sc = new Scanner(System.in);

        double x1 = 1,x2=1,x3=3,y1=2,y2=2,y3=3;
        double m1  = (y2-y1)/(x2-x1);
        double m2 = (y3-y2)/(x3-x2);

       if(m1==m2){
           System.out.println("the three points lie on a single line");
       }
        else {
           System.out.println("the three point dont lie ona single line");
       }
    }
}
