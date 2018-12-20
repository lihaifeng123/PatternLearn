package test.lhf.pattern.decorator;

import org.pattern.lhf.decorator.Display;
import org.pattern.lhf.decorator.FullBorder;
import org.pattern.lhf.decorator.SideBorder;
import org.pattern.lhf.decorator.StringDisplay;

public class Test {
    public static void main(String[] argv){
        Display display=new StringDisplay("Hello World!");
        Display display1=new SideBorder(display,'#');
        Display display2=new FullBorder(display1);
        display.show();
        display1.show();
        display2.show();
        Display display3=new SideBorder(new FullBorder(
                new FullBorder(
                        new SideBorder(
                                new FullBorder(
                                        new StringDisplay("你好，世界!")
                                ),
                                '*'
                        )
                )
        ),
                '/');
        display3.show();
    }
}
