package lesson4.HomeworkTaskAnswers;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //Я тестирую замечательно. Что еще нужно?
        Scanner input = new Scanner(System.in);
        System.out.print("Введите строку: ");

        String string1 = input.next();
        String string2 = input.next();
        String string3 = input.next();
        String string4 = input.next() + " " + input.next() + " " + input.next();

        System.out.println("string1 = " + string1);
        System.out.println("string2 = " + string2);
        System.out.println("string3 = " + string3);
        System.out.println("string4 = " + string4);
    }
}
