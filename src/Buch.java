public class Buch {
    private final String titel;
    private final String author;
    private final double preis;
    private final int anzahlSeiten;

    public Buch(String titel, String author, double preis, int anzahlSeiten) {
        this.titel = titel;
        this.author = author;
        this.preis = preis;
        this.anzahlSeiten = anzahlSeiten;
    }

    public String getTitel() {
        return this.titel;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPreis() {
        return this.preis;
    }

    public int getAnzahlSeiten() {
        return this.anzahlSeiten;
    }
}
