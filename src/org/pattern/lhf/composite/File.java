package org.pattern.lhf.composite;

public class File extends Entity {
    private String name;
    public int size;
    public File(String name,int size){
        this.name=name;
        this.size=size;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
    }
}
