package lesson11.abstractClasses.ex1;

public abstract class Vehicles {
    public Vehicles() {
    }

    public String name;
    public int cost;

    public Vehicles(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    abstract void move();

    abstract void typeofFuel();
}
