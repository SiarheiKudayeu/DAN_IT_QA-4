package lesson11.Task;

import java.util.Arrays;

public class Remember {
    public static void main(String[] args) {
        String text = "reschedule [day of the week";
        String[] word = text.split("\\s");
        System.out.println(word[3]);
        System.out.println(Arrays.toString(word));

    }
}
