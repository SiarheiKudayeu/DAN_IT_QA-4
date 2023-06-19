package lesson13.exceptions;

public class NotWeekEndException extends  Exception{
    public String getMessage(){
        return "Сегодня будний день, иди работай!!!";
    }
}
