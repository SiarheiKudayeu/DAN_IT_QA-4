package lesson11.staticKeyWord.example;

public class ClassC extends ClassB {
    public ClassC(){
        System.out.println("Конструктор класса C");
    }
    {
        System.out.println("Динамический блок C");
    }
    static {
        System.out.println("Статический блок C");
    }
}
