package lesson9;

public class Main2 {
    public static void main(String[] args) {
        Auto mercedes = new Auto("mercedes", false, 3000);
        Auto renault = new Auto(true, "renault", 500);
        Auto opel = new Auto("opel", 700);

        System.out.println();
        System.out.println(opel);
        System.out.println();
        System.out.println(renault);
        System.out.println();
        System.out.println(mercedes);

        String auto = String.valueOf(opel);
        System.out.println(auto);
        System.out.println();

        Auto2 auto2 = new Auto2("BMW", true, 3000);
        System.out.println(auto2);
    }
}
