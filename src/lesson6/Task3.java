package lesson6;

public class Task3 {
    /*
    3)Заполнить массив на 45 элементов случайными числами
    от -13 до +30. Вывести в консоль все его нечетные числа которые делятся на три.
     */
    public static void main(String[] args) {
        int[] arrayInt4 = new int[45];
        for (int i = 0; i < arrayInt4.length; i++) {
            arrayInt4[i] = (int) ((Math.random() * 44) - 13);
            System.out.print(arrayInt4[i] + " ");

        }
        System.out.println("");

        for (int i = 0; i < arrayInt4.length; i++) {
            if ((arrayInt4[i] % 2 != 0) && (arrayInt4[i] % 3 == 0)) {
                System.out.print(arrayInt4[i] + " ");
            }
        }
    }
}
