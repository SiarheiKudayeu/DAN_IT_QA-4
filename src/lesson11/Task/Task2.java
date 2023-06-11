package lesson11.Task;

import java.util.Scanner;

public class Task2 {
    /*
     Завдання
     Написати консольну програму "планувальник завдань на тиждень".

     Технічні вимоги:


     Створити двовимірний масив рядків розмірністю 7х2
     String[][] scedule = new String[7][2]


     Заповніть матрицю значеннями день тижня: головне завдання на цей день:
     scedule[0][0] = "Sunday";
     scedule[0][1] = "do home work";
     scedule[1][0] = "Monday";
     scedule[1][1] = "go to courses; watch a film";


     Використовуючи цикл та оператор switch, запитайте у користувача день тижня в консолі, залежно від введення:

     програма: Please, input the day of the week:
     користувач вводить коректний день тижня (f.e. Monday)
     програма виводить на екран Your tasks for Monday: go to courses; watch a film.;
     програма йде на наступну ітерацію;
     програма: Please, input the day of the week:
     користувач вводить некоректний день тижня (f.e. %$=+!11=4)
     програма виводить на екран Sorry, I don't understand you, please try again.; програма йде на наступну ітерацію до успішного введення;
     програма: Please, input the day of the week:
     користувач виводить команду виходу exit
     програма виходить із циклу і коректно завершує роботу.



     Завдання повинно бути виконане за допомогою масивів (НЕ використовуйте інтерфейси List, Set, Map).
     Зверніть увагу: програма повинна приймати команди як у нижньому регістрі (monday) так і у верхньому (MONDAY) і врахуйте, що користувач міг випадково після дня тижня ввести пробіл.



     Необов'язкове завдання просунутої складності:
     Доопрацюйте програму так, щоб при введенні користувачем фрази change [day of the week] або reschedule [day of the week], програма запропонувала ввести нові завдання для даного дня тижня і зберегла їх у відповідному осередку масиву, видаливши при цьому старі завдання. Після цього програма йде на наступну ітерацію до введення exit.

     програма: Please, input the day of the week:

     Користувач вводить change Monday

     програма пропонує ввести нові завдання на понеділок Please, input new tasks for Monday.

     Користувач вводить нові завдання в консоль
     програма зберігає нові завдання у відповідний осередок
     програма пішла на нову ітерацію і під час введення "Monday" видає вже нові завдання.
     */
    public static void main(String[] args) {
        String[][] scedule = new String[7][2];
        scedule[0][0] = "Sunday";
        scedule[0][1] = "go home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "go walk";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "go watch a film";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "go to friends";
        scedule[5][0] = "Friday";
        scedule[5][1] = "go cyclind";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "go for football";

        System.out.println("Please, input the day of the week: ");
        Scanner myScanner = new Scanner(System.in);
        String day = myScanner.nextLine();

        while (!day.equalsIgnoreCase("exit")) {

            day = day.toUpperCase().trim();
            if (day.contains("CHANGE") || day.contains("RESCHEDULE")) {
                String aloneDay = (day.split("\\s"))[1];

                for (int i = 0; i < 7; i++) {
                    if (scedule[i][0].equalsIgnoreCase(aloneDay)) {

                        System.out.println("Please, input new task for " + aloneDay);
                        String newTask = myScanner.nextLine();
                        scedule[i][1] = newTask;
                        break;
                    }
                }
                day = aloneDay;
            }


            switch (day) {
                case "SUNDAY":
                    System.out.println("Your tasks for " + scedule[0][0] + ": " + scedule[0][1]);
                    break;
                case "MONDAY":
                    System.out.println("Your tasks for " + scedule[1][0] + ": " + scedule[1][1]);
                    break;
                case "TUESDAY":
                    System.out.println("Your tasks for " + scedule[2][0] + ": " + scedule[2][1]);
                    break;
                case "WEDNESDAY":
                    System.out.println("Your tasks for " + scedule[3][0] + ": " + scedule[3][1]);
                    break;
                case "THURSDAY":
                    System.out.println("Your tasks for " + scedule[4][0] + ": " + scedule[4][1]);
                    break;
                case "FRIDAY":
                    System.out.println("Your tasks for " + scedule[5][0] + ": " + scedule[5][1]);
                    break;
                case "SATURDAY":
                    System.out.println("Your tasks for " + scedule[6][0] + ": " + scedule[6][1]);
                    break;
                case "EXIT":
                    break;
                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
            }
            System.out.println("Please, input the day of the week: ");
            day = myScanner.nextLine();
        }
    }
}
