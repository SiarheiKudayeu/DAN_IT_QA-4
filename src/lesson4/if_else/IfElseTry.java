package lesson4.if_else;

import java.util.Scanner;

public class IfElseTry {
    /*   if(условие){
        (этот блок выполнится
        если условие = true);
  } else {
        (этот блок выполнится
        если условие = false);
        }*/
    public static void main(String[] args) {
      /*  Scanner input = new Scanner(System.in);
        System.out.print("Input some integer ");
        int x = input.nextInt();
        if (x < 5) {
            System.out.println("Your number is: " + x);
            System.out.println("number is less than 5");
        } else if (x > 5) {
            System.out.println("Your number is: " + x);
            System.out.println("number is more than 5");
        } else {
            System.out.println("Your number is: " + x);
            System.out.println("number is equals 5");
        }
    }*/


        //Задана стоимость билета по маршруту Днепр - Киев.
        //В зависимости от возраста предоставляется скидка
        double cost = 1000;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваш возраст ");
        int age = input.nextInt();
        if (age < 18) {
            if (age == 13) {
                cost = cost * 0.6;
                System.out.println("Цена билета = " + cost);
            } else {
                cost = cost * 0.75;
                System.out.println("Цена билета = " + cost);
            }
        } else if (age > 55) {
            cost = cost * 0.5;
            System.out.println("Цена билета = " + cost);
        } else {
            System.out.println("Цена билета = " + cost);
        }
    }
}
