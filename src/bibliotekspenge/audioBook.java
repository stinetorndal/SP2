package bibliotekspenge;

public class audioBook extends Title {
    private int durationInMinutes;



    public audioBook(String title, LiteraturType literatureType, int copies, int durationInMinutes) {
        super(title, literatureType, copies);
        this.durationInMinutes = durationInMinutes;
    }

    @Override
        protected double calculatePoints() {
        return (durationInMinutes * 0.5) *  getCopies();
    }

}
