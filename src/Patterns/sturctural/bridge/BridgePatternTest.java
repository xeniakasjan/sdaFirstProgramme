package Patterns.sturctural.bridge;

public class BridgePatternTest {
    public static void main(String[] args) {

        Shape triangle = new Triangle(new RedColour());
        triangle.applyColour();

        Shape pentagon = new Pentagon(new GreenColour());
        pentagon.applyColour();
    }
}
