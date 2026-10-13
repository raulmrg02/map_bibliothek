void main() {
    Book[] books = {
            new Book("Clean Code", "Robert Martin", 45, 464),
            new Book("1984", "George Orwell", 18, 328),
            new Book("Animal Farm", "George Orwell", 12, 112),
            new Book("Java Basics", "Max Muller", 35, 520),
            new Book("The Hobbit", "J. R. R. Tolkien", 28, 310)
    };
    Library library = new Library(books);
    String author = "George Orwell";
    System.out.println("Author: " + author);
    library.getBooksByAuthor("George Orwell");
}
