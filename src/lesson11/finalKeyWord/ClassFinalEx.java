package lesson11.finalKeyWord;

public class ClassFinalEx {
    public final int finalInt = 33;

    public final void finalMethod(){
        System.out.println("Final Method");
    }

    public static void main(String[] args) {
        ClassFinalEx ex = new ClassFinalEx();
        ex.finalMethod();
        //ex.finalInt = 43;
    }
}
