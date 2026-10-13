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
}
