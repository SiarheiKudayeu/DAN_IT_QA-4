package lesson6;

public class Task2 {
    /*
    2)Заполнить массив на 45 элементов случайными числами
    от -50 до +50. Вывести в консоль сумму всех его элементов.
    */
    public static void main(String[] args) {
        int[] array = new int[45];

      /*  for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/

        for (int i = 0; i < array.length; i++){
            array[i] = (int) ((Math.random()*101)-50);
        }

        //System.out.println("\n========================");

        /*for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/

        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }

        System.out.println("\n"+result);
    }
}
