package be.kdg.week2_generics.javadocs.documentatieHTML;

public class Session {

    private boolean geldig;


    /**
     * Maakt een <b>nieuwe</b> sessie.
     *
     * @param status <i>true</i> voor een geldige sessie,
     *               <i>false</i> voor een ongeldige sessie
     */
    public void newSession(boolean status) {
        geldig = status;
    }


    /**
     * Geeft aan of de sessie geldig is.
     *
     * <pre>
     * voorbeeld:
     *
     * Session session = new Session();
     * session.newSession(true);
     * System.out.println(session.isGeldig());
     * </pre>
     * @return true als de sessie geldig is
     */
    public boolean isGeldig() {
        return geldig;
    }
}
