package lesson6.foreach;

public class ForEachDifFor {
    public static void main(String[] args) {
        int[] arrayInt = new int[45];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) ((Math.random() * 44) - 13);
        }
        //Вывод массива arrayInt
        for (int number : arrayInt) {
            System.out.print(number + " ");
        }
        System.out.println("");

        int[] arrayInt2 = new int[45];

        //Таким образом задавать значение элемента массива нельзя
        for (int number : arrayInt2) {
            number = (int) ((Math.random() * 44) - 13);
        }

        //Вывод массива arrayInt2
        for (int number : arrayInt2) {
            System.out.print(number + " ");
        }
    }
}
