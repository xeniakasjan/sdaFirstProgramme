package OOP;

public class Animal {

    //Field
    private String type;
    private String size;
    private int avgLifeSpan;
    private double weight;


    //Methods (the name of the method should be the same as the name of the class
    public Animal(String type, String size, int avgLifeSpan, double weight) {
        this.type = type;
        this.size = size;
        this.avgLifeSpan = avgLifeSpan;
        this.weight = weight;

    }

    public Animal(String type, String size){
        this.type = type;
        this.size = size;
    }

    public Animal(){
    }

 public void printAnimalInfo(){
     System.out.println("Type: " + type);
     System.out.println("Size: " + size);
     System.out.println("Average lifespan: " + avgLifeSpan);
     System.out.println("Weight: " + weight);

 }

}
