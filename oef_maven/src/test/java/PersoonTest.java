import be.kdg.week5_Testen_Logging.testing.Persoon;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

//
import static org.junit.jupiter.api.Assertions.*;

public class PersoonTest {
    private static Persoon pers1;
    private static Persoon pers2;

    @BeforeAll
    public static void init() {

        pers1 = new Persoon("liesa");

        pers2 = new Persoon("elisa");
    }

    // equals testen
    @Test
    public void testEquals() {

        assertEquals(pers1, pers2, "De personen moeten gelijk zijn");

        // Ander object maar dezelfde naam
        assertTrue(pers1.equals(new Persoon("liesa")), "De personen moeten gelijk zijn");

        // Verschillende naam
        assertFalse(pers1.equals(pers2), "De personen moeten verschillen");

        // Vergelijken met null
        assertFalse(pers1.equals(null), "Vergelijken met null moet false geven");

        // Vergelijken met ander type
        assertFalse(pers1.equals(Integer.valueOf(1)), "Vergelijken met een ander type moet false geven");
    }

    //hashcode testen
    @Test
    public void testHashcode() {
        int hashcode1 = pers1.hashCode();

        Persoon persoon = new Persoon("liesa");

        int hashcode2 = persoon.hashCode();

        int hashcode3 = pers2.hashCode();

        // Zelfde naam -> zelfde hashCode
        assertEquals(hashcode1, hashcode2, "De hashcodes moeten gelijk zijn");

        // Andere naam -> hier verwacht de cursus
        // een andere hashCode
        assertNotEquals(hashcode1, hashcode3, "De hashcodes moeten verschillend zijn");

    }





}
