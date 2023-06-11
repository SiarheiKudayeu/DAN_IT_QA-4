package lesson11.abstractClasses.ex2;

public class Child extends AbstractClass implements Inter, Inter2 {

    @Override
    public void inter() {
        System.out.println("inter1");
    }
}
