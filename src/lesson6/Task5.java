package lesson6;

import java.util.Scanner;

public class Task5 {
    /*5)Необходимо вывести на экран перевернутый прямоугольный треугольник прямым углом сверху в левой части.
    Для вывода использовать условные операторы, циклы.
    Команду System.out.println(); System.out.print(); и можно использовать только с одним символом *.
    Пользователь вводит с клавиатуры число, которое будет считаться основанием треугольника,
    а программа выводит сам треугольник.
    Пример с числом 7:
    *******
    ******
    *****
    ****
    ***
    **
    *
    Необходимо написать программу для вывода вначале заполненного, а потом и пустого треугольника.
*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert length of triangle side:");
        int length = scanner.nextInt();

        //Filled triangle
        for (int i = length; i > 0; i--) {
            for(int a = 0; a < i; a++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //Empty triangle
        for (int i = length; i > 0; i--) {
            for(int a = 0; a < i; a++){
                if (i == length || a == 0 || a == (i-1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
