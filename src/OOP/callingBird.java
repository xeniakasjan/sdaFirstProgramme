package OOP;

public class callingBird {
    public static void main(String[] args) {

Bird bird1 = new Bird();

        //Set field value
//        bird1.name = "Parrot";
//        bird1.colour = "Red";
//        bird1.age = 10;
//
//        //Get field values
//        System.out.println(bird1.name);
//        System.out.println(bird1.colour);
//        System.out.println(bird1.age);

        //Setting field values using Setter methods
        bird1.setName("Owl");
        bird1.setAge(15.6);
        bird1.setColour("Gray");

        //Getting values using Getter methods
        System.out.println(bird1.getName());
        System.out.println(bird1.getColour());
        System.out.println(bird1.getAge());


        //Printing info about bird calling a method
        bird1.printBirdInfo();
    }
}
