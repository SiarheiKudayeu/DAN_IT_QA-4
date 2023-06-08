package lesson10.nasledovanie.package_firs;

public class Messenger {
    public Messenger(String name, double version) {
        this.name = name;
        this.version = version;
    }
    public Messenger( double version, String name) {
        this.name = name;
        this.version = version;
    }
    public Messenger(){}

    String name;
    public double version;
    public void launch(){
        System.out.println("Ваш Messenger стартанул");
    }
    public void shutDown(){
        System.out.println("Ваш Messenger закрыт");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }
}
