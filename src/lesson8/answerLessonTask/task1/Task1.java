package lesson8.answerLessonTask.task1;

public class Task1 {
    /*         1) Написать метод, принимающий в качестве параметров два числа,
         который будет выводить на консоль сумму этих двух чисел.

         Написать второй метод, который будет возвращать сумму двух чисел,
         которые он будет принимать в параметре метода.

         Вывести на консоль сумму двух любых чисел при помощи первого и второго метода.
         */
    public void summOfTwoNumbers(int number1, int number2){
        int sum = number1 + number2;
        System.out.println(sum);
    }

    public void summOfTwoNumbers3(int number1, int number2){
        number1 = number1 + number2;
    }

    public int summOfTwoNumbersInt(int number1, int number2){
        int sum = number1 + number2;
        return sum;
    }



}
