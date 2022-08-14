package OOP;

public class callingAnimal {
    public static void main(String[] args) {

        //Creating Animal1
        Animal animal1 = new Animal("Elephant","Big",50,1102.3);
        animal1.printAnimalInfo();
        System.out.println("-----");

        //Create Animal2
        Animal animal2 = new Animal("Cat","small");
        Animal animal3 = new Animal();
    }
}
