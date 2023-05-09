package lesson1.package1;

import java.util.Random;

public class StartJava {
    //CTRL+ALT+L windows реформат кода
    //Command+Options+L Mac реформат кода
    public static void main(String[] args) {
        System.out.println("Hello all QA-4");
        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println((int) (Math.random() * 100) - 50);
    }
}
