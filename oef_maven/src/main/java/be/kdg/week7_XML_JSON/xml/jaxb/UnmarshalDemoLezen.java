package be.kdg.week7_XML_JSON.xml.jaxb;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class UnmarshalDemoLezen {
    public static void main(String[] args) {

        try {
            JAXBContext jc = JAXBContext.newInstance(Product.class);
            Unmarshaller u = jc.createUnmarshaller();

            File f = new File("product.xml");

            Product product = (Product) u.unmarshal(f);
            System.out.println(product);

        }catch (JAXBException e){
            e.printStackTrace();
        }

    }
}
