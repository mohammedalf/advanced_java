package be.kdg.week2_generics.probleem_zonder_generics.probleem;

public class OverloadedMethods {

    public static void printArray(Integer[] array) {
        for (Integer element : array) {
            System.out.println(element);
        }
    }

    public static void printArray(Double[] array) {
        for (Double element : array) {
            System.out.println(element);
        }
    }

    public static void printArray(String[] array) {
        for (String element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        String[] strArray = {"Just", "Another", "Day"};

        printArray(intArray);
        printArray(doubleArray);
        printArray(strArray);
    }
}
