package lesson9.constructorTask;

public class Auto {
    public Auto(String name, int cost, int currentDistance, int lastToDistance, int futureToDistance) {
        this.name = name;
        this.cost = cost;
        this.currentDistance = currentDistance;
        this.lastToDistance = lastToDistance;
        this.futureToDistance = futureToDistance;
    }

    /*   У каждого автомобиля есть цена, назавание, текущий пробег, пробег на момент финального ТО,
        и расстояние, после проезда которго автомобиль должен проходить ТО.*/
    private String name;
    private int cost;
    private int currentDistance;
    private  int lastToDistance;
    private int futureToDistance;

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

    public int getCurrentDistance() {
        return currentDistance;
    }

    public void setCurrentDistance(int currentDistance) {
        this.currentDistance = currentDistance;
    }

    public int getLastToDistance() {
        return lastToDistance;
    }

    public void setLastToDistance(int lastToDistance) {
        this.lastToDistance = lastToDistance;
    }

    public int getFutureToDistance() {
        return futureToDistance;
    }

    public void setFutureToDistance(int futureToDistance) {
        this.futureToDistance = futureToDistance;
    }
}
