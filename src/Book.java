public class Book {
    private final String title;
    private final String author;
    private final double price;
    private final int pageCount;

    public Book(String title, String author, double price, int pageCount) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public double getPrice() {
        return this.price;
    }

    public int getPageCount() {
        return this.pageCount;
    }
}
