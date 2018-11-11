package org.pattern.lhf.bridge;

public class Display {
    private DisplayImpl Impl;
    public Display(DisplayImpl display){
        this.Impl=display;
    }
    public void open(){
        Impl.rawOpen();
    }
    public void print(){
        Impl.rawPrint();
    }
    public void close(){
        Impl.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }
}
