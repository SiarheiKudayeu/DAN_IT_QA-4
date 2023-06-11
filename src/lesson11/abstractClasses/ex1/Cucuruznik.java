package lesson11.abstractClasses.ex1;

public class Cucuruznik extends Plane {
    public Cucuruznik() {
        this.typeOfPlane = "Кукурузник";
    }

    @Override
    void move() {
        System.out.println("fly");
    }

    @Override
    void typeofFuel() {
        System.out.println("Air fuiel");
    }
}
