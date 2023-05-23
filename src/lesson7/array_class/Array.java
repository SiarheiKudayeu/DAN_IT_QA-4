package lesson7.array_class;

import java.util.Arrays;
import java.util.Scanner;

//импортируем класс Arrays для доступа к его методам
public class Array {
    public static void main(String[] args) {
/*        int[] array = {12, 232, 4, 54, 1, 253, 5};
        //sort() - сортировка по возрастанию
        Arrays.sort(array);
        //toString() - приводим массив к строковому типу и можем отобразить его содержимое
        System.out.println(Arrays.toString(array));*/


        //Для сортировки по убыванию массива примитивных типов данных прямого метода нет
        //можно воспользоваться методом класса Collections, но для этого нужно создать массив
        //из объектов соответствующего класса обертки
 /*       Integer[] array2 = new Integer[array.length];
        for( int i = 0; i < array.length; i++){
            array2[i] = array[i];
        }
        Arrays.sort(array2, Collections.reverseOrder());
        System.out.println(Arrays.toString(array2));
*/


        //fill() заполняет массив указанным элементом
/*        String[] strings = new String[6];
        Arrays.fill(strings, "-");
        System.out.println(Arrays.toString(strings));

        int[] numbers = new int[10];
        Arrays.fill(numbers, (int) ((Math.random() * 101) - 50));
        System.out.println(Arrays.toString(numbers));*/

        //также можно указать диапазон идексов, внутри которых будет назаначение
        //элементам массива какзанного значения.
/*        int[] numbers2 = new int[10];
        Arrays.fill(numbers2, 3, 7, 12);
        System.out.println(Arrays.toString(numbers2));*/

        /*String[][] strings = new String[3][3];
        for (String[] singleArray: strings){
            Arrays.fill(singleArray, "*");
        }*/

        /*String[][] strings = new String[3][3];
        for (int i = 0; i < strings.length; i++){
            Arrays.fill(strings[i], "*");
        }
        System.out.println(Arrays.deepToString(strings));*/

        //binarySearch() - можно получить индекс элемента по его значению
    /*    int[] arrayBinary = {12, 232, 4, 54, 1, 253, 5};
        String[] arrayBinaryString = {"Monday","Tuesday","Friday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert");
        int number = scanner.nextInt();
        System.out.println(number);
        int index = Arrays.binarySearch(arrayBinary, 232);
        System.out.println(index);

        System.out.println(Arrays.binarySearch(arrayBinary,4));
        System.out.println(Arrays.binarySearch(arrayBinaryString,"Tuesday"));
        System.out.println(Arrays.binarySearch(arrayBinaryString,"Tuesdaywfsg"));*/

        //equals() - без Arrays
/*
        int[] arrayBinary = {12, 232, 4, 54, 1, 253, 5};
        int[] arrayBinary2 = {12, 232, 4, 54, 1, 253, 5};
        System.out.println(arrayBinary2);
        System.out.println(arrayBinary);
        System.out.println(arrayBinary.equals(arrayBinary2));

        String[] arrayBinaryString1 = {"Monday","Tuesday","Friday"};
        String[] arrayBinaryString2 = {"Monday","Tuesday","Friday"};
        boolean  result = arrayBinaryString1.equals(arrayBinaryString2);
        System.out.println(result);*/

        //equals() - с Arrays
/*
        int[] arrayBinary = {12, 232, 4, 54, 1, 253, 5};
        int[] arrayBinary2 = {12, 232, 4, 54, 1, 253, 5};
        System.out.println(Arrays.equals(arrayBinary2, arrayBinary));

        String[] arrayBinaryString1 = {"Monday","Tuesday","Friday"};
        String[] arrayBinaryString2 = {"Monday","Tuesday","Friday"};
        System.out.println(Arrays.equals(arrayBinaryString1, arrayBinaryString2));
*/


        //deepEquals() с Arrays
      /*  String[][] numbers = {
                {"One", "Two", "Three", "add"},
                {"Four", "Five", "Six", "add"},
                {"Seven", "Eight", "Nine", "asd"}
        };
        String[][] numbers2 = {
                {"One", "Two", "Three", "add"},
                {"Four", "Five", "Six", "add"},
                {"Seven", "Eight", "Nine", "asd"}
        };
        System.out.println(Arrays.deepEquals(numbers, numbers2));
        System.out.println(numbers.equals(numbers2));
        numbers2[1][1] = "Пять";
        System.out.println(Arrays.deepEquals(numbers, numbers2));
        //deepToString() - позвлляет вывести на экран многомерные массивы
        System.out.println(Arrays.deepToString(numbers2));*/


        //copyOf() метод возвращающий новый массив на основе массива переданного в параметры метода
        String[] arrayBinaryString1 = {"Monday","Tuesday","Friday"};
        //String[] arrayBinaryStringCopy = Arrays.copyOf(arrayBinaryString1,arrayBinaryString1.length);
        //String[] arrayBinaryStringCopy = Arrays.copyOf(arrayBinaryString1,5);
        String[] arrayBinaryStringCopy = Arrays.copyOf(arrayBinaryString1,2);
        System.out.println(Arrays.toString(arrayBinaryStringCopy));


        //System.arraycopy() - специальный метод для копирования массивов
        //первый параметр - это массив из которого нужно копировать данные,
        //второй параметр - индекс элемента массива с которого мы начинаем копирование
        //третий параметр - массив в который мы будем вставлять элементы
        //четвертый параметр -индекс элемента массива с которого мы начинаем вставлять скопированные данные
        //пятый параметр - количество копируемых элементов

        int[] array = {12, 232, 4, 54, 1, 253, 5};
        int[] finalArray = new int[10];
        System.arraycopy(array, 2, finalArray, 3, 4 );
        System.out.println(Arrays.toString(finalArray));

        int[] arrayBinarySearch = {12, 232, 4, 54, 1, 253, 5};
        Arrays.sort(arrayBinarySearch);
        System.out.println(Arrays.toString(arrayBinarySearch));
        System.out.println(Arrays.binarySearch(arrayBinarySearch,54));
        System.out.println(Arrays.binarySearch(arrayBinarySearch,12));
        System.out.println(Arrays.binarySearch(arrayBinarySearch,253));
        System.out.println(Arrays.binarySearch(arrayBinarySearch,1));


    }
}
