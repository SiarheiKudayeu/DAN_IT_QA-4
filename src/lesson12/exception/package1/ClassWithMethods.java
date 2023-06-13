package lesson12.exception.package1;

import java.util.Scanner;

public class ClassWithMethods {
    static int getNumber(int x) throws ZeroValue {
        if(x == 0){
            throw new ZeroValue();
        }return x;
    }
    static int getNumber2(int x) throws UnderZeroException {
        if(x < 0){
            throw new UnderZeroException();
        }return x;
    }
    static int getArrayIndex(int x) throws ArraysException {
        int[] array = new  int[5];
        if(x > array.length){
            throw new ArraysException();
        }return x;
    }

    static void finalMethod() throws ArraysException, UnderZeroException, ZeroValue {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert array index");
        int x = scanner.nextInt();
            getNumber(x);
            getNumber2(x);
            getArrayIndex(x);
    }

    public static void main(String[] args) {
        try {
            finalMethod();
        } catch (ArraysException | UnderZeroException | ZeroValue e) {
            System.out.println(e.getMessage());
        }
    }
}
