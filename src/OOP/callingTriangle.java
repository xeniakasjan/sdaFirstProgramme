package OOP;
import java.util.Scanner;

public class callingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side 1: ");
        double side1 = scanner.nextDouble();

        System.out.println("Enter side 2: ");
        double side2 = scanner.nextDouble();

        System.out.println("Enter side 3: ");
        double side3 = scanner.nextDouble();


        //Creating triangle object
        Triangle triangle1 = new Triangle();
        triangle1.setSize1(side1);
        triangle1.setSize2(side2);
        triangle1.setSize3(side3);

        System.out.println(triangle1.triangleArea());
    }
}
