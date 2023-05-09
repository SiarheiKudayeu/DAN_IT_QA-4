package lesson2;

public class LogigType {
    public static void main(String[] args) {
        /*boolean e = true;
        boolean f = false;
        System.out.println(e);*/

        // ==
        boolean x = 15 == 14;
        System.out.println(x);

        // !=
        boolean y = 15 != 14;
        System.out.println(y);

        // > < >= <=
        boolean a = 15 >= 14;
        System.out.println(a);


        boolean b = 15 <= 14;
        System.out.println(b);
        System.out.println("================================");
        System.out.println(true != false);
        System.out.println(true == false);
        System.out.println(false == false);
        System.out.println(false != true);
        System.out.println(!false);
        System.out.println(!true);

        //OR ||
        //AND &&
        System.out.println("????????????????????????????");
        System.out.println(true || false || true);
        System.out.println(true && false && true);
        System.out.println(true || false && true);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%");
        int r = 19;
        boolean e = (r > 18 && r % 2 == 0);
        System.out.println(e);


    }
}
