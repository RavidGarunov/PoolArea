package Polymorphism.CalculateAreas;

public class Triangle extends Shape{


    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double calculatedArea() {

        double s = (sideA+sideB+sideC)/2;


      return   Math.sqrt(s*(s-sideA)*(s-sideB)*s-sideC);

    }
}
