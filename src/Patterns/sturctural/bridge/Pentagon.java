package Patterns.sturctural.bridge;

public class Pentagon extends Shape {
    public Pentagon(Colour c){
        super(c);
    }
    public void applyColour(){
        System.out.println("Pentagon filled with colour: ");
        colour.applyColour();
    }
}
