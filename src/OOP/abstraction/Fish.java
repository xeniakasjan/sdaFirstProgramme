package OOP.abstraction;

public class Fish extends Pet{
    private int waterChangeInWeek;

    public void printPetInfo(){
        System.out.println("Color: " + color);
        System.out.println("It eats: "+ eat);
        System.out.println("Place: " + place);
        System.out.println("Age: " + age);
    }
    public Fish(String color, String eat, String place, int age, int waterChangeInWeek){
        super(color,eat,place,age); /*The super keyword in Java is a reference variable that is used to refer parent class objects.*/
        this.waterChangeInWeek = waterChangeInWeek;
    }
}
