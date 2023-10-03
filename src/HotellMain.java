import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HotellMain {
    public static void main(String[] args) {
        //Koden är inlagt i en try & catch för hantera eventuella fel.
        try {
            System.out.println("Vilken växt ska få mat?");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            //Läser in-data med hjälp av BufferedReader till strängen "växt" och konverterar till lower-case
            String växt = bufferedReader.readLine().toLowerCase().trim();

            //Instanser av objekt av varje växt
            Kaktus Igge = new Kaktus();
            Köttätande MeatLoaf = new Köttätande();
            Palm Olof = new Palm();
            Palm Laura = new Palm();

            //If-satser som läser av Stringen "växt" och letar efter någon av de fyra växterna som finns i hotellet
            //om namnet matchar så sätts korrekt data och skickas vidare till respektive växters metod för uträkning och sedan utskrift.
            if (växt.contains("igge")) {
                Igge.setNamn(Igge.iggeNamn);
                Igge.setLängdMeter(Igge.iggeLängd);
                Igge.setMängdVätska(Igge.iggeMängd);
                Igge.waterPlant();
            } else if (växt.contains("laura")) {
                Laura.setNamn(Laura.lauraNamn);
                Laura.setLängdMeter(Laura.lauraLängd);
                Laura.setMängdVätska(Laura.lauraMängd);
                Laura.waterPlant();
            } else if (växt.contains("meatloaf")) {
                MeatLoaf.setNamn(MeatLoaf.meatloafNamn);
                MeatLoaf.setLängdMeter(MeatLoaf.meatloafLängd);
                MeatLoaf.setMängdVätska(MeatLoaf.meatloafMängd);
                MeatLoaf.waterPlant();
            } else if (växt.contains("olof")) {
                Olof.setNamn(Olof.olofNamn);
                Olof.setLängdMeter(Olof.olofLängd);
                Olof.setMängdVätska(Olof.olofMängd);
                Olof.waterPlant();
            }
            //Ifall användaren inte anget något, eller text som inte matchar växternas namn så får man detta felmeddelandet.
            else {
                System.out.println("Denna växt finns inte på det här hotellet");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}