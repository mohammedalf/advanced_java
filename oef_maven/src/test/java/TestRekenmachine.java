import be.kdg.week5_Testen_Logging.testing.Rekenmachine;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRekenmachine {

    private Rekenmachine rekenmachine;
    //wordt VOOR ELKE test opnieuw uitgevoerd
    @BeforeEach
    public void voorElkeTest() {
        rekenmachine = new Rekenmachine();
    }

    // Wordt NA ELKE test uitgevoerd
    @AfterEach
    public void naElkeTest() {
        System.out.println("Weer een test gedaan!");
    }


    @Test
    public void sommeer(){

        //act
        double resultaat = rekenmachine.sommeer(10, 50);

        //Assert
        assertEquals(60, resultaat, "som 10 en 50 moet 60 zijn");
    }

    @Test
    public void sommeer2() {

        int nr1 = 10;
        int nr2 = 50;

        double resultaat = rekenmachine.sommeer(nr1, nr2);

        int expected = 60;

        assertEquals(
                expected,
                resultaat,

                // Deze lambda wordt enkel uitgevoerd
                // wanneer de test faalt
                () -> String.format(
                        "De som van %d en %d moet %d zijn",
                        nr1,
                        nr2,
                        expected
                )
        );
    }

    @Test
    public void vermenigvuldig(){
        double resultaat = rekenmachine.vermenigvuldig(10, 50);

        assertEquals(500, resultaat, "Het product moet <500> zijn");
    }
}
