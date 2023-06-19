package lesson13.enums.ex1;

public class Main {
    public void startProgramWithSelectedPlatform(Platforms platforms){
        if(platforms.equals(Platforms.ANDROID)){
            System.out.println("Открываем наше андроид приложение");
        } else if (platforms.equals(Platforms.IOS)){
            System.out.println("Открываем наше айос приложение");
        } else {
            System.out.println("Некорректная платформа");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.startProgramWithSelectedPlatform(Platforms.ANDROID);
        main.startProgramWithSelectedPlatform(Platforms.IOS);
        main.startProgramWithSelectedPlatform(Platforms.WRONG_PLATFORM);
        System.out.println(Platforms.ANDROID);
    }
}
