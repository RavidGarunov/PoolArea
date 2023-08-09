package Polymorphism.CalculateAreas;

import java.util.Scanner;

public class Rectangle extends Shape{

    private double length ;

    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatedArea() {

        return this.length*this.width;

    }
}
