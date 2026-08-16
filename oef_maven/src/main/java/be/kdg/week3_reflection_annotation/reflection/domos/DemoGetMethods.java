package be.kdg.week3_reflection_annotation.reflection.domos;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class DemoGetMethods {

    public static void main(String[] args) {
        Student student = new Student();
        printMethods(student);
        System.out.println("");
        System.out.println("_________________________________________");
        printConstuctors(student);
        System.out.println("_________________________________________");
        makeAlive(Student.class);

        System.out.println("_________________________________________");
        examineFields(student);
        System.out.println("_________________________________________");
        changeByReflection(student);
    }

    //methoden onderzoeken
    public static void printMethods(Object obj){
        //1. klass ontdekken
        Class aClass = obj.getClass();

        //2. hoeveelheid methoden tonen
        System.out.printf(
                "%d methoden gevonden in de klasse %s:%n",
                aClass.getDeclaredMethods().length,
                aClass.getSimpleName()
        );

        //3. door alle methoden van die klassen lopen
        for (Method method : aClass.getDeclaredMethods()) {
            //4. toon info over iedere mthode
            System.out.printf("%s (returns: %s, parameters: %d)%n",
                    method.getName(),
                    method.getReturnType(),
                    method.getParameterCount()
            );
        }

        //Belangrijk!
        //getDeclaredMethods()
        //        ↓
        //alle methoden uit DEZE klasse
        //ook private
        //geen inherited
        //-------------------------------
        //getMethods()
        //        ↓
        //public methoden
        //ook inherited
        //geen private
    }

    //constuctors onderzoeken
    public static void printConstuctors(Object obj){
        Class aClass = obj.getClass();

        System.out.printf("%d constructors gevonden in de klasse %s:\n",
                aClass.getDeclaredConstructors().length,
                aClass.getName());

        for (Constructor<?> constructor : aClass.getDeclaredConstructors()) {
            System.out.printf("\t%s parameters: %d : ",
                    constructor.getName(),constructor.getParameterCount());

            //per gevonden parameter de naam ervan printen
            for (Class<?> parameterType : constructor.getParameterTypes()) {
                System.out.print(parameterType.getSimpleName() + " ");
            }

        }

        //BELANGRIJK!
        //getConstructors geeft enkel de public constructors
        //getDeclaredConstructors geeft ALLE constructors

    }

    //mrthodes
    public  static void makeAlive(Class aClass){
        try{
            System.out.printf("Nieuw object instantiëren van de klasse %s:\\n",aClass.getName());

            //default constructor oproepen:
            Object obj = aClass.getDeclaredConstructor().newInstance();

            //toon nieuwe aangemaakte object
            System.out.println(obj.toString());

            //zoek ALLE methoden die in deze klasse gedeclareerd
            for (Method method : aClass.getDeclaredMethods()) {
                //we willen alleen gettters
                if (method.getName().startsWith("get")) {
                    //result van de getter | invoke(abj, args) --> bij methode met paramters
                    Object result = method.invoke(obj);
                    System.out.printf("\tResult van %s: %s\n",
                            method.getName(), result);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //fields onderzoeken
    public static void examineFields(Object obj){
        try{
            //de class vragen van de gegeven opbject
            Class aClass = obj.getClass();

            //de naam van de klass tonen
            System.out.printf("Fields van %s:%n",aClass.getName());

            //naam en type van het attribute tonen
            for (Field field : aClass.getDeclaredFields()) {
                System.out.printf(
                        "\"%s\" van het type: %s%n",
                        field.getName(),
                        field.getType()
                );

                //private fields toegangkelijk maken
                field.setAccessible(true);

                //modifier tonen private/public..
                System.out.printf(
                        "\ttoegang: %s%n",
                        Modifier.toString(field.getModifiers())
                );

                //werkelijke waarde tonen
                System.out.printf(
                        "\twaarde: %s%n",
                        field.get(obj)
                );
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    //toegang en wijziging van fields
    public static void changeByReflection(Object obj){
        System.out.println("private fields wijzigen!!!");
        System.out.println("VOOR reflection: " + obj);
        try{
            Class aClass = obj.getClass();
            Field field = aClass.getDeclaredField("studNr");
            field.setAccessible(true);
            field.set(obj, 666);
            field = aClass.getDeclaredField("naam");

            //setAccessible verleent toegang
            //tot een private attributen
            //set wijzigt de waarde van het
            //attribuut
            field.setAccessible(true);
            field.set(obj, "Mephisto");

            System.out.println("NA reflection: " + obj);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
