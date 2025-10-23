package bibliotekspenge;

public enum LiteraturType  {
    TE(3.0),
    SKOEN(1.7),
    FAG(1.0);

    private final double value;

    LiteraturType(double value){
        this.value = value;
    }

    //------returnerer værdi fra LiteraturType------
    public double getValue(){
        return value;
    }
}
