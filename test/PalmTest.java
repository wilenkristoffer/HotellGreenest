import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm palm = new Palm();

    //Testar waterPlant metoden i klassen Palm och kollar ifall man fått korrekt resultat från
    //både Laura och Olof's waterPlant uträkning.
    @Test
    void isCalculationRightLaura() {
        assert(palm.lauraMängd * palm.lauraLängd == 2.5);
        assert(palm.lauraMängd * palm.lauraLängd != 1.5);
    }
    @Test
    void isCalculationRightOlof(){
        assert(palm.olofMängd * palm.olofLängd == 0.5);
        assert(palm.olofMängd * palm.olofLängd != 0);
    }
}