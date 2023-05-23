package lesson6.lesson5.homework_answers;

import java.util.Scanner;

public class Task4 {
    /*  4)Создать три массива.
      Первый будет состоять из следующих имен:
              "Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб".
      Второй будет содержать следующие значения типа int:
              10, 12, 14, 16, 18, 20.
      Третий будет содержать следующие значения:
              "школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику".
      Пользователь вводит три числа с клавиатуры, которые будут соответствовать
      индексам каждого из элементов массивов.
      Пример1. после ввода 3,2,1:
      На экране должно вывестись следующее сообщение:
              "Федя будет идти в магазин в 14:00"
      Пример2. после ввода 1,2,3:
      На экране должно вывестись следующее сообщение:
              "Маша будет идти в тренажерный зал в 14:00"*/
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"};
        String[] place = {"школу", "магазин", "церковь", "тренажерный зал", "кино", "поликлинику"};
        int[] time = {10, 12, 14, 16, 18, 20};
        Scanner input = new Scanner(System.in);
        int index1;
        while (true) {
            System.out.println("Insert index of first array");
            System.out.println("Between 0 and " + (names.length - 1));
            int index = input.nextInt();
            if (index >= 0 && index < names.length) {
                index1 = index;
                break;
            }
        }
        int index2;
        while (true) {
            System.out.println("Insert index of second array");
            System.out.println("Between 0 and " + (place.length - 1));
            int index = input.nextInt();
            if (index >= 0 && index < place.length) {
                index2 = index;
                break;
            }
        }
        int index3;
        while (true) {
            System.out.println("Insert index of third array");
            System.out.println("Between 0 and " + (time.length - 1));
            int index = input.nextInt();
            if (index >= 0 && index < time.length) {
                index3 = index;
                break;
            }
        }
        System.out.println(names[index1] + " будет идти в " + place[index2] + " в " + time[index3] + ":00");

    }
}
