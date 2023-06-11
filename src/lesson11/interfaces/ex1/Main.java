package lesson11.interfaces.ex1;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Ship ship = new Ship();
        bird.eat();
        bird.move();
        bird.touchMe();
        System.out.println();
        ship.eat();
        ship.move();
        ship.showYourWeight();
    }
}
