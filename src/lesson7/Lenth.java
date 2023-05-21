package lesson7;

import java.util.ArrayList;
import java.util.Arrays;

public class Lenth {
    public static void main(String[] args) {
        //отличие .length(), .length, .size().
        String string ="Просто строка";
        String [] strings = {"GFirst","Gsecond","Gthird"};
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList("vsdvsdv","advadv"));
        stringList.add("First");

        System.out.println(string.length());
        System.out.println(strings.length);
        System.out.println(stringList.size());
    }
}
