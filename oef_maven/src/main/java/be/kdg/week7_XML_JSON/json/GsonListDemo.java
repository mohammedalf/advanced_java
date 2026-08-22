package be.kdg.week7_XML_JSON.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.util.ISO8601Utils;

import java.io.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class GsonListDemo {

    public static void main(String[] args) {


        List<Person> family = Arrays.asList(
                new Person("Homer", "Simpson", 45),
                new Person("Marge", "Simpson", 42),
                new Person("Bart", "Simpson", 10),
                new Person("Lisa", "Simpson", 8),
                new Person("Maggie", "Simpson", 1)
        );

        //gsonbuilder
        GsonBuilder gsonBuilder = new GsonBuilder();

        //gebruik localdateadapter
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateGsonAdapter().nullSafe());

        //mooi formatteren
        Gson gson = gsonBuilder.setPrettyPrinting().create();

        System.out.println("-----------------------------LIST -> JSON -> FILE-------------------------------");
        //List<Person> naar json string
        String jsonString = gson.toJson(family);

        System.out.println("Serialized: \n"+jsonString);

        //json naar echte bestand
        try(FileWriter jsonWriter = new FileWriter("family.json");){
            jsonWriter.write(jsonString);
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("-----------------------file → JSON → array → List------------------------");

        try(BufferedReader jsonReader = new BufferedReader(new FileReader("family.json"));){
            //JSON naar Person[]
            Person[] familyArray = gson.fromJson(jsonReader,Person[].class);

            //Person[] naar List
            List<Person> familyList = Arrays.asList(familyArray);

            //ingelezen objecten printen
            System.out.println("Deserialized: ");
            familyList.forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }



    }



}
