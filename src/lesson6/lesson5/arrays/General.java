package lesson6.lesson5.arrays;

public class General {
    public static void main(String[] args) {
        //Массив – это структура данныx, хранящее определенное количество элементов одного типа.
        //По умолчанию все значения массива 0, либо null в зависимости от типа объекта
        //Способы инициализации массива:

        int[] arrayInt = new int[5];
        System.out.println(arrayInt[0]);


        //1)Вручную:
        arrayInt[0] = 23;
        arrayInt[1] = 13;
        arrayInt[2] = 22;
        arrayInt[3] = 2323;
        arrayInt[4] = 9;
        System.out.println(arrayInt[3]);


        //2) Инициализация при помощи цикла for

        /*  int[] arrayInt2 = new int[15];
        for (int i = 0; i < arrayInt2.length; i++) {
            arrayInt2[i] = i * 10;
            System.out.print(arrayInt2[i] + " ");
        }*/


      /*  //Цикл for
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello " + i);
        }

        //Использование цикла for для вывода в консоль всех элементов массива
        for (int i = 0; i < arrayInt.length; i++){
            System.out.print(arrayInt[i]+" ");
        }*/




      /*//Заполнение массива случайными значениями
        //Вариант1
        int[] arrayInt3 = new int[100];
        Random random = new Random();
        int u = random.nextInt(100);
        System.out.println(u);

        for (int i = 1; i <= arrayInt3.length; i++){
            arrayInt3[i-1]=random.nextInt(50);
            System.out.print(arrayInt3[i-1] + " ");
        }

        //Вариант2
        int[] arrayInt4 = new int[100];
        for (int i = 0; i < arrayInt4.length; i++) {
            arrayInt4[i] = (int) ((Math.random() * 101) - 50);
            System.out.print(arrayInt4[i] + " ");
        }*/





        //3) прямая инициализация{}
        /*    String[] arrayString = {"one", "two", "three"};
        System.out.println(arrayString[1]);*/
    }

}
