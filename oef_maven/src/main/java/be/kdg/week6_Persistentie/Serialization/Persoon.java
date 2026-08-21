package be.kdg.week6_Persistentie.Serialization;

import java.io.Serial;
import java.io.Serializable;

public class Persoon implements Serializable {
    private String naam;
    private String adres;
    private long rijksRegisterNummer;
    private transient double loon;

    @Serial
    private static final long serialVersionUID = 1L;

    public Persoon(String naam, String adres, long rijksRegisterNummer, double loon) {
        this.naam = naam;
        this.adres = adres;
        this.rijksRegisterNummer = rijksRegisterNummer;
        this.loon = loon;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public long getRijksRegisterNummer() {
        return rijksRegisterNummer;
    }

    public void setRijksRegisterNummer(long rijksRegisterNummer) {
        this.rijksRegisterNummer = rijksRegisterNummer;
    }

    public double getLoon() {
        return loon;
    }

    public void setLoon(double loon) {
        this.loon = loon;
    }
}
