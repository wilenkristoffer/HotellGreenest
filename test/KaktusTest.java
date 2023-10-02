import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    public Kaktus kaktus = new Kaktus();
//Eftersom Igge är den enda kaktusen och bara använder sig utav förutbestämd data,
// så kunde jag inte testa mer än att kolla ifall att jag har lagt in rätt mängd och längd för Igge.
    @Test
    void isCalculationCorrect() {
        assert(kaktus.iggeLängd == 0.2);
        assert(kaktus.iggeMängd == 0.02);
    }
}