package lesson7.manyArrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExampleTask {
    public static void main(String[] args) {
        String[][] name = new String[3][3];
        name[0][0] = "Alla";
        name[0][1] = "Dima";
        name[0][2] = "Ira";
        name[1][0] = "Artem";
        name[1][1] = "Anya";
        name[1][2] = "Kirill";
        name[2][0] = "Petya";
        name[2][1] = "Jenya";
        name[2][2] = "Lena";

        String[][] reseult = new String[3][3];
        for (int i = 0; i < reseult.length; i++) {
            for (int a = 0; a < reseult[i].length; a++) {
                reseult[i][a] = "-";
            }
        }

        for (String[] singleArray: reseult){
            for (String text: singleArray){
                System.out.print(text + ", ");
            }
            System.out.print("\b\b");
            System.out.println();
        }
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Insert number1:");
            String number1 = scanner.nextLine();
            System.out.println("Insert number2:");
            String number2 = scanner.nextLine();
            if(number1.equalsIgnoreCase("stop")||number1.equalsIgnoreCase("stop")){
                break;
            }
            reseult[Integer.parseInt(number1)][Integer.parseInt(number2)] = name[Integer.parseInt(number1)][Integer.parseInt(number2)];
            for (String[] singleArray: reseult){
                for (String text: singleArray){
                    System.out.print(text + ", ");
                }
                System.out.print("\b\b");
                System.out.println();
            }
        }
    }
}
