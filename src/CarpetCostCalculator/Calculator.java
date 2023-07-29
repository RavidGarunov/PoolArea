package CarpetCostCalculator;

public class Calculator {


    public CarpetCostCalculator.Floor floor ;

    public CarpetCostCalculator.Carpet carpet;


    Floor calculateFloor = new Floor(5,8);
    Carpet calculateCarpet = new Carpet(10);


    public Calculator(CarpetCostCalculator.Floor floor, CarpetCostCalculator.Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;

    }



}
