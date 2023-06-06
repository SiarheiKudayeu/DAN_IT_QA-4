package lesson9;

public class Main {
    public static void main(String[] args) {
        Auto mercedes = new Auto("mercedes", false, 3000);
        Auto renault = new Auto(true, "renault", 500);
        Auto opel = new Auto("opel", 700);

        System.out.println(mercedes.getName());
        System.out.println(renault.getName());
        System.out.println(opel.getName());

        mercedes.getInfo();
        System.out.println();
        renault.getInfo();
        System.out.println();
        opel.getInfo();

        System.out.println();
        System.out.println(opel);
        System.out.println();
        System.out.println(renault);
        System.out.println();
        System.out.println(mercedes);
    }
}
