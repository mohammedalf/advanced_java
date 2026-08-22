package be.kdg.week7_XML_JSON.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class DemoDOMSchrijven {
    public static void main(String[] args) throws Exception {
        //object aanmaken
        Person person = new Person("Mohammed", "Al Farisi");

        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();

        Element rootElement = doc.createElement("family");
        doc.appendChild(rootElement);

        Element personElement = doc.createElement("person");
        personElement.setAttribute("roll-no", "1");
        rootElement.appendChild(personElement);

        Element firstnameElement = doc.createElement("firstname");
        firstnameElement.setTextContent(person.getFirstName());
        personElement.appendChild(firstnameElement);

        Element lastnameElement = doc.createElement("lastname");
        lastnameElement.setTextContent(person.getLastName());
        personElement.appendChild(lastnameElement);

        //maak van de dom boom een DOMSource
        DOMSource src = new DOMSource(doc);
        //dom boom boom omzetten naar een echte xml
        Transformer xf = TransformerFactory.newInstance().newTransformer();

        //schrijf de dom boom naar een bestand
        xf.transform(
                src,
                new StreamResult(new File("simpsons.xml")
                        )
        );



    }
}
