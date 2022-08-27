package OOP.inheritance;

class Vehicle{
    protected String brand;

    public void honk(){
        System.out.println("Tutu!");
        System.out.println("My brand is: " + brand);
        System.out.println();
    }
}

class Bike extends Vehicle{
    public void honk(){
        System.out.println("Bip bip!");
        System.out.println("My brand is: " + brand);
    }
}




public class vehicleExamples {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.brand = "Tesla";
        vehicle.honk();

        Bike bike = new Bike();
        bike.brand = "Yamaha";
        bike.honk();
    }
}
