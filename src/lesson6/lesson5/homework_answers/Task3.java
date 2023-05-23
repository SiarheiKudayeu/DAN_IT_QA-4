package lesson6.lesson5.homework_answers;

import java.util.Scanner;

public class Task3 {
    /*
    3)Написать проограмму, условно для склада приема металла. Представим, что склад
может хранить определенный вес металла. Пользователь вводит с
клавиатуры вес, который может хранится на складе. Дальше пользователь вводит
с клавиатуры вес, который условно собирается сдать на склад пользователь.
Программа должна после каждой сдачи металла показывать сколько веса еще может принять
склад. Если пользователь хочет сдать металла больше чем осталось места на складе,
то программа не дает ему это сделать и уведомляет пользователя, о невозможности данной операции.
Если пользователь сдает металл весом меньше чем 5, программа тоже предупреждает
о невозможности приемки такого малого веса. Программа завершается, когда
место на складе закончилось.
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert warehouse capacity:");
        int maxWeight = scanner.nextInt();

        while (maxWeight >= 0) {
            System.out.println("Insert weight to add for warehouse:");
            int weight = scanner.nextInt();
            if (weight < 5) {
                System.out.println("Forbidden add < 5");
            } else if (maxWeight - weight < 0) {
                System.out.println("warehouse is full");
            } else if (maxWeight - weight == 0) {
                System.out.println("Склад заполнен. Конец");
                break;
            } else if (maxWeight - weight <= 5) {
                System.out.println("Недопустимый остаток на складе");
            } else {
                maxWeight = maxWeight - weight;
                System.out.println(maxWeight + " has left");
            }
        }
    }
}
