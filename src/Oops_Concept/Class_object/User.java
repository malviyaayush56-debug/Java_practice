package Oops_Concept.Class_object;

public class User {
    String name;
    String emailId;
    int rollNO;

    //Object ke state ko intialize krega
//Not return type //not void type
    //Automatically = new keyword
    //mathods = name must be equal to class

    public User(String name, String emailId, int rollNO) {
        this.name = name;
        this.emailId = emailId;
        this.rollNO = rollNO;
        System.out.println("Student Object is created ");
    }

    //Contructor Overload
    //Argument Diffrent must hai
    //Number of parameter
    //Types of parameter
    //Order of parameter

    public void name(){
        System.out.println("Name: "+name);
    }
    //Method Overload
    public void name(String lastName){
        System.out.println("Malviya");
    }
    public void emailId(){
        System.out.println("EmailId: "+emailId);
    }
    public void rollNo(){
        System.out.println("Mobaile number: "+rollNO);
    }
}
