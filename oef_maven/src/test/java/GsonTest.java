import be.kdg.week7_XML_JSON.json.Box;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GsonTest {

    @Test
    void box2String2Box() {
        //Gson builder
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        //java object maken
        Box box = new Box(10,20,30);

        System.out.println("----------------------------json naar string----------------------------");
        //java object naar string
        String jsonString = gson.toJson(box);


        //json tonen
        System.out.println("Serialised: \n" + jsonString);

        System.out.println("------------------String naar json-----------------------------");

        Box otherBox = gson.fromJson(jsonString, Box.class);

        //tonen
        System.out.println("Deserialised: " + otherBox);

        //vergelijken
        assertEquals(box, otherBox,"Not same box");





    }
}
