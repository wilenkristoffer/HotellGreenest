class Palm extends Växt implements Waterable{
//Ej publika klasser så de inte kan användas utanför "paketet".(Inkapsling)

    //Konstruktor för att sätta vilken typ av vatten som växten använder.(enums) i WaterType filen.
    public Palm() {
        setFöredragenVattentyp(WaterType.KRANVATTEN);
    }
    /* Metoden får in data från main programmet där användaren har angivit vilken växt som ska få mat.
    Där är data angivet från respektive växts längd & mängd vätska och sedan så kallar vi på
    waterPlant metoden för att göra uträkningen. Metoden använder Getters från superklassen Växt.
    Metod-överlagring är en form av Polymorphism*/
    @Override
    public void waterPlant() {
        double hurMycketVätska = getMängdVätska() * getLängdMeter();
        System.out.println(getNamn() + " kommer att få " + hurMycketVätska
                //Använder enums variablernas tillsatta "värden" för att få utskrift av rätt typ av vatten.
                + " liter utav " + getFöredragenVattentyp().vattenTyp + " per dag.");
    }
}