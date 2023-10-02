abstract public class Växt {

    protected double längdMeter;
    protected double mängdVätska;
    protected String namn;
    //föredragenVattentyp är en variabel av typen enums.
    protected WaterType föredragenVattentyp;

    //Variabler för data av längd och mängd vätska som varje växt är/behöver.
    //Variabler som dessa är till för att inte hårdkoda någon data. Allt är inlagt i variabler.
    protected double iggeLängd = 0.2;
    protected double iggeMängd = 0.02;
    protected double lauraLängd = 5;
    protected double lauraMängd = 0.5;
    protected double meatloafLängd = 0.7;
    protected double meatloafMängd = 0.2;
    protected double olofLängd = 1;
    protected double olofMängd = 0.5;

    //Variabler för växternas namn.
    protected String iggeNamn = "Igge";
    protected String lauraNamn = "Laura";
    protected String meatloafNamn = "Meatloaf";
    protected String olofNamn = "Olof";

    //Abstract metod som används av varje växt.
    //Polymorphism & inkapsling för att varje subklass måste använda denna metod.
    abstract void waterPlant();
    //Publika Getters & Setters för mängd/längd till metoderna som gör uträkningarna. Samt för utskrift av namnen.
    //Detta är också en form av inkapsling, precis som variablerna över är deklarerade som protected.
    public double getLängdMeter() {
        return this.längdMeter;
    }

    public double getMängdVätska() {
        return this.mängdVätska;
    }

    public String getNamn() {
        return namn;
    }

    public void setLängdMeter(double längdMeter) {
        this.längdMeter = längdMeter;
    }
    public void setMängdVätska(double mängdVätska) {
        this.mängdVätska = mängdVätska;
    }

    public void setNamn(String namn){
        this.namn = namn;
    }

    //Getter & setter till variabeln för enums.
    public WaterType getFöredragenVattentyp() {
        return föredragenVattentyp;
    }
    public void setFöredragenVattentyp(WaterType föredragenVattentyp) {
        this.föredragenVattentyp = föredragenVattentyp;
    }
}