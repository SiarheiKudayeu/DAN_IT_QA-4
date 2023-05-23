package lesson8;

public class Peregruz {
    public static void doSmth() {
        System.out.println("Я просто что-то делаю");
    }

    public static void doSmth(String text) {
        System.out.println("Мне доверили текст:" + text);
    }

    public static void doSmth(int number1, int number2, int number3) {
        System.out.println("Сумма чисел равна " + (number2 + number1 + number3));
    }

    public static void doSmth(int number1, int number2, String text) {
        System.out.println("разность чисел равна " + (number2 - number1));
        System.out.println("текст равен" + text);
    }

    public static void doSmth(int number1, String text, int number2) {
        System.out.println("разность чисел равна " + (number2 - number1));
        System.out.println("текст равен" + text);
    }

    public static void main(String[] args) {
        doSmth();
        System.out.println("=======================");
        doSmth("Это мой текст");
        System.out.println("=======================");
        doSmth(3, 4, 12);
        System.out.println("=======================");
        doSmth(3, 4, "String");
        System.out.println("=======================");
        doSmth(3,  "String", 56);
    }

}
