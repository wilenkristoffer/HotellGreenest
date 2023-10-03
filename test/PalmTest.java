import org.junit.jupiter.api.Test;

class PalmTest {
    Palm laura = new Palm("laura", 5, 0.5);
    Palm olof = new Palm("olof", 1, 0.5);

    //Testar waterPlant metoden i klassen Palm och kollar ifall man får korrekt resultat från
    //både Laura och Olof's waterPlant uträkning.
    //Laura's resultat ska vara 2.5 och Olof's resultat ska vara 0.5
    @Test
    void isCalculationCorrectLaura() {
        assert(laura.mängd * laura.längd == 2.5);
        assert(laura.mängd * laura.längd != 1.5);
    }
    @Test
    void isCalculationCorrectOlof(){
        assert(olof.mängd * olof.längd == 0.5);
        assert(olof.mängd * olof.längd != 0);
    }
}