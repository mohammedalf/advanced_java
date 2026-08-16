package be.kdg.week3_reflection_annotation.reflection.getclass_from_instance;

public class Demo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();

        //omdat uiteindelijk iedere normale Java-klasse van Object afstamt
        //probleem hier: je moet de klasse kennen
        System.out.println(rect instanceof Object);
        System.out.println(rect instanceof Rectangle);
        
        //oplossing
        //MANIER 1 op basis van object instantie
        Class clazz = rect.getClass();

        System.out.println( clazz.getName());

        //manier 2 op basis van class
        Class clazz2 = Rectangle.class;
        System.out.println( clazz2);

        //MANIER 3 ik heb alleen de naam als string
        try{
            Class clazz3 = Class.forName("be.kdg.week3_reflection_annotation.reflection.getclass_from_instance.Rectangle");
            System.out.println(clazz3.getName());
        } catch (ClassNotFoundException e) {

            System.out.println("klass niet gevonden");
        }
//        Class clazz3 = Class.forName("be.kdg.week3_reflection_annotation.reflection.getclass_from_instance.Rectangle");


        //werkt ook met primitieve types
        Class primitiveClass = int.class;

        System.out.println(
                primitiveClass.getName()
        );


    }

}
