import javax.swing.*;

class Kaktus extends Växt implements Waterable {
    //Ej publika klasser så de inte kan användas utanför "paketet".(Inkapsling)
    protected double längd;
    protected double mängd;

    public double getMängd() {
        return mängd;
    }

    public double getLängd() {
        return längd;
    }

    public Kaktus(String namn, double längd, double mängd){
        this.namn = namn;
        this.längd = längd;
        this.mängd = mängd;
    }

    /* Metoden får in data från main programmet där användaren har angivit vilken växt som ska få mat.
        Där är data angivet från respektive växts längd & mängd vätska och sedan så kallar vi på
        waterPlant metoden för att göra uträkningen. Metoden använder Getters från superklassen Växt.
        */
    @Override
    public double waterPlantUträkning() {
        return getMängd();

    }

    @Override
    public void plantPrint() {
        JOptionPane.showMessageDialog(null,getNamn() + " kommer att få " + waterPlantUträkning() + " liter utav "
                //Använder enum typens tillsatta "värden" för att få utskrift av rätt typ av vatten.
                + getFöredragenVattentyp().vattenTyp + " per dag.");
    }
}