package be.kdg.week6_Persistentie.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoSerialization {

    public static void main(String[] args) {
        Persoon persoon = new Persoon("Joske Vermeulen", "Kuiperskaai 16, 9000 Gent", 93051822361L, 3521.87);
        try (
                FileOutputStream fileOut = new FileOutputStream("persoon.ser");

                ObjectOutputStream out = new ObjectOutputStream(fileOut)
        ) {

            out.writeObject(persoon);

            System.out.println("Opgeslagen in 'persoon.ser'");

        } catch (IOException ex) {
            System.out.println("Fout: " + ex.getMessage());
        }



    }
}
