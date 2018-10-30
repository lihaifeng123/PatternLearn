package org.pattern.lhf.iterator;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index=0;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
        this.index=0;
    }
    @Override
    public boolean hasNext() {
        if(index<this.bookShelf.getLength()){
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Book book=bookShelf.getBookAt(index);
        this.index++;
        return book;
    }
}
