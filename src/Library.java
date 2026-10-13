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

    public ArrayList<Book> getBooksUnderPrice(ArrayList<Book> bookList, int price) {
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

    public Book getMostExpensiveBook(ArrayList<Book> bookList) {
        if (bookList == null || bookList.isEmpty()) {
            return null;
        }

        Book expensiveBook = bookList.getFirst();
        for (Book book : bookList) {
            if (book.getPrice() > expensiveBook.getPrice()) {
                expensiveBook = book;
            }
        }
        return expensiveBook;
    }

    public ArrayList<Book> getBooksWithMinPages(ArrayList<Book> bookList, int minPages) {
        ArrayList<Book> matchingBooks = new ArrayList<>();
        for (Book book : bookList) {
            if (book.getPageCount() >= minPages) {
                matchingBooks.add(book);
            }
        }
        if (matchingBooks.isEmpty()) {
            System.out.println("There are no books with more than " + minPages + " Pages");
        }
        return matchingBooks;
    }

    public ArrayList<Book> getTwoBooksForBudget(ArrayList<Book> bookList, int budget) {
        ArrayList<Book> matchingBooks = new ArrayList<>();
        for (int i = 0; i < bookList.size() - 1; i++) {
            for (int j = 1; j < bookList.size(); j++) {
                if (bookList.get(i).getPrice() + bookList.get(j).getPrice() <= budget) {
                    if (!matchingBooks.isEmpty()) {
                        if (bookList.get(i).getPrice() + bookList.get(j).getPrice() > matchingBooks.getFirst().getPrice() + matchingBooks.getLast().getPrice()) {
                            matchingBooks.removeFirst();
                            matchingBooks.removeFirst();
                        } else if (bookList.get(i).getPrice() + bookList.get(j).getPrice() == matchingBooks.getFirst().getPrice() + matchingBooks.getLast().getPrice()) {
                            if (bookList.get(i).getPageCount() + bookList.get(j).getPageCount() > matchingBooks.getFirst().getPageCount() + matchingBooks.getLast().getPageCount()) {
                                matchingBooks.removeFirst();
                                matchingBooks.removeFirst();
                            } else {
                                continue;
                            }
                        } else {
                            continue;
                        }
                    }
                    matchingBooks.add(bookList.get(i));
                    matchingBooks.add(bookList.get(j));
                }
            }
        }
        if (matchingBooks.isEmpty()) {
            System.out.println("There is no book pair under " + budget + " Euro");
        }
        return matchingBooks;
    }
}
