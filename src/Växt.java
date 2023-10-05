abstract public class Växt {
    //Gemensamma egenskaper är deklarerade här, en typ av polymorphism.
    protected String namn;

    //föredragenVattentyp är en enum typ från WaterType.
    protected WaterType föredragenVattentyp;

    //Publika Getters & Setters för mängd/längd till metoderna som gör uträkningarna. Samt för utskrift av namnen.
    //Detta är också en form av inkapsling och polymorphism.

    public String getNamn() {
        return namn;
    }


    //Getter & setter till variabeln för enums.
    public WaterType getFöredragenVattentyp() {
        return föredragenVattentyp;
    }

    public void setFöredragenVattentyp(WaterType föredragenVattentyp) {
        this.föredragenVattentyp = föredragenVattentyp;

    }
}