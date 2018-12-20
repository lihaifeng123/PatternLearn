package test.lhf.pattern.observer;

import org.pattern.lhf.observer.*;

public class Test {
    public static void main(String[] args){
        NumberGenerator generator=new RandomNumberGenerator();
        Observer observer=new DigitObserver();
        Observer observer1=new GraphObserver();
        generator.addObserver(observer);
        generator.addObserver(observer1);
        generator.execute();
    }
}
