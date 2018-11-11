package org.pattern.lhf.abstractfactory.listfactory;

import org.pattern.lhf.abstractfactory.factory.Factory;
//import org.pattern.lhf.abstractfactory.factory.Link;
//import org.pattern.lhf.abstractfactory.factory.Page;
//import org.pattern.lhf.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public ListLink createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public ListTray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public ListPage createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
