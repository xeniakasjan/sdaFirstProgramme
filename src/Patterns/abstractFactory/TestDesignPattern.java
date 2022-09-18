package Patterns.abstractFactory;

public class TestDesignPattern {
    public static void main(String[] args) {

    }

    private static void testAbstractFactory(){

        Computer pc = ComputerFactory.getComputer(new PCFactory("16GB", "1T", "3.1GHz"));
        Computer server = ComputerFactory.getComputer(new ServerFactory("16GB", "5T", "6.15GHz"));
        System.out.println("Abstract Factory PC config: " + pc);
        System.out.println("Abstract Factory Server config: " + server);

    }
}
