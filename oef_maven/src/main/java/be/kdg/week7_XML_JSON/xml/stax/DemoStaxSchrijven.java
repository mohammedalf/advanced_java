package be.kdg.week7_XML_JSON.xml.stax;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class DemoStaxSchrijven {

    public static void main(String[] args) throws XMLStreamException, IOException {
        //bestand aanmaken
        FileWriter file = new FileWriter("simpsons2.xml", StandardCharsets.UTF_8);

        //koppel aan XMLStreamWriter
        XMLStreamWriter xmlStreamWriter = XMLOutputFactory.newInstance().createXMLStreamWriter(file);

        // <?xml version="1.0"?>
        xmlStreamWriter.writeStartDocument();

        // <family>
        xmlStreamWriter.writeStartElement("family");

        // <person>
        xmlStreamWriter.writeStartElement("person");

        // <person roll-no="1">
        xmlStreamWriter.writeAttribute("roll-no", "1");

        // <firstname>
        xmlStreamWriter.writeStartElement("firstname");

        // <firstname>Homer
        xmlStreamWriter.writeCharacters("Homer");

        // </firstname>
        xmlStreamWriter.writeEndElement();

        // </person>
        xmlStreamWriter.writeEndElement();

        // </family>
        xmlStreamWriter.writeEndElement();

        //XML-document beëindigen
        xmlStreamWriter.writeEndDocument();

        //Writer sluiten
        xmlStreamWriter.close();

        System.out.println("XML-bestand aangemaakt.");
    }
}
