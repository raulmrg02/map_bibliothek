import java.util.Objects;
import java.util.ArrayList;

public class Library {
    private final ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public ArrayList<Book> getBooksByAuthor(String author) {
        ArrayList<Book> matchingBooks = new ArrayList<>();
        for (Book book : books) {
            if (Objects.equals(book.getAuthor(), author)) {
                matchingBooks.add(book);
            }
        }
        if (matchingBooks.isEmpty()) {
            System.out.println("No books found for author: " + author);
        }
        return matchingBooks;
    }

    public double getAveragePageCount(ArrayList<Book> bookList) {
        if (bookList == null || bookList.isEmpty()) {
            return 0.0;
        }

        int totalPages = 0;
        for (Book book : bookList) {
            totalPages += book.getPageCount();
        }

        double average = (double) totalPages / bookList.size();
        int fixedDecimalAverage = (int) (average * 100);
        return fixedDecimalAverage / 100.0;
    }

    public ArrayList<Book> getBooksUnderPrice(ArrayList<Book> bookList, double price) {
        ArrayList<Book> matchingBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getPrice() <= price) {
                matchingBooks.add(book);
            }
        }
        if (matchingBooks.isEmpty()) {
            System.out.println("There are no books under " + price + " Euro");
        }
        return matchingBooks;
    }
}
