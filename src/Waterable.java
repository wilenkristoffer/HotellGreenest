public interface Waterable {

    //Köttätande växten har alltid en basnivå som är den samma, så den är inlagd som en konstant.
    double KÖTTÄTANDE_BASNIVÅ_KONSTANT = 0.1;

    //Ser till att varje klass som implementerar Waterable har en waterPlant metod.
    void waterPlant();
}
