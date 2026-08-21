package be.kdg.week6_Persistentie.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePersoon {
    public static void main(String[] args) {
        try (
                FileInputStream fileIn=new FileInputStream("persoon.ser");
                ObjectInputStream in = new ObjectInputStream(fileIn);
                ){
            Persoon persoon = (Persoon) in.readObject();
            System.out.println("Deserialize Persoon...");
            System.out.println("Naam: " + persoon.getNaam());
            System.out.println("Adres: " + persoon.getAdres());
            System.out.println("RRN:"+ persoon.getRijksRegisterNummer());

        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();

        }
    }
}
