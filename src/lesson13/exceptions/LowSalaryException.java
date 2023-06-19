package lesson13.exceptions;

public class LowSalaryException extends Exception {
    public String getMessage() {
        return "Денег не достаточно!!!";
    }
}
