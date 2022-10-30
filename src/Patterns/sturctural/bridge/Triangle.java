package Patterns.sturctural.bridge;

public class Triangle extends Shape {

    public Triangle(Colour c){
        super(c);
    }

    public void applyColour(){
        System.out.println("Triangle filled with colour: ");
        colour.applyColour();
    }
}
