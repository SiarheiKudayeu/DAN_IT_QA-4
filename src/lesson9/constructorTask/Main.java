package lesson9.constructorTask;

public class Main {
    public static void main(String[] args) {
        Servis servis = new Servis("Шаловливая компрессия");
        servis.readyForService(new Contract(12345, new Human("Ivan",
                new Auto("Renault", 2000, 22100, 15000, 25000))),
                new City("Киев",100000));
    }
}
