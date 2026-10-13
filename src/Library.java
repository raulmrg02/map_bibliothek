import java.util.Objects;

public class Library {
    private final Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public void getBooksByAuthor(String author) {
        boolean found = false;
        for (Book book : books) {
            if (Objects.equals(book.getAuthor(), author)) {
                found = true;
                System.out.println(book.getTitle());
            }
        }
        if(!found){
            System.out.println("No books found for author: " + author);
        }
    }

    public double getAveragePageCount(String[] titles) {
        int totalPageCount = 0;
        int matchingBookCount = 0;

        for (String title : titles) {
            for (Book book : books) {
                if (Objects.equals(book.getTitle(), title)) {
                    totalPageCount += book.getPageCount();
                    matchingBookCount++;
                    break;
                }
            }
        }

        if (matchingBookCount == 0) {
            return 0.0;
        }

        double average = (double) totalPageCount / matchingBookCount;
        int fixedDecimalAverage = (int) (average * 100);
        return fixedDecimalAverage / 100.0;
    }
}
