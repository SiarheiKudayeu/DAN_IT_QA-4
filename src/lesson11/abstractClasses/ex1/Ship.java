package lesson11.abstractClasses.ex1;

public class Ship extends Vehicles{
    public Ship(String name, int cost) {
        super(name, cost);
    }

    @Override
    void move() {
        System.out.println("Я корабль, я плыву");
    }

    @Override
    void typeofFuel() {
        System.out.println("Корабельное топливо");
    }
}
