package org.pattern.lhf.composite;

public abstract class Entity {
    public abstract  String getName();
    public abstract int getSize();
    public  Entity add(Entity entity) throws  FileTreatementException{
        throw new FileTreatementException();
    }
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName()+"("+getSize()+")";
    }
}
