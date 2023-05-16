package lesson4.HomeworkTaskAnswers;

import java.util.Scanner;

public class Task7 {
    /*Используя оператор switch написать программу, которая выводит на
консоль ссылку для скачивания программы.
Из выбора программ взять: IntelliJ IDEA, Git, Java.
Из выбора ОС взять: Linux, macOS, Windows.
Программа должна спросить пользователя какая программа ему интересна,
также спросить какую ОС он использует, а после вывести в консоль необходимую ссылку.
Если программа с таким названием не существует выводит сообщение в консоль, о том
что такой программы не существует.
Если указанной пользователем ОС нет, то выводится сообщение в консоль, о том
что такой ОС не существует.*/
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вашу ОС: LiNux, macOS, Windows");
        String os = in.nextLine();
        String programm;
        switch (os.toUpperCase()) {
            case ("LINUX"):
                System.out.println("Введите вашу программу: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваша ссылка на intellij, linux");
                        break;
                    case ("git"):
                        System.out.println("Ваша ссылка на git, linux");
                        break;
                    case ("java"):
                        System.out.println("Ваша ссылка на java, linux");
                        break;
                    default:
                        System.out.println("Такой программы мы не нашли");
                }
                break;
            case ("MACOS"):
                System.out.println("Введите вашу программу: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваша ссылка на intellij, macos");
                        break;
                    case ("git"):
                        System.out.println("Ваша ссылка на git, macos");
                        break;
                    case ("java"):
                        System.out.println("Ваша ссылка на java, macos");
                        break;
                    default:
                        System.out.println("Такой программы мы не нашли");
                }


                break;
            case ("WINDOWS"):
                System.out.println("Введите вашу программу: IntelliJ IDEA, Git, Java");
                programm = in.nextLine();
                switch (programm.toLowerCase()) {
                    case ("intellij"):
                        System.out.println("Ваша ссылка на intellij, windows");
                        break;
                    case ("git"):
                        System.out.println("Ваша ссылка на git, windows");
                        break;
                    case ("java"):
                        System.out.println("Ваша ссылка на java, windows");
                        break;
                    default:
                        System.out.println("Такой программы мы не нашли");
                }

                break;
            default:
                System.out.println("Такой ОС не найдено");
        }

    }
}
