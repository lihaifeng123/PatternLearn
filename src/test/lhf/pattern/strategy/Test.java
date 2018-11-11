package test.lhf.pattern.strategy;

import org.pattern.lhf.strategy.Hand;
import org.pattern.lhf.strategy.Player;
import org.pattern.lhf.strategy.ProbStrategy;
import org.pattern.lhf.strategy.WinningStrategy;

public class Test {
    public static void main(String[] argv){
        int seed1=10;
        int seed2=20;
        Player player=new Player("Taro",new WinningStrategy(seed1));
        Player player1=new Player("Hana",new ProbStrategy(seed2));
        for(int i=0;i<1000;i++){
            Hand nextHand1=player.nextHand();
            Hand nextHand2=player1.nextHand();
            if(nextHand1.isStrongerThan(nextHand2)){
                System.out.println("winner:"+player);
                player.win();
                player1.lose();
            }else if(nextHand1.isWeakerThan(nextHand2)){
                System.out.println("winner:"+player1);
                player1.win();
                player.lose();
            }else{
                System.out.println("even");
                player1.even();
                player.even();
            }
        }
        System.out.println("Result:");
        System.out.println(player);
        System.out.println(player1);
    }
}
