package Polymorphism.Vehicle;

public class Vehicle {

    public static void main(String[] args) {


        Vehicle vehicle = new Bicycle();

        System.out.println("Vehicle's speeed : " + vehicle.speedUp());

    }


    public int speedUp() {

        return 0 ;
    }

}




