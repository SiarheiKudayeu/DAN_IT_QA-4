package lesson10.nasledovanie.package_again;

public class ParentClass {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ParentClass(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public ParentClass(){}

    public void whoAmI(){
        System.out.println("I am a parent");
    }
}
