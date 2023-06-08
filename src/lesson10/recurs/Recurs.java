package lesson10.recurs;

import java.util.Scanner;

public class Recurs {
    //Пользователь вводит положительное число с клавиатуры, а система выводит в консоль все числа от введенного,
    //до 0. При решении данной задачи попробовать использовать рекурсию
    static void insertAndPrint() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число больше нуля");
        int numbers = scanner.nextInt();
        printAllNumbers(numbers);
    }

    static void printAllNumbers(int numbers) {
        if (numbers == 0) {
            System.out.println(numbers);
        } else if (numbers < 0) {
            System.out.println("Вы ввели отрицательное число");
        } else {
            System.out.println(numbers);
            numbers--;  //equals numbers = numbers - 1
            printAllNumbers(numbers);
        }
    }

    public static void main(String[] args) {
        insertAndPrint();
    }

}
