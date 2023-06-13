package lesson12.homewWork10;

public class Human {
    private String name;
    private String surname;
     private int age;

    public Human(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    private Family family;

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }
}
