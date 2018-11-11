package test.lhf.pattern.abstractfactory.factory;

import org.pattern.lhf.abstractfactory.factory.Factory;
import org.pattern.lhf.abstractfactory.factory.Link;
import org.pattern.lhf.abstractfactory.factory.Page;
import org.pattern.lhf.abstractfactory.factory.Tray;
import org.pattern.lhf.abstractfactory.listfactory.ListFactory;
public class Test {
    public static void main(String[] args){
        Factory factory=Factory.getFactory("ListFactory");
        Link people=factory.createLink("人们日报","https://www.people.com.cn");
        Link gmw=factory.createLink("光明日报","http://www.gmw.cn");

        Tray tray=factory.createTray("日报");
        tray.add(people);
        tray.add(gmw);

        Page page=factory.createPage("Link","Ljf");
        page.add(tray);

        page.output();
    }
}
