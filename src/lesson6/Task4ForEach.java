package lesson6;

public class Task4ForEach {
    public static void main(String[] args) {
        /*
    4)Заполнить массив на 20 элементов случайными числами от 0 до 100.
    Вывести в консоль все значения данного массива.
    Найти минимальный элемент и вывести его на консоль.
    */
        int[] arrayInt4 = new int[20];

        for (int i = 0; i < arrayInt4.length; i++) {
            arrayInt4[i] = (int) (Math.random() * 101);
            System.out.print(arrayInt4[i] + " ");
        }

        int minValue = arrayInt4[0];
        for (int value: arrayInt4) {
            if (value < minValue) {
                minValue = value;
            }
        }
        System.out.println("\n" + "Minimum value is: " + minValue);
    }
}
