package lesson12.exception.package2;

public class UnderZeroException extends Exception {
    public String getMessage() {
        return "Получено отрицательное число";
    }
}
