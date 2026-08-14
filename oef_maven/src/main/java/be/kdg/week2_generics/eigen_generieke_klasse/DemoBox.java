package be.kdg.week2_generics.eigen_generieke_klasse;

public class DemoBox {
    public static void main(String[] args) {
        Box<String> box = new Box<>();

        box.add("Hello");
        box.add("World");
        System.out.println(box);

        Box<Integer> integerBox = new Box<>();
        integerBox.add(10);
        integerBox.add(20);
        System.out.println(integerBox);

        Box generalBox = new Box<>();
        generalBox.add(1.85);
        generalBox.add("is mijn lengte");
        System.out.println(generalBox);
    }
}
