package Oops_Concept.Inheritance;

public class Human extends Animal {
public void sleep(){
    System.out.println("Human is sleeping....");
}
String food = "Rice";
public void eat(){
    System.out.println("Wao Human is Eating....."+this.food+ " With " + super.food);
}
}
