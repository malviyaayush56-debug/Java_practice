package Oops_Concept.Encapsulation;

public class Teacher {
    //atributes
    public int id;
    public String name;
    public int age;
    public int nos;
    private String gf;

    public String getgf(){
        return this.gf;
    }


    //Defualt constructor
    public Teacher(int id, String name, int age, int nos, String gf) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }
    //Methode

    public void study(){
        System.out.println(name+"Studying...");
    }
    public void driving(){
        System.out.println(name+"Driving...");
    }
  public void Teaching(){
      System.out.println(name+"teaching...");
  }
  private void gfchatting(){
      System.out.println("My girlfrind is chatting with me");
  }

}


