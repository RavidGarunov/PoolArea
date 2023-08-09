package Polymorphism.CalculateAreas;

public class Main {


    public static void main(String[] args) {

        Circle circle = new Circle(2);

        Rectangle rectangle = new Rectangle(4,5);

        Triangle triangle = new Triangle(5 , 6 , 7 );


        ShapeCalculator calculator = new ShapeCalculator();

        System.out.println(calculator.calculateArea(circle));
        System.out.println(calculator.calculateArea(rectangle));
        System.out.println(calculator.calculateArea(triangle));



    }

}
