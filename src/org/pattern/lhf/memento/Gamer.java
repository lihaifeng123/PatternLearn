package org.pattern.lhf.memento;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List fruits=new ArrayList();
    private Random random=new Random();
    private static String[] fruitsname={"苹果","葡萄","香蕉","橘子"};
    public Gamer(int money){
        this.money=money;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public List getFruits() {
        return fruits;
    }
    public void  bet(){
        int dict=random.nextInt(6)+1;
        if(dict==1){
            money+=100;
            System.out.println("金钱增加");
        }else if(dict==2){
            money/=2;
            System.out.println("金钱减少一半");
        }else if(dict==6){
            String f=getFruit();
            System.out.println("获取水果("+f+")");
            fruits.add(f);
        }else{
            System.out.println("什么都没有发生");
        }
    }

    public Memento createMemento(){
        Memento m=new Memento(money);
        Iterator iterator=fruits.iterator();
        while (iterator.hasNext()){
            String f=(String) iterator.next();
            if(f.startsWith("好吃的")){
                m.addFruits(f);
            }
        }
        return m;
    }
    public void restoreMemento(Memento memento){
        this.money=memento.getMoney();
        this.fruits=memento.getFruits();
    }
    @Override
    public String toString() {
        return "[memony = "+money+" ,fruits="+fruits+"]";
    }

    public String getFruit() {
        String prefix="";
        if(random.nextBoolean()){
            prefix="好吃的 ";
        }
        return prefix+fruitsname[random.nextInt(fruitsname.length)];
    }

    public void setFruits(List fruits) {
        this.fruits = fruits;
    }
}
