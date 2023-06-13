package lesson12.exception.package1;

public class ZeroValue extends Exception{
    public String getMessage() {
        return "Это число ноль";
    }
}
