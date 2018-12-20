package test.lhf.pattern.flyweight;

import org.pattern.lhf.flyweight.BigString;

public class Test {
    public static void main(String[] argv){
        String str="023";
        BigString bs=new BigString(str);
        bs.print();
    }
}
