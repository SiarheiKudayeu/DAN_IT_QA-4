package lesson5.arrays;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        //Пользователь вводит строку с клавиатуры. Все цифры из данной строки
        //должны быть помещены в массив. Массив необходимо отсортировать по возрастанию
        //и вывести на экран.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String text = scanner.nextLine();
        String result = "";

        //Прооверяем есть ли в наше строке хотя бы один числовой символ
        if (text.split("\\d").length == 1) {
            System.out.println("В данной строке нет ни одной цифры");
        } else {
            //Если хотя бы одни числовой элемент имеется, то мы начинаем циклом проходить
            //по всем элементам данной строки
            for (int i = 0; i < text.length(); i++) {
                //Проверка на то, что именно данный символ является числовым
                if (Character.isDigit(text.charAt(i))) {
                    //Если данный символ числовой, то мы его записываем в строку result
                    result = result + text.charAt(i);
                    //После проверянм условие на случай, если последующий символ
                    //тоже является числовым
                    while ((i + 1 != text.length()) && Character.isDigit(text.charAt(i + 1))) {
                        i = i + 1;
                        result = result + text.charAt(i);
                    }
                    //после всех проверок добавляем пробел после нашего значения
                    result = result + " ";
                }
            }
        }
        //Узнаем количество элеметов в строке result разбивая ее на массив строк при помощи пробела
        int countOfElements = result.split("\\s").length;
        //создаем массив из целых чисел, размерностью равной количеству элементов
        //в массиве строк.
        int[] elements = new int[countOfElements];
        //Создаем непосредственно сам массив строк
        String[] stringElements = result.split("\\s");

        //присваиваем нашему числовому массиву, значения из массива строк
        for (int i = 0; i < countOfElements; i++) {
            elements[i] = Integer.parseInt(stringElements[i]);
        }

        //Упорядочиваем наш массив по возрастанию
        for (int i = 0; i < elements.length; i++) {
            int min;
            for (int a = i + 1; a < elements.length; a++) {
                if (elements[i] > elements[a]) {
                    min = elements[a];
                    elements[a] = elements[i];
                    elements[i] = min;
                }
            }
        }
        //Выводим наш массив в консоль
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }


    }
}




