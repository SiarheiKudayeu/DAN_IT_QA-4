package lesson5.while_do;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
         /*while(условие)
    {
        тело цикло выполняется до тех пор пока
        условие true
    }*/
        //break выходит из цикла
        //continue завершает итерацию и уходит на следующий круг


        int iterator = 1;
      /*  System.out.println("Я ввожу текс " + iterator + " раз.");
        iterator++;
        System.out.println("Я ввожу текс " + iterator + " раз.");
        iterator++;
        System.out.println("Я ввожу текс " + iterator + " раз.");
        iterator++;
        System.out.println("Я ввожу текс " + iterator + " раз.");*/

        /*while (iterator < 10){
            System.out.println("Я ввожу текст " + iterator + " раз.");
            if(iterator==7){
                System.out.println("Итератор равен 7");
                break;
            }
            iterator++;
        }*/

        /*while (iterator < 10) {
            if (iterator % 2 != 0){
                iterator++;
            } else {
                System.out.println("Это четная операция");
                iterator++;
            }
        }*/


        //Пример у вас соц сеть в которую можно загружать фотографии
        //у пользователя с консоли спрашивают сколько фотографий
        //он хотел бы загрузить в свой альбом
        //но есть ограничение по размеру альбома в 100 фотографий

        Scanner in = new Scanner(System.in);
        int countOfPhoto = 0;
        while (countOfPhoto <= 100) {
            if((100- countOfPhoto)==0){
                break;
            }
            System.out.println("Сколько фото вы хотите загрузить?");
            int tempCountOfFoto = in.nextInt();
            if(tempCountOfFoto<=0){
                System.out.println("Ввведите положительно кол-во фото");
                System.out.println("Осталось места на " + (100 - countOfPhoto));
                continue;
            }
            if ((countOfPhoto + tempCountOfFoto) > 100) {
                System.out.println("такое кол-во фото не влезет");
                System.out.println("Осталось места на " + (100 - countOfPhoto));
                continue;
            }

            countOfPhoto = countOfPhoto + tempCountOfFoto;

            System.out.println("Осталось места на " + (100 - countOfPhoto));
        }

    }
}
