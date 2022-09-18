package Patterns.factory;

public class TestFactory {
    public static void main(String[] args) {

        Computer pc = ComputerFactory.getComputer("pc", "16GB", "500 GB", "2.4GHz");
        Computer server = ComputerFactory.getComputer("Server", "32GB", "2T", "2.9GHz");

        System.out.println("Factory PC config: " + pc);
        System.out.println("Factory Server config: " + server);
    }
}
