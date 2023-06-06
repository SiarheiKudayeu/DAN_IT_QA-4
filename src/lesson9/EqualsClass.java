package lesson9;

public class EqualsClass {
    public static void main(String[] args) {
    /*    Auto mercedes = new Auto("mercedes", false, 3000);
        Auto mercedes2 = new Auto("mercedes", false, 3000);
        System.out.println(mercedes2.equals(mercedes));
        System.out.println(mercedes.hashCode());
        System.out.println(mercedes2.hashCode());*/

        Auto renault1 = new Auto("renult", 4000, true, "Logan");
        Auto renault2 = new Auto("renult", 3000, false, "Logan");
        System.out.println(renault1.equals(renault2));
        System.out.println(renault1.hashCode());
        System.out.println(renault2.hashCode());
    }
}
