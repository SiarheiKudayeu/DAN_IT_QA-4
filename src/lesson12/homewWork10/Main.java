package lesson12.homewWork10;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Milana", "Bach", 23);
        Human father = new Human("Anatoliy","Bach", 25);
        Human child1 = new Human("Danil", "Bach", 12);
        Family family1 = new Family(mother,father, "Bach");
        Human child2 = new Human("Danil", "Bach", 12);
        Human child3 = new Human("Danil", "Bach", 12);
        System.out.println(father.getFamily().getFamilyName());
        System.out.println(family1.countFamily());
        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);
        System.out.println(family1.countFamily());
        family1.deleteChild(1);
        System.out.println(child2.getFamily().getFamilyName());
        System.out.println(family1.countFamily());
    }
}
