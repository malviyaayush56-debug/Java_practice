package SOLID_RULES_BACKEND;
//Child class parent ki jagah properly kaam kare.
//Liskov Substitution Principle (LSP)

public class Liskov_Substitution_Principle {

    // Parent class
    static class Bird {

    }

    // Fly karne wale birds ke liye interface
    interface Flyable {
        void fly();
    }

    // Sparrow fly karta hai
    static class Sparrow extends Bird implements Flyable {

        public void fly() {
            System.out.println("Sparrow can fly");
        }
    }

    // Penguin fly nahi karta
    static class Penguin extends Bird {

        public void swim() {
            System.out.println("Penguin can swim");
        }
    }

    public static void main(String[] args) {

        Sparrow s = new Sparrow();
        s.fly();

        Penguin p = new Penguin();
        p.swim();
    }
}