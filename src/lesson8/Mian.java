package lesson8;

public class Mian {
    public static void main(String[] args) {
      /*  Animal cat = new Animal();
        System.out.println(cat.age);
        cat.age = 4;
        cat.name = "Барсик";
        cat.type = "кот";
        System.out.println("Возраст кота равен: "+ cat.age);
        System.out.println("Имя кота равно: "+ cat.name);
        System.out.println("Вид животного: "+ cat.type);
        System.out.println("Как я говорю? ");
        cat.makeSound();*/

        //геттер И сеттер
        Animal dog = new Animal();
        dog.setName("Бобик");
        dog.setType("Собака");
        dog.setAge(13);

        System.out.println(dog.getName() + " " + dog.getType() + " " + dog.getAge());
        dog.getInfo();

    }
}
