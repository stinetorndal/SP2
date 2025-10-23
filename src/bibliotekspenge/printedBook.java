package bibliotekspenge;

public class printedBook extends Title {
    private int pages;


    public printedBook(String title, LiteraturType literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;

    }

    @Override
    protected double calculatePoints() {
        return pages * getCopies();
    }
}
