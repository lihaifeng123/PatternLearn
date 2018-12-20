package org.pattern.lhf.composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entity {
    private String name;
    private ArrayList directory=new ArrayList();
    public Directory(String name){
        this.name=name;
    }
    @Override
    public String getName() {
        return name;
    }
    public  Entity add(Entity entity) throws  FileTreatementException{
        this.directory.add(entity);
        return this;
//        throw new FileTreatementException();
    }

    @Override
    public int getSize() {
        int size=0;
        Iterator iterator=directory.iterator();
        while (iterator.hasNext()){
            Entity entity=(Entity)iterator.next();
            size+=entity.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        Iterator iterator=directory.iterator();
        while ((iterator.hasNext())){
            Entity entity=(Entity)iterator.next();
            entity.printList(prefix+"/"+name);
        }
    }
}
