package Oops_Concept.Polymorphism;

public class Main  {
    static void main() {
//        Calculator c = new Calculator();
//        System.out.println(c.add(4,5,9));
//        System.out.println(c.add(4,5,8,9));
//        System.out.println(c.add(8,7));


//        Circle c = new Circle();
//        c.draw();
//        doDrawing(c);
//
//        Rectangle r = new Rectangle();
//        r.draw();
//        Shape s = new Shape();
//        doDrawing(s);
       //DownCasting
       Circle c = new Circle();
       Rectangle r = new Rectangle();
       doDrawing(c);
r.personal();

    }

    public static void doDrawing(Shape s){
        s.draw();
        Circle c = (Circle)s;

    }
}
