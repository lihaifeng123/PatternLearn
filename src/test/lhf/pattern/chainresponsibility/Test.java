package test.lhf.pattern.chainresponsibility;

import org.pattern.lhf.chainresponsibility.*;

public class Test {
    public static void main(String[] args){
        Support alice=new NoSupport("Alice");
        Support bob=new LimitSupport("Bob",100);
        Support elmo=new OddSupport("Elmo");
        Support fred=new LimitSupport("Fred",300);
        Support charlice=new SpecialSupport("Charlia",429);

        alice.setNext(bob).setNext(elmo).setNext(fred).setNext(charlice);

        for(int i=0;i<500;i+=33){
            alice.support(new Trouble(i));
        }
    }
}
