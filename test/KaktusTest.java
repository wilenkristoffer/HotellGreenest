import org.junit.jupiter.api.Test;


class KaktusTest {

    public Kaktus kaktus = new Kaktus("igge", 0.2, 0.02);
//Test för att kolla ifall att jag har lagt in rätt mängd och längd för Igge. Då Igge inte kräver någon uträkning.
    @Test
    void isInputCorrect() {
        assert(kaktus.längd == 0.2);
        assert(kaktus.mängd == 0.02);
        assert(kaktus.längd != 0.1);
        assert(kaktus.mängd != 0.01);
    }
}