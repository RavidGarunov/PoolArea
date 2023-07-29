package ObjectAndClass.PoolArea;

public class Cuboid extends Rectangle {

    private double height ;

//    public Cuboid(double height) {
//        this.height = height;
//    }

//    Rectangle rectangle =  new Rectangle();
    public Cuboid(double width, double length, double height) {
        super(width, length);
       if (height<0){
           this.height = 0;
       }
       else {
           this.height=height;
       }
    }

    public double getHeight() {
        return height;
    }

    public double getVolume () {
//        double baseArea = getHeight()*getWidth();
//        return  baseArea*height;

        return getArea()*height;
    }
}

