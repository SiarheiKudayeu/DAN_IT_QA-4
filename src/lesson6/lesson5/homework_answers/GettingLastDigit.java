package lesson6.lesson5.homework_answers;

public class GettingLastDigit {
    public static void main(String[] args) {

       /* while (a > 0) {
            lastDigit = a % 10;
            sum = (sum * 10) + lastDigit;
            a = a / 10;
        }*/

        //123456
        //654321
        int lastDigit = 123456%10;
        System.out.println(lastDigit);
        System.out.println(123456/10);
    }
}
