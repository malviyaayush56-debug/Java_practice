package Oops_Concept.Inheritance;

public class Car extends Vehicle{
//Properties

    public int noOfDoors;
    public String transmissionType;
//All constructor parent and child
    public Car(String name, String model, int noOfTyres, int noOfDoors, String transmissionType) {
        super(name, model, noOfTyres);
        this.noOfDoors = noOfDoors;
        this.transmissionType = transmissionType;
    }

   public void startAc(){
       System.out.println("Ac Started of "+name);
   }
}
