package Oops_Concept.Inheritance;

public class MotorCycle extends Vehicle{
public String handlerBarStyle;
public String suspentionType;

    public MotorCycle(String name, String model, int noOfTyres, String handlerBarStyle, String suspentionType) {
        super(name, model, noOfTyres);
        this.handlerBarStyle = handlerBarStyle;
        this.suspentionType = suspentionType;
    }
    public void wheelie(){
        System.out.println("MotorCycle is doing Whelieee!"+name);
    }
}
