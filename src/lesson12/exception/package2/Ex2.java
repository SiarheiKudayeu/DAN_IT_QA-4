package lesson12.exception.package2;

import java.util.Scanner;

public class Ex2 {
    public static void manyCatch(int x) {
        System.out.println(12 / x);
        int[] array = new int[5];
        System.out.println(array[x]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        try {
            manyCatch(scanner.nextInt());
        } catch (ArithmeticException ex) {
            System.out.println("Вы поделили на ноль");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Выход за пределы массива");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Выход за index массива");
        } finally {
            System.out.println("Exit");
        }

    }
}
