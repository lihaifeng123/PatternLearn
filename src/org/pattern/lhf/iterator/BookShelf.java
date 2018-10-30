package org.pattern.lhf.iterator;

public class BookShelf implements Aggregate{
    private Book[] list;
    private int last=0;

    public BookShelf(int maxSize){
        this.list=new Book[maxSize];
    }
    public Book getBookAt(int index){
        return this.list[index];
    }
    public void appendBook(Book book){
        this.list[last]=book;
        last++;
    }
    public int getLength(){
        return last;
    }
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
