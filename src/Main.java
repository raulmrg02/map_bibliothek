import java.util.ArrayList;

void main() {
    ArrayList<Book> books = new ArrayList<>();
    Book book1 = new Book("Clean Code", "Robert Martin", 45, 464);
    Book book2 = new Book("1984", "George Orwell", 18, 328);
    Book book3 = new Book("Animal Farm", "George Orwell", 12, 112);
    Book book4 = new Book("Java Basics", "Max Muller", 35, 520);
    Book book5 = new Book("The Hobbit", "J. R. R. Tolkien", 28, 310);
    books.add(book1);
    books.add(book2);
    books.add(book3);
    books.add(book4);
    books.add(book5);

    Library library = new Library(books);

    // 1
    String author = "George Orwell";
    System.out.println("Author: " + author);
    for (Book book : library.getBooksByAuthor(author)) {
        System.out.println(book.getTitle());
    }
    System.out.println();

    // 2
    ArrayList<Book> bookList = new ArrayList<>();
    bookList.add(book1);
    bookList.add(book2);
    bookList.add(book3);
    for (Book book : bookList) {
        System.out.println(book.getTitle());
    }
    System.out.println(library.getAveragePageCount(bookList));
    System.out.println();

    // 3
    double price = 30;
    System.out.println("Maximaler Preis: " + price + " Euro");
    for (Book book : library.getBooksUnderPrice(books, price)) {
        System.out.println(book.getTitle());
    }
    System.out.println();

    // 4
    bookList.removeFirst();
    bookList.add(book5);
    for (Book book : bookList) {
        System.out.println(book.getTitle());
    }
    Book mostExpensiveBook = library.getMostExpensiveBook(bookList);
    System.out.println(mostExpensiveBook.getTitle() + "(" + mostExpensiveBook.getPrice() + " Euro)");
    System.out.println();
}
