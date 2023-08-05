package Vehicles;

public class Car extends Vehicles {

    private int numberOfDoors ;

    public Car(String make, Integer year, int numberOfDoors) {
        super(make, year);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void displayDetails () {



        System.out.println( " Made: " + super.getMake() +
                          "\n Year: " + super.getYear() +
                          "\n Doors: " + this.numberOfDoors );
    }

}
