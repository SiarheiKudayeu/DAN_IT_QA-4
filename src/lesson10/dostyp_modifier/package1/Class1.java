package lesson10.dostyp_modifier.package1;

public class Class1 {
    public String publicString = "publicString";
    private static String privateString = "privateString";
    protected String protectedString = "protectedString";
    String defaultString = "defaultString";

    public static String privateString(){
        return privateString;
    }

    public static void main(String[] args) {
        Class1 class1 = new Class1();
        System.out.println(class1.publicString);
        System.out.println(class1.protectedString);
        System.out.println(class1.defaultString);
        System.out.println(class1.privateString);
    }
}
