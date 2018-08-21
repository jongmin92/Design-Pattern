package practice.ch1_Iterator;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {
    private List<Book> books;

    public BookShelf(int initialSize) {
        books = new ArrayList(initialSize);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        this.books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
