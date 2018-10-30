package test.lhf.pattern.factory;

import org.pattern.lhf.factory.framework.Factory;
import org.pattern.lhf.factory.framework.Product;
import org.pattern.lhf.factory.idcard.IDCardFactory;

public class Test {
    public static void main(String[] args){
        Factory factory=new IDCardFactory();
        Product card1=factory.create("xiaoming");
        Product card2=factory.create("xiaohung");
        Product card3=factory.create("xiaogang");
        card1.use();
        card2.use();
        card3.use();
    }
}
