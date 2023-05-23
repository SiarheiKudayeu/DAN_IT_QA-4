package lesson8.array_list;

import java.util.ArrayList;
import java.util.Arrays;

public class InfoArrayList {
    public static void main(String[] args) {
        // ArrayList это класс наследуемый от интерфейса List.
        //Это автоматически расширяемый массив, который может содержать элементы любого типа
        //Но в одном ArrayList могут находится только однотипные элементы
        //Мы не можем указывать примитивыне типы данных при создании ArrayList.
        //только их одноименные классы обертки


        //Один из вариантов прямой инициализации значений ArrayList


        //add() - добавление элемента в ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(23);
        arrayList.add(44);
        arrayList.add(7);
        System.out.println(arrayList);

        //toArray() возвращает массив с аналогичными элементами, как и у листа
        //Integer[] intArray = (Integer[]) arrayList.toArray();
        //Добавление элемента на место по индексу
        arrayList.add(0, 23232);
        System.out.println(arrayList);


        //remove() - удаление элемента по индексу
        arrayList.remove(arrayList.size() - 1);
        System.out.println(arrayList);


        //remove() - удаление элемента по значению
        ArrayList<Integer> arraylistInteger = new ArrayList<>(Arrays.asList(23, 44, 24, 634, 3, -3, 434));
        System.out.println(arraylistInteger);

        ArrayList<String> stringArrayList = new ArrayList<>(Arrays.asList("Петя", "Маша", "Алёна", "Федя", "Саша", "Антон", "Глеб"));
        System.out.println(stringArrayList);
        stringArrayList.remove("Федя");
        System.out.println(stringArrayList);


        //set() - позволяет заместить элемент по указанному индексу
        stringArrayList.set(stringArrayList.size()-1,"Федя");
        System.out.println(stringArrayList);
        //get(0) - получение элемента по индексу
        //indexOf() - получение индекса объекта
        //size() возвращает количество элементов в листе
        //indexOf() - если элемент встречается в листе то возвращается индекс,
        //если не встречается, то возвращает -1
        System.out.println(stringArrayList.get(5));
        System.out.println(stringArrayList.indexOf("Алёна"));
        System.out.println(stringArrayList.indexOf("qfascfaf"));


        //contains() - возвращает true, если указанный элемент встречается в листе
        //в противном случае false
        System.out.println(stringArrayList.contains("Федя"));


        //ensureCapacity() - устанавливает по возможности минимально допустимую емкость, но не влияет на текущий размер листа
        //по умолчанию емкость листа 10.
        //Можно задавать емкость при инициализации

        ArrayList<Integer> arrayListCapacity = new ArrayList<>(100);
        arrayListCapacity.add(15);
        arrayListCapacity.add(23);
        arrayListCapacity.add(44);
        arrayListCapacity.add(7);
        arrayListCapacity.trimToSize();
        System.out.println(arrayListCapacity.size());


        //trimToSize() - обрезает емкость экземпляра ArrayList до текущего размера.

    }
}
