package Cylinder;

import CarpetCostCalculator.Calculator;
import CarpetCostCalculator.Carpet;
import CarpetCostCalculator.Floor;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Floor floor = new Floor(4,6);
        Carpet carpet =  new Carpet(6);

        Calculator calculator = new Calculator(floor,carpet);

        System.out.println(calculator.getTotalCost());



    }
}
