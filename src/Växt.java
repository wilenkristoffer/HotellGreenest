abstract public class Växt {
    protected double längdMeter;
    protected double mängdVätska;
    protected String namn;

    //föredragenVattentyp är en enum typ från WaterType.
    protected WaterType föredragenVattentyp;

    //Abstract metod som används av varje växt.
    //Polymorphism & inkapsling för att varje subklass måste använda denna metod.
    abstract void waterPlant();

    //Publika Getters & Setters för mängd/längd till metoderna som gör uträkningarna. Samt för utskrift av namnen.
    //Detta är också en form av inkapsling.
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

    public void setNamn(String namn) {
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