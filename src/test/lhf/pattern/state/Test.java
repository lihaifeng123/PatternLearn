package test.lhf.pattern.state;

import org.pattern.lhf.state.SafeFrame;

public class Test {
    public static void main(String[] argv){
        SafeFrame frame=new SafeFrame("State Frame!");
        while (true){
            for(int hour=0;hour<24;hour++){
                frame.setClock(hour);
                try{
                    Thread.sleep(100);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
