package lesson4.HomeworkTaskAnswers;

import java.util.Scanner;

public class Task2 {
    /*2)Пользователь вводит с клавиатуры три целочисленных значения
      На экран выводится информация можно ли длины из этих сторон
      построить треугольник.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину сторону треугольника:");
        int a = in.nextInt();
        System.out.println("Введите длину сторону треугольника:");
        int b = in.nextInt();
        System.out.println("Введите длину сторону треугольника:");
        int c = in.nextInt();

        if ((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Из этих сторон можно построить");
        } else {
            System.out.println("Из этих сторон нельзя построить");
        }


    }
}
