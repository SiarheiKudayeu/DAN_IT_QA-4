package lesson11.staticKeyWord.example;

public class ClassA {
    public ClassA(){
        System.out.println("Конструктор класса A");
    }
    {
        System.out.println("Динамический блок A");
    }
    static {
        System.out.println("Статический блок A");
    }
}
