package OOP;

public class Bird {

    //Fields
    private String name;
   private String colour;
    private double age;

    //Methods

    //SETTER METHODS
    public void setName(String name){
        this.name = name;
    }
    public void setAge(double age) {
        this.age = age;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }

    //GETTER METHODS
    public String getName(){
        return name;
    }

    public java.lang.String getColour() {
        return colour;
    }

    public double getAge() {
        return age;
    }

    public void printBirdInfo(){
        System.out.println("Bird info: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Colour: " + colour);

    }

}
