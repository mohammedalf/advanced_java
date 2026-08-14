package be.kdg.week2_generics.javadocs.documentatieHTML;


public class Demo {
    public static void main(String[] args) {
        Session session = new Session();

        session.newSession(true);

        System.out.println("Sessie geldig: " + session.isGeldig());
    }
}
