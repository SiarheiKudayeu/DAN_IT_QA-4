package lesson2;

public class Increment {

    //int x = 3;
    //int y = ++x*2;
    //x+=-y*3 + ++x + --y;
    //y+=(-x++)%3;
    //int z = x + y;
    //Необходимо вычислить значения x, y и z.
    public static void main(String[] args) {
        /*//Префиксный декремент
        int a = 5;
        System.out.println(--a); //a = a - 1;
        System.out.println(a);

        //Постфиксный декремент
        int b = 5;
        System.out.println(b--); //b = b - 1;
        //System.out.println(b);

        //Префиксный инкремент
        int c = 5;
        System.out.println(++c); //a = a + 1;
        System.out.println(c);

        //Постфиксный инкремент
        int d = 5;
        System.out.println(d++); //b = b + 1;
        System.out.println(d);

        int e = 15;
        e-= 10; //равно e = e - 10;
        System.out.println(e);

        int f = 15;
        f+= 10; // равно f = f + 10;
        System.out.println(f);*/

        int x = 5;
        int y = 4;
        x = x++ - y++ + ++x;
        y+=3;
        int z = --x + --y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println((double)14/(double)3);
        System.out.println(14%3);
    }
}
