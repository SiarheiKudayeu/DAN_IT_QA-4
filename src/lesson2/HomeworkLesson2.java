package lesson2;

public class HomeworkLesson2 {

    /*   Раздел 1. Не делаем его в среде разработке.
               1)
       mercedes = (1 + (3*(2-4))%3 + (11-7)*2)+(3-5)*3;
       volvo = mercedes*3 - 9%mercedes + 16-(-mercedes);
       opel = mercedes%volvo;
       Необходимо вычислить значения mersedes, volvo и opel.

               2)
       int x = 3;
       int y = ++x*2;
       x+=-y*3 + ++x + --y;
       y+=(-x++)%3;
       int z = x + y;
       Необходимо вычислить значения x, y и z.

               3)
       boolean a = (85/5 + (19-25%3))==(-3)*(-2+14/(-2))&&(2%7-1)*3<=2;
       boolean b = !a||a&&!a;
       boolean c = false&&!true||!((23%3+14)%3==7);
       Необходимо вычислить значения a, b и c.

               4)
       Coздать две переменные типа int:
       int a = 7;
       int b = 9;
       Поменять между собой значения переменных a и b.
       Создавать новые переменные нельзя.
       Можно применять только арифметические действия к перемнным a и b.
       Вывести в консоль значения переменных a и b после их переопределения.
       */
    public static void main(String[] args) {
        int a = 7;
        int b = 9;
        a = a + b; //a = 16. b = 9
        b = a - b; //a = 16. b = 7
        a = a - b; //a = 9, b = 7
        System.out.println(a);
        System.out.println(b);
    }


}
