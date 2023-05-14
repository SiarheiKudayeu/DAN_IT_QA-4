package lesson4.formatter;

import java.util.Date;

public class Formatter {
    public static void main(String[] args) {
        //Мы рассмотрим форматирование в виде след. метода
        //System.out.printf(format, arguments);

        //Для форматировании строки необходимо понимать какие спецификаторы формата встречаются


        //%n вставака символа новой строки
        //%% вставка символа %
//

        /*%b булевое знанчение аргумента
        В java работает следующим образом:
        Если в аргументе передано null то форматтер выведет false
        Если в аргументе передано boolean то форматтер выведет значение boolean
        Если в аргументе передан один из примитивных типов данных то форматтер выведет true
        Регистр имеет значение*/

        //%s строковое представление аргумента
        //можно указывать маркеры подстановки типа 1$ для упорядочивания вывода необходимых аргументов
        //Со строковым значением можно указывать длину контейнера в которм разместить наше строковое значение
        //Можно также ограничивать кол-во символов
        //System.out.printf("This is format %2$s string for %1$s example","SPEC1","SPEC2");

        //%c символьное представление аргумента
        /*char c = 'C';
        System.out.printf("This is format '%c' string for example",c);*/


        //%d Для работы с целочисленными типами данных byte, int, short, long
       // System.out.printf("This is format '%d' string for example",345);


        //%f Для работы с вещественными типами данных float, double
        //System.out.printf("Отобразим число с плавающей точкой: %%%f\n" , 200.0546);

        Date date = new Date();
        System.out.println(date);
        //При форматировании даты и времени чаще всего используют два символа T и t
        //и различные суффиксы

        //форматирование вывода времени
        //H - часы, M - минуты, S - секунды, L - миллисекунды , N - наносекунды.
        //p - добавляет информацию о pm и am
//        System.out.printf("Вывeдем дату в формате: %tH\n", date);
//        System.out.printf("Выведем дату в формате: %tM\n", date);
//        System.out.printf("Выведем дату в формате: %tS\n", date);
        System.out.printf("Time now is : %1$tH hours, %1$tM minutes, %1$tS seconds\n",date);

        //A - день недели, d - две цифры даты , B - месяц, m - месяц в виде цифры,
        // Y - год, y - две фин цифры года
        System.out.printf("date now is : %1$td, %1$tB, %1$tY\n",date);
        System.out.printf("Time now is : %1$tT\n",date);

        System.out.printf("Time now is : %1$tH hours, %1$tM minutes, %1$tS %2$s\n",date, "second");


        String stringForFormat = "Time now is : %1$tH hours, %1$tM minutes, %1$tS %2$s\n";
        String stringFinalText = String.format(stringForFormat,date,"SECOND");
        System.out.println(stringFinalText);


    }
}
