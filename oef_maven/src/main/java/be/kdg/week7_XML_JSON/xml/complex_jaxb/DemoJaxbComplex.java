package be.kdg.week7_XML_JSON.xml.complex_jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

public class DemoJaxbComplex {
    public static void main(String[] args) throws JAXBException {

        //maak Exhibition-objecten
        Exhibition permanent = new Exhibition(
                "Vaste collectie",
                LocalDate.of(2024, 1, 1),
                LocalDate.of(2026, 12, 31),
                List.of("Kunstenaar A", "Kunstenaar B")
        );


        Exhibition special = new Exhibition(
                "Speciale tentoonstelling",
                LocalDate.of(2026, 8, 1),
                LocalDate.of(2026, 10, 1),
                List.of("Kunstenaar C")
        );


        //maak een Museum-object
        Museum museum = new Museum(
                "MAS",
                "Antwerpen",
                true,
                permanent,
                special
        );


        //stop Museum in de multiklasse Museums
        Museums museums = new Museums();

        museums.add(museum);

        //JAXBContext maken
        JAXBContext context = JAXBContext.newInstance(Museums.class);


        //marshaller:
        //java naar XML
        Marshaller marshaller = context.createMarshaller();


        // XML mooi inspringen
        marshaller.setProperty(
                Marshaller.JAXB_FORMATTED_OUTPUT,
                true
        );


        //schrijf naar bestand
        marshaller.marshal(museums, new File("museums.xml"));

        System.out.println("museums.xml aangemaakt");
    }

}
