package test.lhf.pattern.template;

import org.pattern.lhf.template.AbstractDisplay;
import org.pattern.lhf.template.CharDisplay;
import org.pattern.lhf.template.StringDisplay;

public class Test {
    public static void main(String[] args){
        AbstractDisplay display=new CharDisplay('H');
        AbstractDisplay display1=new StringDisplay("Hello World");
        display.display();
        display1.display();
    }
}
