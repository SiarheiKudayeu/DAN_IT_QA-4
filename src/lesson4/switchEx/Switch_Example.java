package lesson4.switchEx;

import java.util.Scanner;

public class Switch_Example {
      /*switch(переменная для сравнения)
    {
        case значение1:
            (код для выполнения при равенстве переменной и значения);
            break;
        case значение1:
            (код для выполнения при равенстве переменной и значения);
            break;
        default:
            (код для если не возникло ни одного совпадения);
    }*/

    public static void main(String[] args) {
        Scanner myFavScanner = new Scanner(System.in);
        System.out.println("Назаовите вашу профессию QA, DEV, PM");
        String profession = myFavScanner.nextLine();
      /*  if(professin.equalsIgnoreCase("QA")){
            System.out.println("Hello QA");
        }*/
        switch (profession.toUpperCase().trim()) {
            case ("AQA"):
            case ("QA"):
                System.out.println("Привет тебе Tester");
                break;
            case("FRONT DEV"):
            case("BACK DEV"):
            case ("DEV"):
                System.out.println("Привет тебе " + profession);
                break;
            case ("PM"):
                System.out.println("Привет тебе Projec Manager");
                break;

            case ("Des"):
                System.out.println("Привет тебе DEsigner");
                break;
            default:
                System.out.println("Привет тебе "+profession);
        }
    }
}


