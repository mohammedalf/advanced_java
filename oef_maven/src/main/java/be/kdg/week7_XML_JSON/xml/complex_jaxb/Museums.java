package be.kdg.week7_XML_JSON.xml.complex_jaxb;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "musea")
public class Museums {
    private List<Museum> museumList = new ArrayList<>();

    //elk Museum-object uit de lijst krijgt in XML de tag <museum>
    @XmlElement(name = "museum")
    public void setMuseumList(List<Museum> museumList) {
        this.museumList = museumList;
    }

    public List<Museum> getMuseumList() {
        return museumList;
    }

    public void add(Museum museum) {
        museumList.add(museum);
    }
}
