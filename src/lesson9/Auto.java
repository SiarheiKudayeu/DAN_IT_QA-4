package lesson9;

import java.util.Objects;

public class Auto {
    private String name;
    private int price;
    private boolean isNew;

    private String type;

    public Auto(String name, int price, boolean isNew, String type) {
        this.name = name;
        this.price = price;
        this.isNew = isNew;
        this.type = type;
    }

    public Auto(String name, boolean isNew, int price) {
        this.name = name;
        this.isNew = isNew;
        this.price = price;
    }

    public Auto(boolean isNew, String name, int price) {
        this.name = name;
        this.isNew = isNew;
        this.price = price;
    }

    public Auto(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Auto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNew() {
        return isNew;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public void getInfo() {
        System.out.println("Имя автомобиля " + name);
        System.out.println("Цена автомобиля " + price);
        if (isNew) {
            System.out.println("Автомобиль новый");
        } else {
            System.out.println("Автомобиль б/у");
        }
    }

    @Override
    public String toString() {
        String result;
        if (isNew) {
            result = "Автомобиль новый";
        } else {
            result = "Автомобиль б/у";
        }
        return "Имя автомобиля " + name + "\n" +
                "Цена автомобиля " + price + "\n" +
                result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Objects.equals(name, auto.name) && Objects.equals(type, auto.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type);
    }
}
