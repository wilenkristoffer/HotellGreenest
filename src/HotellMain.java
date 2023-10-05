import javax.swing.*;

public class HotellMain {
    public static void main(String[] args) {

            String växt = JOptionPane.showInputDialog("Vilken växt ska få mat?").toLowerCase().trim();

            //Instanser av objekt av varje växt
            Kaktus Igge = new Kaktus("igge", 0.2, 0.02);
            Köttätande MeatLoaf = new Köttätande("meatloaf", 0.7, 0.2);
            Palm Olof = new Palm("olof", 1, 0.5);
            Palm Laura = new Palm("laura", 5, 0.5);

            //If-satser som läser av Stringen "växt" och letar efter någon av de fyra växterna som finns i hotellet
            //om namnet matchar så sätts korrekt data och skickas vidare till respektive växters metod för uträkning och sedan utskrift.
            if (växt.contains(Igge.namn)) {
                Igge.setFöredragenVattentyp(WaterType.MINERALVATTEN);
                Igge.waterPlantUträkning();
                Igge.plantPrint();
            } else if (växt.contains(Laura.namn)) {
                Laura.setFöredragenVattentyp(WaterType.KRANVATTEN);
                Laura.waterPlantUträkning();
                Laura.plantPrint();
            } else if (växt.contains(MeatLoaf.namn)) {
                MeatLoaf.setFöredragenVattentyp(WaterType.PROTEINDRYCK);
                MeatLoaf.waterPlantUträkning();
                MeatLoaf.plantPrint();
            } else if (växt.contains(Olof.namn)) {
                Olof.setFöredragenVattentyp(WaterType.KRANVATTEN);
                Olof.waterPlantUträkning();
                Olof.plantPrint();
            }
            //Ifall användaren inte anget något, eller text som inte matchar växternas namn så får man detta felmeddelandet.
            else {
                JOptionPane.showMessageDialog(null,"Denna växt finns inte på det här hotellet!");
            }
    }
}