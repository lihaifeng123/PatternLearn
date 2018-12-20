package org.pattern.lhf.visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry {
    private String name;
    private ArrayList dir=new ArrayList();
    public Directory(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator iterator=dir.iterator();
        while (iterator.hasNext()){
            Entry entry=(Entry) iterator.next();
            size+=entry.getSize();
        }
        return size;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatementException {
        dir.add(entry);
        return this;
    }

    @Override
    public Iterator iterator() throws FileTreatementException {
        return dir.iterator();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.Visit(this);
    }
}
