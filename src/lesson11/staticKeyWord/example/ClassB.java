package lesson11.staticKeyWord.example;

public class ClassB extends ClassA {
    public ClassB(){
        System.out.println("Конструктор класса B");
    }
    {
        System.out.println("Динамический блок B");
    }
    static {
        System.out.println("Статический блок B");
    }
}
