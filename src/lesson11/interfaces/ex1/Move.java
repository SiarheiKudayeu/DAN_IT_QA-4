package lesson11.interfaces.ex1;

public interface Move {
    void move();
    void eat();

    default void touchMe(){
        System.out.println("Меня можно потрогать");
    }
}
