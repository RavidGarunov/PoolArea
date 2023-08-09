package Polymorphism.CalculateAreas;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Circle extends Shape{

    private double radius ;


    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatedArea() {


        return PI*this.radius*this.radius;


    }
}
