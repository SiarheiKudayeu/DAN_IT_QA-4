package lesson6.foreach;

public class ForEachClass {
    public static void main(String[] args) {
        int[] arrayInt = new int[45];

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = (int) ((Math.random() * 44) - 13);
        }

        for (int number : arrayInt) {
            System.out.print(number + " ");
        }
        System.out.println("");

        String[] arrayString = {"One", "Two", "Three", "Four","Five","Six","Seven"};

        for (String aloneString : arrayString){
            System.out.println(aloneString);
        }
        System.out.println("=========================");

        for (int i = 0; i < arrayString.length; i++){
            System.out.println(arrayString[i]);
        }

    }
}
