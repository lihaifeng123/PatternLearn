package test.lhf.pattern.adapter.extendadapter;

import org.pattern.lhf.adapter.extendadapter.Print;
import org.pattern.lhf.adapter.extendadapter.PrintBanner;

public class Test {
    public static void main(String[] args){
        Print p=new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
