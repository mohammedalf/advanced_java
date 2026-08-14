package be.kdg.week1_herhaling.herhaling.overervinv2.specialisatie;

public class Student extends Persoon{
    private int  nummer;


    public Student(String naam, int nummer) {
        super(naam);
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
