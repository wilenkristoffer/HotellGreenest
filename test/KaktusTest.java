import org.junit.jupiter.api.Test;

class KaktusTest {

    public Kaktus kaktus = new Kaktus("igge", 0.2, 0.02);
//Test för att kolla ifall att jag har lagt in rätt mängd och längd för Igge. Då Igge inte kräver någon uträkning.
    @Test
    void isInputCorrect() {
        assert(kaktus.getLängd() == 0.2);
        assert(kaktus.getMängd() == 0.02);
        assert(kaktus.getLängd() != 0.1);
        assert(kaktus.getMängd() != 0.01);
    }
}