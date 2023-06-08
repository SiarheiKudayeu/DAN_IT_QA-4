package lesson10.nasledovanie.package_again;

public class Main {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass("Федя", 12);
        child.whoAmI();
        child.whoAmILikeAParent();
        System.out.println(child.getName());
        child.setName("Алена");
        System.out.println(child.getName());

        ParentClass parent2 = new ChildClass("Sergey",31);
        parent2.whoAmI();
    }
}
