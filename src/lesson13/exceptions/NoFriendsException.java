package lesson13.exceptions;

public class NoFriendsException extends Exception{
    public String getMessage(){
        return "Ты одинок. Увы, это так...";
    }
}
