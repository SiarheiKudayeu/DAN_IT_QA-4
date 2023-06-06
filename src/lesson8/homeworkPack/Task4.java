package lesson8.homeworkPack;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    /*            4)  Пользователь задает размерность двумерного массива с клавиатуры.
        Массив заполняется случайными числами от 0 до 1000.
        Необходимо создать одномерный массив, состоящий из максимальных значений
        каждого отдельного массива входящего в двумерный.
        Новый полученный массив вывести на экран.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first value");
        int first = scanner.nextInt();
        System.out.println("Insert second value");
        int second = scanner.nextInt();
        int[][] doubleArray = new int[first][second];
        for (int[] singleArray : doubleArray) {
            for (int i = 0; i < singleArray.length; i++) {
                singleArray[i] = (int) (Math.random() * 1001);
            }
        }
        System.out.println(Arrays.deepToString(doubleArray));

        int[] finalArray = new int[first];
        int count = 0;
        for (int a = 0; a < doubleArray.length; a++) {
            int max = doubleArray[a][0];
            for (int b = 0; b < doubleArray[a].length; b++) {
                if (max < doubleArray[a][b]) {
                    max = doubleArray[a][b];
                }
                finalArray[count] = max;
            }
            count = count + 1;
        }

        System.out.println(Arrays.toString(finalArray));

    }
}
