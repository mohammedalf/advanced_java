package be.kdg.week7_XML_JSON.xml.complex_jaxb;

import jakarta.xml.bind.annotation.adapters.XmlAdapter;

import java.time.LocalDate;

public class LocalDateAdapter  extends XmlAdapter<String, LocalDate>  {
    @Override
    public LocalDate unmarshal(String string) throws Exception {
        return LocalDate.parse(string);
    }

    @Override
    public String marshal(LocalDate localDate) throws Exception {
        return localDate.toString();
    }
}
