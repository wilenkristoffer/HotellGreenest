import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeTest {

    Köttätande köttätande = new Köttätande();

    //Test för att kolla ifall man får ut korrekt svar när man använder metoder waterPlant.
    //I detta fall så ska vi få ut 0.24 för växten Meatloaf.
    @Test
    void isWaterAmountCalculatedCorrectly() {
        assert(Waterable.KÖTTÄTANDE_BASNIVÅ_KONSTANT
                + (köttätande.meatloafMängd * köttätande.meatloafLängd)
                == 0.24);
        assert(Waterable.KÖTTÄTANDE_BASNIVÅ_KONSTANT
                + (köttätande.meatloafMängd * köttätande.meatloafLängd)
                != 0.14);
    }
}