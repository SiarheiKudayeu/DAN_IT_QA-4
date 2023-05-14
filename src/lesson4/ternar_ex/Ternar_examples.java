package lesson4.ternar_ex;

import java.util.Scanner;

public class Ternar_examples {
    public static void main(String[] args) {
        //синтаксис:

        // условие ? выражение1 : выражение2

        // оператор будет возвращать выражение 1, если условие = true
        // оператор будет возвращать выражение 2, если условие = false
        // тернарный оператор должен пригимать значение.
     /*   Scanner input = new Scanner(System.in);
        System.out.print("Введите ваш возраст ");
        int age = input.nextInt();
        String message = age < 18 ? "Вы несовершеннолетний гражданин" : "Вы совершеннолетний гражданин";
        System.out.println(message);*/


        //Т.к. тернарный оператор возвращает значение, то при помощи него можно присваивать
        // значения переменным
        /*boolean isCarNew = false;
        int costAuto = isCarNew ? 10000 : 5000;
        System.out.println("Стоимость авто " + costAuto);*/


        //Есть возможность использовать множественные тернарный оператор:
        //допустим нужно определить входит ли введенное число в интервал от 5 до 100 включительно
        /*Scanner input = new Scanner(System.in);
        System.out.print("Введите ваше число ");
        int number = input.nextInt();
        String positive = "Ваше введенное число " + number + " входит интервал от 5 до 100";
        String negative = "Ваше введенное число " + number + " не входит интервал от 5 до 100";
        String result = number < 5 ? negative : number > 100 ? negative : positive;
        System.out.println(result);*/


        //При помощи тернарного оператора можно производить операции
        //Необходимо получить разность двух чисел введенных с клавиатуры,
        //и всегда отнимать от большего меньшее
        Scanner input = new Scanner(System.in);
        System.out.print("Введите ваше число ");
        int number1 = input.nextInt();
        System.out.print("Введите ваше число ");
        int number2 = input.nextInt();
       /* int result = number1 > number2 ? number1 - number2 : number2 > number1 ? number2 - number1 : 0;
        System.out.println(result);*/
        System.out.println(number1 > number2 ? number1 - number2 : number2 > number1 ? number2 - number1 : 0);


    }
}
