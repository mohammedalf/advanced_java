package be.kdg.week2_generics.probleem_zonder_generics.oplossing;

public class GenericMethodDemo {

    public static <E> void printArray(E[] inputArray){
        for (E e : inputArray) {
            System.out.println(e);
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
