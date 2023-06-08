package lesson10.dostyp_modifier.package2;

import lesson10.dostyp_modifier.package1.Class1;

public class Class4 extends Class1 {

    public void print() {
        System.out.println(publicString);
        System.out.println(protectedString);
    }

    public static void main(String[] args) {
        Class4 class15= new Class4();
        System.out.println(class15.protectedString);
        class15.print();
    }
}
