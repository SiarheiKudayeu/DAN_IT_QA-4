package lesson9;

public class Auto2 {
    private String name;
    private int price;
    private boolean isNew;

    public Auto2(String name, boolean isNew, int price) {
        this.name = name;
        this.isNew = isNew;
        this.price = price;
    }

    public Auto2(boolean isNew, String name, int price) {
        this.name = name;
        this.isNew = isNew;
        this.price = price;
    }

    public Auto2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Auto2() {
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
        return "Auto2{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", isNew=" + isNew +
                '}';
    }
}
