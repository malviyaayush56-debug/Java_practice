package Oops_Concept.Inheritance;
//Attributes
public class Vehicle {
    public String name;
    public String model;
    public int noOfTyres;
    //Defualt constuctor
  public Vehicle(){
       this.name = "";
       this.model = "";
       this.noOfTyres = -1;
   }

//Constructor
    public Vehicle(String name, String model , int noOfTyres) {
        this.name = name;
        this.model = model;
        this.noOfTyres = noOfTyres;
    }
//Behaviour

    void startEngine(){
        System.out.printf("Engine is started... %s\n",name,model);
    }
    void stopEngine(){
        System.out.printf("Engine is stopped! %s\n",name,model);
    }


}
