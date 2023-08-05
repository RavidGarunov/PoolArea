package Vehicles;

public class Vehicles {

    private String make;

    private Integer year ;

    public Vehicles(String make, Integer year) {
        this.make = make;
        this.year = year;
    }


    public String getMake() {
        return make;
    }

    public Integer getYear() {
        return year;
    }

    public void displayDetails () {

        System.out.println( " Made: " + make +
                          "\n Year: " + year);
    }
}

