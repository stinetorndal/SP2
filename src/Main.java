import bibliotekspenge.*;

public class Main {
    static void main() {
        Author author = new Author("Dan Simmons");

        Title Book = new printedBook("Hyperion", LiteraturType.SKOEN, 34, 383);
        Title audioBook = new audioBook("Hyperion", LiteraturType.SKOEN, 34,1311);
        Title Book1 = new printedBook("Hyperions sejr",LiteraturType.SKOEN, 31, 429);
        Title audioBook1 = new audioBook("Hyperions sejr", LiteraturType.SKOEN, 31, 1336);

        Author author1 = new Author("Robert Galbraith");

        Title Book2 = new printedBook("Den stemplede mand", LiteraturType.SKOEN, 90, 996);
        Title audioBook2 = new audioBook("Den stemplede mand", LiteraturType.SKOEN, 90, 1760);

        Author author2 = new Author("Bill Watterson");

        Title Book3 = new printedBook("Bare for sjov", LiteraturType.TE, 54, 48);

        Author author3= new Author("Persille Ingerslev");

        Title Book4 = new printedBook("Gendyrk - flere porrer til folket", LiteraturType.FAG, 100, 214);

        author.addTitle(Book);
        author.addTitle(audioBook);
        author.addTitle(Book1);
        author.addTitle(audioBook1);

        author1.addTitle(Book2);
        author1.addTitle(audioBook2);
        author2.addTitle(Book3);
        author3.addTitle(Book4);

        author.printRoyalties();
        author1.printRoyalties();
        author2.printRoyalties();
        author3.printRoyalties();

    }
}