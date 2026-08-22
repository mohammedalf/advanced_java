package be.kdg.week7_XML_JSON.xml.stax;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;


public class DemoStaxLezen {

    public static void main(String[] args) throws IOException, XMLStreamException {

        //xml reader aanmaken
        XMLEventReader eventReader = XMLInputFactory.newInstance().createXMLEventReader(new FileReader("simpsons2.xml", StandardCharsets.UTF_8));
        while (eventReader.hasNext()) {
            XMLEvent event = eventReader.nextEvent();
            switch(event.getEventType()){
                case XMLStreamConstants.START_ELEMENT:
                    //zet het event om naar een StartElement
                    StartElement startElement = event.asStartElement();
                    //haal de naam van de tag op bijv: "family", "person", "firstname"
                    String tagName = startElement.getName().getLocalPart();
                    System.out.println("Starttag: " + tagName);
                    //haal eventuele attributen van deze starttag op
                    Iterator<Attribute> attributes = startElement.getAttributes();

                    // Alleen lezen wanneer er effectief een attribuut is
                    if (attributes.hasNext()) {
                        Attribute attribute = attributes.next();
                        // Geeft bijvoorbeeld "1"
                        String rollNo = attribute.getValue();
                        System.out.println("Attribuut: " + rollNo);
                    }
                    break;

                case XMLStreamConstants.CHARACTERS:

                    Characters characters = event.asCharacters();

                    //witruimte/enters niet afdrukken
                    if (!characters.isWhiteSpace()) {

                        System.out.println(
                                "Tekst: " + characters.getData()
                        );
                    }
                    break;

            }
        }
        eventReader.close();
    }
}
