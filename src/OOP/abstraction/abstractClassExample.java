package OOP.abstraction;

abstract class Animal{
    protected String name;
    public void sleep(){
        System.out.println("Sleep sound: Zzzz");
    }
    public abstract void animalSound();
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Piggie's sound: oink oink");
    }
}


public class abstractClassExample {
    public static void main(String[] args) {
        //Cannot create an object from abstract class
        //Animal animal = new Animal();


        Pig pig = new Pig();
        pig.animalSound();
        pig.sleep();
    }
}
