public enum WaterType {
    //enum för olika typer av vatten som används, eftersom dessa typer alltid är densamma.
    KRANVATTEN("kranvatten"),
    MINERALVATTEN("mineralvatten"),
    PROTEINDRYCK("proteindryck");

    public final String vattenTyp;

    //Konstruktor som varje växt kallar på när vi sätter värdet på vilken typ av vatten vi använder för den växten.
    WaterType(String typ) {
        vattenTyp = typ;
    }
}
