package lesson11.abstractClasses.ex1;

public class Car extends Vehicles{
    @Override
    void move() {
        System.out.println("Я машина, я еду");
    }

    @Override
    void typeofFuel() {
        System.out.println("машинное топливо");
    }
}
