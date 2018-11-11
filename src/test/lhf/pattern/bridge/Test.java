package test.lhf.pattern.bridge;

import org.pattern.lhf.bridge.CountDisplay;
import org.pattern.lhf.bridge.Display;
import org.pattern.lhf.bridge.StringDisplayImpl;

public class Test {
    public static void main(String[] args){
        Display display=new Display(new StringDisplayImpl("Hello China."));
        CountDisplay countDisplay=new CountDisplay(new StringDisplayImpl("Hello Count"));
        display.display();
        countDisplay.display();
        countDisplay.multiDisplay(2);
    }
}
