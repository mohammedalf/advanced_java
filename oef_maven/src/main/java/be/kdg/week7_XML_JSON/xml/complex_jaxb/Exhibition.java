package be.kdg.week7_XML_JSON.xml.complex_jaxb;

import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@XmlType(propOrder = {"name", "artists", "from", "to"})
public class Exhibition {
    private String name;

    private LocalDate from;
    private LocalDate to;

    private List<String> artists = new ArrayList<>();


    public Exhibition() {
    }

    public Exhibition(String name, LocalDate from, LocalDate to, List<String> artists) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.artists = artists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getFrom() {
        return from;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setFrom(LocalDate from) {
        this.from = from;
    }

    public LocalDate getTo() {
        return to;
    }
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    public void setTo(LocalDate to) {
        this.to = to;
    }

    public List<String> getArtists() {
        return artists;
    }

    public void setArtists(List<String> artists) {
        this.artists = artists;
    }
}
