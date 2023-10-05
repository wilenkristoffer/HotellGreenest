import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalmTest {



    //Testar waterPlantUträkning metoden i klassen Palm och kollar ifall man får korrekt resultat från
    //både Laura och Olof's uträkning.

    @Test
    void isCalculationCorrectLaura() {
        double mängdVätska = 0.5;
        double längdMeter = 5.0;
        double expectedOutput = mängdVätska * längdMeter;

        Palm laura = new Palm("laura", 5, 0.5);
        double actualOutput = laura.waterPlantUträkning();


        assertEquals(expectedOutput, actualOutput);
    }
    @Test
    void isCalculationCorrectOlof(){
        double mängdVätska = 0.5;
        double längdMeter = 1.0;
        double expectedOutput = mängdVätska * längdMeter;

        Palm olof = new Palm("olof", 1, 0.5);
        double actualOutput = olof.waterPlantUträkning();

        assertEquals(expectedOutput, actualOutput);

    }
}