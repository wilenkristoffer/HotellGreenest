import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KöttätandeTest {

    //Test för att kolla ifall man får ut korrekt svar när man använder metoden waterPlantUträkning i klassen Köttätande.

    @Test
    void isWaterAmountCalculatedCorrectly() {
        double basNivå = 0.1;
        double mängdVätska = 0.2;
        double längdMeter = 0.7;
        double expectedOutput = basNivå + mängdVätska * längdMeter;

        Köttätande köttätande = new Köttätande("meatloaf", 0.7, 0.2);
        double actualOutput = köttätande.waterPlantUträkning();


        assertEquals(expectedOutput, actualOutput);
    }
}