package be.kdg.week7_XML_JSON.xml.complex_jaxb;

import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(propOrder = {"name", "city", "permanent", "special"})
public class Museum {
    private String name;
    private String city;

    //een attribuut van <museum>;
    private Boolean childrenAllowed;

    //een museum bevat twee Exhibition-objecten
    private Exhibition permanent;
    private Exhibition special;

    public Museum() {
    }

    public Museum(String name, String city, Boolean childrenAllowed, Exhibition permanent, Exhibition special) {
        this.name = name;
        this.city = city;
        this.childrenAllowed = childrenAllowed;
        this.permanent = permanent;
        this.special = special;
    }
    // <museum children-allowed="true">
    @XmlAttribute(name = "children-allowed")
    public void setChildrenAllowed(Boolean childrenAllowed) {
        this.childrenAllowed = childrenAllowed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getChildrenAllowed() {
        return childrenAllowed;
    }

    public Exhibition getPermanent() {
        return permanent;
    }

    public void setPermanent(Exhibition permanent) {
        this.permanent = permanent;
    }

    public Exhibition getSpecial() {
        return special;
    }

    public void setSpecial(Exhibition special) {
        this.special = special;
    }
}