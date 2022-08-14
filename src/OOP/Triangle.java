package OOP;

public class Triangle {

    //Fields
    private double side1;
    private double side2;
    private double side3;


    //Setter Methods
    public void setSize1(double side1){this.side1 = side1;}
    public void setSize2(double side2) {this.side2 = side2;}
    public void setSize3(double side3) {this.side3 = side3;
    }

    //Getter Methods
    public double getSize1() {return side1;}
    public double getSize2() {return side2;}
    public double getSize3() {return side3;}

    private boolean isValid(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1;
    }

    public double triangleArea(){
        double area;

        if(isValid(side1, side2, side3)){
            double halfParametr = (side1 + side2 + side3)/2;
            area = Math.sqrt(halfParametr *(halfParametr-side1)*(halfParametr-side2)*(halfParametr-side3));
        } else {
            System.out.println("Triangle is not valid");
            area = 0.00;
        }

        return area;
    }
}
