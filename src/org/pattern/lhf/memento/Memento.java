package org.pattern.lhf.memento;

import java.util.ArrayList;
import java.util.List;

public class Memento {
    private int money;
    private ArrayList fruits;

    public Memento(int money){
        this.money=money;
        this.fruits=new ArrayList();
    }
    public void setMoney(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
    public void addFruits(String fruit){
        fruits.add(fruit);
    }
    public List getFruits() {
        return (List) fruits.clone();
    }

    public void setFruits(ArrayList fruits) {
        this.fruits = fruits;
    }
}
