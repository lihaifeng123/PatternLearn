package org.pattern.lhf.abstractfactory.listfactory;

import org.pattern.lhf.abstractfactory.factory.Item;
import org.pattern.lhf.abstractfactory.factory.Tray;

import java.util.Iterator;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<li>\n");
        buffer.append(caption+"\n");
        buffer.append("<ul>\n");
        Iterator iterator=tray.iterator();
        while (iterator.hasNext()){
            Item item=(Item)iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("</li>\n");
        return buffer.toString();
//        return null;
    }
}
