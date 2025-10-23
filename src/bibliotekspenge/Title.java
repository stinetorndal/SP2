package bibliotekspenge;

//------superklasse------
public abstract class Title {
    private String title;
    private LiteraturType literatureType;
    //------copies flyttet til superklasse, da den i uml optrådte i begge subklasser------
    private int copies;
    private static final double RATE = 0.067574;

    Title(String title, LiteraturType literatureType, int copies) {
        this.title = title;
        this.literatureType = literatureType;
        this.copies = copies;
    }

    double calculateRoyalty() {
        return calculatePoints() * RATE;
    }

    protected int getCopies(){
        return copies;
    }
    protected double convertLiteraturType(){
        return literatureType.getValue(); //henter værdi fra enum
    }
    String getTitle() {
        return title;
    }
    //------metode dikteret i opgave------
    protected abstract double calculatePoints();

    /*protected double convertLiteratureType() {
        //------switch der håndterer de forskellige litteraturtyper------
        return switch (literatureType.toUpperCase()) {
            case "SKØN" -> 1.7;
            case "FAG" -> 1.0;
            case "TE" -> 3;
            default -> 1.0;
        };*/
    }





