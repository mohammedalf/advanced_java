package be.kdg.week7_XML_JSON.xml.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DemoDOMLezen {
    public static void main(String[] args) throws Exception {
        String file = "simpsons.xml";

        DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        //lezen
        Document doc = builder.parse(new File(file));

        //haal rootelement op
        Element rootElement = doc.getDocumentElement();

        //haal alle kinderen op
        NodeList personNodes = rootElement.getChildNodes();

        for (int i = 0; i < personNodes.getLength(); i++) {

            //enkel echte xml element anders continue
            if (personNodes.item(i).getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            //bij echte element
            Element e = (Element) personNodes.item(i);

            //Lees het attribuut van <person>
            System.out.println("Attr: " + e.getAttribute("roll-no"));

            //Zoek binnen <person> naar <firstname>...</firstname>
            // item(0) = neem de eerste firstname die gevonden wordt
            Element firstname = (Element) e.getElementsByTagName("firstname").item(0);
            Element lastName = (Element) e.getElementsByTagName("lastname").item(0);

            //lees de tekst binnen de tags
            System.out.println("Firstname: " + firstname.getTextContent());
            System.out.println("Lastname: " + lastName.getTextContent());
        }
    }
}
