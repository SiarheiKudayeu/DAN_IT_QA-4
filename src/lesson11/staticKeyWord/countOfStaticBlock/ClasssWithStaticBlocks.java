package lesson11.staticKeyWord.countOfStaticBlock;

public class ClasssWithStaticBlocks {
    static int counter;

    static {
        counter++;
        System.out.println("Это статический блок под номером "+counter);
    }
    static {
        counter++;
        System.out.println("Это статический блок под номером "+counter);
    }
    static {
        counter++;
        System.out.println("Это статический блок под номером "+counter);
    }
    static {
        counter++;
        System.out.println("Это статический блок под номером "+counter);
    }
    static {
        counter++;
        System.out.println("Это статический блок под номером "+counter);
    }
    static {
        counter++;
        System.out.println("Это статический блок под номером "+counter);
    }
}
