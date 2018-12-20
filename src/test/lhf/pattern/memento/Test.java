package test.lhf.pattern.memento;

import org.pattern.lhf.memento.Gamer;
import org.pattern.lhf.memento.Memento;

public class Test {
    public static void main(String[] args){
        Gamer gamer=new Gamer(100);
        Memento memento=gamer.createMemento();
        for(int i=0;i<100;i++){
            System.out.println("============ "+i);
            System.out.println("当前状态 ："+gamer);

            gamer.bet();

            System.out.println("所持有的金钱是 "+gamer.getMoney()+" YMB");
            if(gamer.getMoney()>memento.getMoney()){
                System.out.println("金钱增加，保存状态");
                memento=gamer.createMemento();
            }else if(gamer.getMoney()<memento.getMoney()/2){
                System.out.println("金钱减少 回复以前状态");
                gamer.restoreMemento(memento);
            }

            try {
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("FInsh");
    }
}
