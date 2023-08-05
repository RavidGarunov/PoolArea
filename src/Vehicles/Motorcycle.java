package Vehicles;

public class Motorcycle extends Vehicles {

    private boolean hasSideCar ;

    public Motorcycle(String make, Integer year, boolean hasSideCar) {
        super(make, year);
        this.hasSideCar = hasSideCar;
    }

    public boolean isHasSideCar() {
        return hasSideCar;
    }


    public void displayDetails () {



        System.out.println( " Made: " + super.getMake() +
                "\n Year: " + super.getYear() +
                "\n Side car: " + this.hasSideCar );
    }
}
