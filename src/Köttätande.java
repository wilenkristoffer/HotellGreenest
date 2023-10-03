class Köttätande extends Växt implements Waterable {
    //Ej publika klasser så de inte kan användas utanför "paketet".(Inkapsling)

    //Köttätande växten har alltid en basnivå som är den samma, så den är inlagd som en konstant.
    protected double KÖTTÄTANDE_BASNIVÅ_KONSTANT = 0.1;
    protected double meatloafLängd = 0.7;
    protected double meatloafMängd = 0.2;
    protected String meatloafNamn = "Meatloaf";

    //Konstruktor för att sätta vilken typ av vatten som växten använder.(enum) i WaterType filen.
    public Köttätande() {
        setFöredragenVattentyp(WaterType.PROTEINDRYCK);
    }

    /* Metoden får in data från main programmet där användaren har angivit vilken växt som ska få mat.
    Där är data angivet från respektive växts längd & mängd vätska och sedan så kallar vi på
    waterPlant metoden för att göra uträkningen. Metoden använder Getters från superklassen Växt.
    Tar även in en konstant variabel från Waterable interfacet.
    */
    @Override
    public void waterPlant() {
        double hurMycketVätska = KÖTTÄTANDE_BASNIVÅ_KONSTANT + (getMängdVätska() * getLängdMeter());
        System.out.println(getNamn() + " kommer att få " + hurMycketVätska
                //Använder enum typens tillsatta "värden" för att få utskrift av rätt typ av vatten.
                + " liter utav " + getFöredragenVattentyp().vattenTyp + " per dag.");
    }
}