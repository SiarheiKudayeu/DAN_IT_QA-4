package lesson12.exception.package1;

public class UnderZeroException extends Exception {
    public String getMessage() {
        return "Получено отрицательное число";
    }
}
