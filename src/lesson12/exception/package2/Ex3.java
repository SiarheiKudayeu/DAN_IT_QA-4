package lesson12.exception.package2;

import java.util.Scanner;

public class Ex3 {
    public static void manyCatch(int x) throws UnderZeroException {
        System.out.println(12 / x);
        if(x < 0){
            throw new UnderZeroException();
        }
        int[] array = new int[5];

        System.out.println(array[x]);

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert number");
        try {
            manyCatch(scanner.nextInt());
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | UnderZeroException  ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Exit");
        }

    }
}
