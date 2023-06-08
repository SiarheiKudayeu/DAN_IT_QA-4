package lesson10.nasledovanie.package_firs;

public class Telegram extends Messenger {
    public double size;
    public Telegram(String name, double version) {
        super(name, version);
    }
    public Telegram(String name, double version, double size){
        super(name, version);
        this.size = size;
    }
    public void work(){
        super.launch();
        System.out.println("Я работающий телеграм");
        super.shutDown();
    }

    public void makeCalls() {
        System.out.println("Я Телеграм, я могу звонить.");
    }

    @Override
    public void launch() {
        System.out.println("Ваш Telegram стартанул");
    }

    @Override
    public void shutDown() {
        System.out.println("Ваш Telegram закрыт");
    }

}
