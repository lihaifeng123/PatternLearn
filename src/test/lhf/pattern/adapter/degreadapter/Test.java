package test.lhf.pattern.adapter.degreadapter;

import org.pattern.lhf.adapter.degreadapter.Print;
import org.pattern.lhf.adapter.degreadapter.PrintBanner;

public class Test {
    public static void main(String[] args){
        Print print=new PrintBanner("Hello");
        print.printStrong();
        print.printWeak();
    }
}
