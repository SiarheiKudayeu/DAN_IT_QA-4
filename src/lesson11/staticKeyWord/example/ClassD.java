package lesson11.staticKeyWord.example;

public class ClassD extends ClassC {
    public ClassD(){
        System.out.println("Конструктор класса D");
    }
    {
        System.out.println("Динамический блок D");
    }
    static {
        System.out.println("Статический блок D");
    }
}
