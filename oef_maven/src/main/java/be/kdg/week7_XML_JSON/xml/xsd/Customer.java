package be.kdg.week7_XML_JSON.xml.xsd;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement(name = "customer")
public class Customer {
    private String name;
    private List<String> phoneNumbers;

    // JAXB heeft een lege constructor nodig
    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    // XML gebruikt <phone-number>
    @XmlElement(name = "phone-number")
    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
