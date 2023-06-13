package lesson12.task1;

import lesson12.exception.package1.ZeroValue;

public class Task2 {
    /*
    1) Создайте метод, который просит у пользователя ввести с клавиатуры два числа
    и делить одно на другое. Создать собственное ичключение, которое будет возникать если делитель ноль.
    Необходимо обработать это исключение внутри main.
    */
    public void division(int number1, int number2) throws ZeroException {
        if (number2 == 0){
            throw new ZeroException("Пожалуйста не используй ноль");
        }
        System.out.println(number1/number2);
    }

    public static void main(String[] args)  {
        Task2 task2 = new Task2();
        try {
            task2.division(3,0);
        } catch (ZeroException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Final");
    }
}
