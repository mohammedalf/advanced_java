package be.kdg.week6_Persistentie.jdbc;

public class Student {
    private int id;
    private String naam;
    private double score;

    public Student(int id, String naam, double score) {
        this.id = id;
        this.naam = naam;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                ", score=" + score +
                '}';
    }
}
