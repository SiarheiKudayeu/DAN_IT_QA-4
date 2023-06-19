package lesson13.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        //Заполнение элементами
        long start = System.currentTimeMillis();
        addElement(linkedList);
        long finish = System.currentTimeMillis();
        System.out.println("Time to fill linkedList " + (finish - start));

        long start2 = System.currentTimeMillis();
        addElement(arrayList);
        long finish2 = System.currentTimeMillis();
        System.out.println("Time to fill arrayList " + (finish2 - start2));

        //Получение элемента
        long start3 = System.currentTimeMillis();
        getElement(linkedList);
        long finish3 = System.currentTimeMillis();
        System.out.println("Time to get linkedList " + (finish3 - start3));

        long start4 = System.currentTimeMillis();
        getElement(arrayList);
        long finish4 = System.currentTimeMillis();
        System.out.println("Time to get arrayList " + (finish4 - start4));

        //Добавление элемента в середину коллекции
        long start5 = System.currentTimeMillis();
        addElementMiddle(linkedList);
        long finish5 = System.currentTimeMillis();
        System.out.println("Time to add element in the middle of linkedList " + (finish5 - start5));

        long start6 = System.currentTimeMillis();
        addElementMiddle(arrayList);
        long finish6 = System.currentTimeMillis();
        System.out.println("Time to add element in the middle of arrayList " + (finish6 - start6));

    }


/*    [1,3,4,5,13,352,23523,3243] //LinkedList

    [1,3,4,5,13,352,23523,3243] //ArrayList*/

    public static void addElement(List<Integer> list) {
        for (int i = 0; i < 10000000; i++) {
            list.add(i);
        }
    }
    public static void getElement(List<Integer> list) {
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }
    public static void addElementMiddle(List<Integer> list) {
        for (int i = 0; i < 100; i++) {
            list.add(15,i);
        }
    }

}
