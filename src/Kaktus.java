class Kaktus extends Växt implements Waterable {
    //Ej publika klasser så de inte kan användas utanför "paketet".(Inkapsling)
    protected String iggeNamn = "Igge";
    protected double iggeLängd = 0.2;
    protected double iggeMängd = 0.02;

    //Konstruktor för att sätta vilken typ av vatten som växten använder.(enum) i WaterType filen.
    public Kaktus() {
        setFöredragenVattentyp(WaterType.MINERALVATTEN);
    }

    /* Metoden får in data från main programmet där användaren har angivit vilken växt som ska få mat.
    Där är data angivet från respektive växts längd & mängd vätska och sedan så kallar vi på
    waterPlant metoden för att göra uträkningen. Metoden använder Getters från superklassen Växt.
    */
    @Override
    public void waterPlant() {
        System.out.println(getNamn() + " kommer att få " + getMängdVätska() + " liter utav "
                //Använder enum typens tillsatta "värden" för att få utskrift av rätt typ av vatten.
                + getFöredragenVattentyp().vattenTyp + " per dag.");
    }
}