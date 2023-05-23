package lesson6.lesson5.homework_answers;

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print("Массив" + array[i] + " ");
        }
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите число: ");
        int number = scanner.nextInt();

        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Число " + number + " найдено в массиве.");
        } else {
            System.out.println("Число " + number + " не найдено в массиве.");
        }
    }
}
