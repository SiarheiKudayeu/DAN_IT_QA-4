package lesson13.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();
        //Хешсет не гарантирует порядка
        fillSet(hashSet);
        for (String string:hashSet){
            System.out.println(string);
        }
        System.out.println("====================");
        //Линкедхешсет сохраняет порядок
        fillSet(linkedSet);
        for (String string:linkedSet){
            System.out.println(string);
        }
        System.out.println("====================");

        //Трисет упорядочивает по возрастанию
        fillSet(treeSet);
        for (String string:treeSet){
            System.out.println(string);
        }
        System.out.println("====================");


    }

    public static void fillSet(Set<String> set){
        set.add("автомобиль");
        set.add("машина");
        set.add("вертолет");
        set.add("аэробус");
        set.add("бэтмобиль");
        set.add("самолет");
        set.add("кораблик");
    }
}