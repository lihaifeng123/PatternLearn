package org.pattern.lhf.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {
    protected Random random;
    private boolean won=false;
    private Hand prevHand;

    public WinningStrategy(int seed){
        random=new Random(seed);
    }
    @Override
    public Hand nextHand() {
        if(!won){
            prevHand=Hand.getHand(random.nextInt(3));
        }
        return prevHand;
//        return null;
    }

    @Override
    public void study(boolean win) {
        won=win;
    }
}
