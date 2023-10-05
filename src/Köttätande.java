import javax.swing.*;

class Köttätande extends Växt implements Waterable {
    //Ej publika klasser så de inte kan användas utanför "paketet".(Inkapsling)

    //Köttätande växten har alltid en basnivå som är den samma, så den är inlagd som en konstant.
    protected final double BASNIVÅ = 0.1;
    protected double längd;
    protected double mängd;

    public double getLängd() {
        return längd;
    }

    public double getMängd() {
        return mängd;
    }

    public Köttätande(String namn, double längd, double mängd){
        this.namn = namn;
        this.längd = längd;
        this.mängd = mängd;
    }
    /* Metoden får in data från main programmet där användaren har angivit vilken växt som ska få mat.
           Där är data angivet från respektive växts längd & mängd vätska och sedan så kallar vi på
           waterPlantUträkning metoden för att göra uträkningen.
           Metod-överlagring är en form av Polymorphism*/
    @Override
    public double waterPlantUträkning() {
        return BASNIVÅ + (getMängd() * getLängd());
    }
    //Skriver ut namnet av växten och uträkningen till användaren.
    @Override
    public void plantPrint() {
        JOptionPane.showMessageDialog(null,getNamn() + " kommer att få " + waterPlantUträkning()
                //Använder enum typens tillsatta "värden" för att få utskrift av rätt typ av vatten.
                + " liter utav " + getFöredragenVattentyp().vattenTyp + " per dag.");
    }
}