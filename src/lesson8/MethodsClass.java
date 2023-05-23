package lesson8;

public class MethodsClass {

    //метод без параметров, и без возврата значений
    public void printSmth() {
        System.out.println("Hello Java");
    }

    //метод с параметрами, и без возврата значений
    public void printSmth2(String text, int number) {
        System.out.println("My text is: " + text);
        System.out.println("My number is: " + number);
    }

    //метод без параметров, и c возвратом значений
    public String printSmth3() {
        return "Return String";
    }

    //метод с параметрами, и c возвратом значений
    public String printSmth4(String text) {
        return text;
    }
}

class Main {
    public static void main(String[] args) {
        MethodsClass methodsClass = new MethodsClass();
        methodsClass.printSmth();

        methodsClass.printSmth2("This", 34);

        String text = methodsClass.printSmth3();
        System.out.println(text);

        System.out.println(methodsClass.printSmth3());

        System.out.println(methodsClass.printSmth4("final method"));
    }
}
