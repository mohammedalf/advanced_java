package be.kdg.week4_lambda_streams.building_blocks;



public class Artikel {

    private int nummer;
    private String merk;
    private String model;
    private double prijs;

    public Artikel(int nummer, String merk, String model, double prijs) {
        this.nummer = nummer;
        this.merk = merk;
        this.model = model;
        this.prijs = prijs;
    }

    public int getNummer() {
        return nummer;
    }

    public String getMerk() {
        return merk;
    }

    public String getModel() {
        return model;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return merk + " " + model + " - €" + prijs;
    }


}
