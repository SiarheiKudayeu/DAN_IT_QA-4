package lesson8;

public class Animal {
    public String name;
    public String type;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void getInfo() {
        System.out.println("Возраст " + getType() + " равен: " + getAge());
        System.out.println("Имя " + getType() + " равно: " + getName());
    }


    public void makeSound() {
        System.out.println("Я издаю звук");
    }

}
