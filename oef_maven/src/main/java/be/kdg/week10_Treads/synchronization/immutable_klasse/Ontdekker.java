package be.kdg.week10_Treads.synchronization.immutable_klasse;

public class Ontdekker {
    private String naamOntdekker;

    public Ontdekker(String naamOntdekker) {
        this.naamOntdekker = naamOntdekker;
    }

    public String getNaamOntdekker() {
        return naamOntdekker;
    }

    public void setNaamOntdekker(String naamOntdekker) {
        this.naamOntdekker = naamOntdekker;
    }
}
