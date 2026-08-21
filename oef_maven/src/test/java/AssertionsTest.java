import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTest {
    @Test
    public void testEquals() {

        int resultaat = 10 + 20;

        assertEquals(30, resultaat);

        assertNotEquals(40, resultaat);
    }
    @Test
    public void testDoubleMetDelta() {

        double resultaat = 10.001;

        assertEquals(
                10.0,       // expected
                resultaat,  // actual
                0.01        // toegelaten afwijking
        );
    }
    //assertSame / assertNotSame
    @Test
    public void testSame() {
        StringBuilder object1 = new StringBuilder("Hallo");

        StringBuilder object2 = object1;

        StringBuilder object3 = new StringBuilder("Hallo");

        // Exact dezelfde objectreferentie
        assertSame(object1, object2);

        // Verschillende objecten in het geheugen
        assertNotSame(object1, object3);
    }

    //assertTrue / assertFalse
    @Test
    public void testBoolean() {

        int leeftijd = 20;

        assertTrue(leeftijd >= 18);

        assertFalse(leeftijd < 18);
    }

    //assertNull / assertNotNull
    @Test
    public void testNull() {

        String tekst = null;

        assertNull(tekst);


        tekst = "Java";

        assertNotNull(tekst);
    }

    //assertArrayEquals
    @Test
    public void testArrays() {

        int[] expected = {1, 2, 3};

        int[] actual = {1, 2, 3};

        assertArrayEquals(expected, actual);
    }

    //assertIterableEquals
    @Test
    public void testLists() {

        List<String> expected =
                List.of("A", "B", "C");

        List<String> actual =
                List.of("A", "B", "C");

        assertIterableEquals(expected, actual);
    }

    //assertThrows
    @Test
    public void testException() {

        assertThrows(
                ArithmeticException.class,

                () -> {
                    int resultaat = 10 / 0;
                },

                "Delen door nul moet een exception geven"
        );
    }

    //assertTimeout
    @Test
    public void testTimeout() {

        assertTimeout(
                Duration.ofMillis(100),

                () -> {
                    // Deze code moet binnen 100 ms klaar zijn
                    int resultaat = 10 + 20;
                }
        );
    }

    //assertAll
    @Test
    public void testAllesTegelijk() {

        List<Integer> numbers =
                List.of(2, 3, 5, 7);

        assertAll(

                () -> assertEquals(
                        2,
                        numbers.get(0)
                ),

                () -> assertEquals(
                        3,
                        numbers.get(1)
                ),

                () -> assertEquals(
                        5,
                        numbers.get(2)
                ),

                () -> assertEquals(
                        7,
                        numbers.get(3)
                )
        );
    }

    //fail()
    @Test
    public void testFail() {

        boolean probleem = false;

        if (probleem) {
            fail("Er is iets fout gegaan");
        }
    }

}
