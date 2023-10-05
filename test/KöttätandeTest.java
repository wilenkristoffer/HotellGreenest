import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KöttätandeTest {

    Köttätande köttätande = new Köttätande("meatloaf", 0.7, 0.2);

    //Test för att kolla ifall man får ut korrekt svar när man använder metoden waterPlant i klassen Köttätande.
    //I detta fall så ska vi få ut 0.24 för växten Meatloaf.
    @Test
    void isWaterAmountCalculatedCorrectly() {
        double mängdVätska = 0.2;
        double längdMeter = 0.7;
        double expectedOutput = mängdVätska * längdMeter;

        Palm laura = new Palm("laura", 0.7, 0.2);
        double actualOutput = laura.waterPlantUträkning();


        assertEquals(expectedOutput, actualOutput);
    }
}