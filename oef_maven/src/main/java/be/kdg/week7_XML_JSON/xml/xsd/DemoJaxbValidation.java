package be.kdg.week7_XML_JSON.xml.xsd;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class DemoJaxbValidation {
    public static void main(String[] args) throws SAXException , JAXBException {
        SchemaFactory sf = SchemaFactory.newInstance(
                XMLConstants.W3C_XML_SCHEMA_NS_URI
        );

        //xsd bestand lezen
        Schema schema = sf.newSchema(new File("customer.xsd"));

        //jaxb klaar maken voor de klasse
        JAXBContext context = JAXBContext.newInstance(Customer.class);

        //unmarshalar
        //xml --> java
        Unmarshaller unmarshaller = context.createUnmarshaller();

        //xsd schema koppelen aan de unmashaller
        unmarshaller.setSchema(schema);

        //wat moet er gebeuren als xml niet valid is
        unmarshaller.setEventHandler(event -> {

            //toon de validatiefout
            System.out.println(
                    "Validatiefout: " + event.getMessage()
            );

            //true = JAXB mag verdergaan
            //false = JAXB stopt
            return true;
        });

        //lees input.xml in
        //eerst wordt het bestand gecontroleerd tegen cunsomer.xsd daarna de consumer object gemaakt
        Customer customer = (Customer) unmarshaller.unmarshal(new File("input.xml"));

        //toon het ingelezen object
        System.out.println(customer);


    }
}
