package org.pattern.lhf.chainresponsibility;

public class Trouble {
    private int number;

    public Trouble(int number){
        this.number=number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble "+number+"]";
    }
}
