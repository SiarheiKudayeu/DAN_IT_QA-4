package lesson7.manyArrays;

public class ManyArrays {
    public static void main(String[] args) {
        //двумерный массив
        Person[] people = new Person[3];
        people[0] = new Person(30, "Bob");
        people[1] = new Person(25, "Alona");
        people[2] = new Person(45, "Danilo");

        String[][] numbers = new String[3][4];
        numbers[0][1] = "Number";

        String[][] numbers2 = {
                {"One", "Two", "Three", "add"},
                {"Four", "Five", "Six", "add"},
                {"Seven", "Eight", "Nine", "asd"}
        };
        System.out.println(numbers2[1][2]);

        int[][][] numbers3 = new int[2][2][2];

        int[][][] numbers4 = {
                {
                        {3, 5},
                        {3, 7}
                },
                {
                        {4, 8},
                        {12, 76}
                }

        };


    }
}
