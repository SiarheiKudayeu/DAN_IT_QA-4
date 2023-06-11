package lesson11.interfaces.ex1;

public class Ship implements Move, Weight{
    @Override
    public void move() {
        System.out.println("Я корабль, я плыву");
    }

    @Override
    public void eat() {
        System.out.println("Я заправлюясь топливом");
    }

    @Override
    public void showYourWeight() {
        System.out.println("Я вешу 20 тонн как корабль");
    }
}
