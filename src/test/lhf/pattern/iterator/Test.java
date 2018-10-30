package test.lhf.pattern.iterator;

import org.pattern.lhf.iterator.Book;
import org.pattern.lhf.iterator.BookShelf;
import org.pattern.lhf.iterator.BookShelfIterator;

public class Test {
    public static void main(String[] args){
        BookShelf bookShelf=new BookShelf(10);
        bookShelf.appendBook(new Book("the Uml"));
        bookShelf.appendBook(new Book("Hello World"));
        bookShelf.appendBook(new Book("Electric"));

        BookShelfIterator iterator= (BookShelfIterator) bookShelf.iterator();
        while (iterator.hasNext()){
            Book book=(Book)iterator.next();
            System.out.println(book.getName());
        }
    }
}
