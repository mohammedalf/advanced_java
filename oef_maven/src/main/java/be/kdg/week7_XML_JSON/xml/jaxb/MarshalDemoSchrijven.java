package be.kdg.week7_XML_JSON.xml.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

import java.io.File;

public class MarshalDemoSchrijven {
    public static void main(String[] args) throws JAXBException {

        JAXBContext context = JAXBContext.newInstance(Product.class)
                ;
        Marshaller m = context.createMarshaller();
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        Product product=new Product("W11","Widget Number One", 300.0);

//        m.marshal(product,System.out);
        m.marshal(product,new File("product.xml"));
        System.out.println("File created");
    }
}
