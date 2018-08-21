package practice.ch1_Iterator;

public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Effective Java"));
        bookShelf.appendBook(new Book("Head First Java"));
        bookShelf.appendBook(new Book("Thinking In Java"));
        bookShelf.appendBook(new Book("Agile Java"));
        bookShelf.appendBook(new Book("Effective Java"));
        bookShelf.appendBook(new Book("Head First Java"));
        bookShelf.appendBook(new Book("Thinking In Java"));
        bookShelf.appendBook(new Book("Agile Java"));
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book) it.next();
            System.out.println(book.getName());
        }
    }
}
