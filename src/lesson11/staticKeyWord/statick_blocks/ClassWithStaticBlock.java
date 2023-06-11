package lesson11.staticKeyWord.statick_blocks;

public class ClassWithStaticBlock {
    static String day;

    static void whatDay() {
        System.out.println("Today is " + day);
    }

    static {
        day = "Sunday";
        System.out.println(day);
    }
    static {
        day = "Monday";
    }
}
