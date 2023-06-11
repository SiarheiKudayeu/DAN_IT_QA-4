package lesson11.interfaces.ex1;

public class Bird implements Move, Weight{

    @Override
    public void move() {
        System.out.println("Я умею летать");
    }

    @Override
    public void eat() {
        System.out.println("Я клюю");
    }

    @Override
    public void showYourWeight() {
        System.out.println("Я птичка и вешу 300 грамм");
    }
}
