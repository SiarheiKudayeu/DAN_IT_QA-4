package lesson10.key_word_this;

public class Main {
    public static void main(String[] args) {
        ClassConstructor class1 = new ClassConstructor();
        System.out.println(class1);
        ClassConstructor class2 = new ClassConstructor(54,"string");
        ClassConstructor class3 = new ClassConstructor(2753,"strinhsfhsg", "teshfsxt", true);
        System.out.println(class2);
        System.out.println(class3);
    }
}
