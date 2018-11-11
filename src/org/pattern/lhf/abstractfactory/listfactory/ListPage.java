package org.pattern.lhf.abstractfactory.listfactory;

import org.pattern.lhf.abstractfactory.factory.Item;
import org.pattern.lhf.abstractfactory.factory.Page;

import java.util.Iterator;
//import org.pattern.lhf.iterator.Iterator;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer=new StringBuffer();
        buffer.append("<html><head><title>"+title+"</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>"+title+"</h1>\n");
        buffer.append("<ul>\n");

        Iterator iterator=content.iterator();
        while(iterator.hasNext()){
            Item item=(Item)iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr><address>"+author+"</address>");
        buffer.append("</body></html>\n");
        return buffer.toString();
//        return null;
    }
}
