package lesson12.exception.package2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

/*        Person person = null;
        person.getName();
        System.out.println("Программа завершен");*/

/*        int x = 13;
        int y = 0;
        System.out.println(x/y);
        System.out.println("Программа завершен");*/

/*        int[] array = new int[5];
        System.out.println(array[100]);
        System.out.println("Программа завершен");*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert array index");
        int[] array = new int[5];
        try {
            System.out.println(array[scanner.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Неуместный индекс массива");
        } finally {
            System.out.println("Программа завершена");
        }


    }

}
