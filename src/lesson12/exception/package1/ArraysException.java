package lesson12.exception.package1;

public class ArraysException extends Exception{
    public String getMessage() {
        return "Индекс не принадлежит массиву";
    }
}
