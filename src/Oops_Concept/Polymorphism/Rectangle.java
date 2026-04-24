package Oops_Concept.Polymorphism;

public class Rectangle extends Shape{
    @Override
    public void draw(){
        System.out.println("Rectangle is drawing...");
    }
    public void personal(){
        System.out.println("Personal method of circle");
    }
}
