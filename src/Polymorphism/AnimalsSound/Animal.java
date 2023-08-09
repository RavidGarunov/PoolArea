package Polymorphism.AnimalsSound;

public class Animal {


    public static void main(String[] args) {

        Animal animal =  new Animal();

        animal.sound();

        Animal animal1 = new Bird();

        animal1.sound();

        Animal animal2 =  new Cat();

        animal2.sound();


    }


    public void sound () {

        System.out.println("Sound of animal");

    }

}


