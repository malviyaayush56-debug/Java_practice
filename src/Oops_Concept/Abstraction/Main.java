package Oops_Concept.Abstraction;

abstract class Bird {
    abstract void fly();
    abstract void eat();
}

// Sparrow class
class Sparrow extends Bird {

    @Override
    void fly() {
        System.out.println("Sparrow flying...");
    }

    @Override
    void eat() {
        System.out.println("Sparrow eating...");
    }
}

// Crow class
class Crow extends Bird {

    @Override
    void fly() {
        System.out.println("Crow flying...");
    }

    @Override
    void eat() {
        System.out.println("Crow eating...");
    }
}

public class Main {
public static void doBird(Bird b){
b.eat();
b.fly();
}
    public static void main(String[] args) {

        Bird b = new Sparrow();
        b.eat();
        b.fly();

        b = new Crow();
        b.fly();
        b.eat();
    }
}