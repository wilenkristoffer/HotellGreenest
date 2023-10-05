abstract public class Växt {
    protected String namn;

    //föredragenVattentyp är en enum typ från WaterType.
    protected WaterType föredragenVattentyp;

    //Publik Getter
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