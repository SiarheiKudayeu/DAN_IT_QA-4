package lesson12.exception.package2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert array index");
        int[] array = new int[5];
        try {
            System.out.println(array[scanner.nextInt()]);
        } catch (Exception ex){
            ex.printStackTrace();
        } finally {
            System.out.println("Программа завершена");
        }
    }
}
