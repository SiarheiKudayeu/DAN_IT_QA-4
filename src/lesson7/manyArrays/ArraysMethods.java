package lesson7.manyArrays;

public class ArraysMethods {

    static void minArrayValue(int[] arrayInt4) {
        int minValue = arrayInt4[0];
        for (int i = 0; i < arrayInt4.length; i++) {
            if (arrayInt4[i] < minValue) {
                minValue = arrayInt4[i];
            }
        }
        System.out.println("\n" + "Minimum value is: " + minValue);
    }

    static void arraysSort(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            int min;
            for (int a = i + 1; a < elements.length; a++) {
                if (elements[i] > elements[a]) {
                    min = elements[a];
                    elements[a] = elements[i];
                    elements[i] = min;
                }
            }
        }
    }

    static void displayArray(int[] array) {
        for (int number : array) {
            System.out.print(number + " ");
        }
    }


    public static void main(String[] args) {
        int[] array = {12, 232, 4, 54, 1, 253, 5};

        minArrayValue(array);

        arraysSort(array);

        displayArray(array);

    }
}
