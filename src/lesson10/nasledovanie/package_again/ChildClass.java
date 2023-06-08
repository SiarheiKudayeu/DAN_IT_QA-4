package lesson10.nasledovanie.package_again;

public class ChildClass extends ParentClass{
    public ChildClass(String name, int age) {
        super(name, age);
    }

    public void whoAmILikeAParent(){
        super.whoAmI();
    }
    @Override
    public void whoAmI(){
        System.out.println("I am a child");
    }
}
