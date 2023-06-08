package lesson10.recurs;

import java.util.Scanner;

public class Recurs2 {
    //Пользователь вводит с клавиатуры сумму, которую он хочет взять в кредит, а также сумму
    //которую он будет выплачивать каждый месяц. В консоль выводится порядковый номер месяца,
    // и сумма оставшаяся для выплаты кредита. Как только кредит погашен, в консоль выводится
    //фраза: Кредит погашен за {кол-во месяцев}.
    static void askAndCredit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму для кредита");
        int sumCredit = scanner.nextInt();
        System.out.println("Введите ежемесячный платеж");
        int sumMonth = scanner.nextInt();
        credit(sumCredit, sumMonth, 1);
    }

    static void credit(int sumCredit, int sumMonth, int count) {
        sumCredit = sumCredit - sumMonth;
        System.out.println("Остаток равен " + sumCredit + ". Номер месяца " + count);
        if (sumCredit < 0) {
            System.out.println("Кредит выплачен за " + count + " месяцев.");
        } else {
            count++;
            credit(sumCredit, sumMonth, count);
        }
    }

    public static void main(String[] args) {
        askAndCredit();
    }
}
