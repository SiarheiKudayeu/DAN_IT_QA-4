package lesson7.manyArrays;

public class Test {
    public static void main(String[] args) {
        String[][] name = new String[3][3];
        name[0][0] = "Alla";
        name[0][1] = "Dima";
        name[0][2] = "Ira";
        name[1][0] = "Artem";
        name[1][1] = "Anya";
        name[1][2] = "Kirill";
        name[2][0] = "Petya";
        name[2][1] = "Jenya";
        name[2][2] = "Lena";

        String[][] name2 = {
                {"Alla", "Dima", "Ira"},
                {"Artem", "Anya", "Kirill"},
                {"Petya", "Jenya", "Lena"}
        };

        String[][] name3 = {
                {"Alla", "Dima", "Ira", "Alona", "Siarhei"},
                {"Artem", "Anya"},
                {"Petya", "Jenya", "Lena"}
        };

        String[][] name4 = new String[3][];

        for (int i = 0; i < name3.length; i++) {
            for (int a = 0; a < name3[i].length; a++) {
                System.out.print(name3[i][a] + ", ");
            }
            System.out.print("\b\b");
            System.out.println();
        }
        System.out.println("==========================");

        for (String[] singleArray: name3){
            for (String text: singleArray){
                System.out.print(text + ", ");
            }
            System.out.print("\b\b");
            System.out.println();
        }

        System.out.println("==========================");

        for (String[] singleArray: name4){
            for (String text: singleArray){
                System.out.print(text + ", ");
            }
            System.out.print("\b\b");
            System.out.println();
        }

    }
}
