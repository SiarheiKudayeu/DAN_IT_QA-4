package lesson13.collections;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapEx {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        //не имеет порядка
        fillMap(hashMap);
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("=========================");


        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        //сохраняет порядок
        fillMap(linkedHashMap);
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("=========================");

        Map<Integer, String> treeMap = new TreeMap<>();
        //сортирует по ключу
        fillMap(treeMap);
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        System.out.println("=========================");

        Map<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("Key","Value");
        hashMap2.put("Key2","Value2");
        System.out.println(hashMap2);
    }
    public static void fillMap(Map<Integer, String> map){
        map.put(7, "Леонид");
        map.put(2, "Мария");
        map.put(3, "Степан");
        map.put(45, "Игорь");
        map.put(5, "Алена");
        map.put(6, "Фефофан");
        map.put(44, "Глебс");
        map.put(8, "Сардина");
        map.put(19, "Ким");
        map.put(4, "Арнольд");

    }
}
