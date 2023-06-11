package lesson11.staticKeyWord.fields_methods;

public class ExClass {
    public String nonStaticString = "nonStaticString";
    public void nonStaticMethod(){
        System.out.println("I am nonStaticMethod");
    }
    public static String staticString = "StaticString";
    public static void staticMethod(){
        System.out.println("I am StaticMethod");
    }

    public static void printStatic(){
        System.out.println(staticString);
        //System.out.println(nonStaticString);
        staticMethod();
    }

    public void printNonStatic(){
        System.out.println(staticString);
        System.out.println(nonStaticString);
        staticMethod();
        nonStaticMethod();
    }

    public static void main(String[] args) {
        ExClass object = new ExClass();
        object.nonStaticMethod();
        staticMethod();
        System.out.println(object.nonStaticString);

        ExClass.staticMethod();
        System.out.println(ExClass.staticString);

    }
}
